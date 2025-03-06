package com.scripted.email;


import org.testng.Assert;

import com.scripted.dataload.PropertyDriver;

import jakarta.mail.Flags;
import jakarta.mail.Flags.Flag;
import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.NoSuchProviderException;
import jakarta.mail.Session;
import jakarta.mail.Store;
import jakarta.mail.search.FlagTerm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class EmailUtils {

	public static String returnOTPData() {

		String searchText = "";
		try {

			String emailProp = "\\src\\main\\resources\\Reporting\\Email\\Email.properties";
			PropertyDriver emailProperty = new PropertyDriver();
			emailProperty.setPropFilePath(emailProp);

			String mailuser = PropertyDriver.readProp("mail.user");
			String mailpassword = PropertyDriver.readProp("mail.password");

			String host = PropertyDriver.readProp("mail.imap.host");
			String port = PropertyDriver.readProp("mail.imap.port");
			int intport = Integer.parseInt(port);

			Properties properties = new Properties();
			properties.put("mail.imap.host", host);
			properties.put("mail.imap.port", intport);
			properties.put("mail.imap.starttls.enable", "true");
			properties.put("mail.imap.ssl.trust", host);

			Session emailSession = Session.getDefaultInstance(properties);

			Store store = emailSession.getStore("imaps");
			store.connect(host, mailuser, mailpassword);

			// create the inbox object and open it
			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_WRITE);
			// retrieve the messages from the folder in an array and print it
			Message[] messages = inbox.search(new FlagTerm(new Flags(Flag.SEEN), false));
			System.out.println("messages.length---" + messages.length);

			for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
				message.setFlag(Flag.SEEN, true);
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
				if (message.getSubject().contains("HomelyukB2C account email verification code")) {
					System.out.println("OTP mail found");

					String line;

					StringBuffer buffer = new StringBuffer();

					BufferedReader reader = new BufferedReader(new InputStreamReader(message.getInputStream()));

					while ((line = reader.readLine()) != null) {

						buffer.append(line);

					}

					String messageContent = "Your code is:";

					String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));

					searchText = result.substring(messageContent.length(), messageContent.length() + 7);

					System.out.println("Text found : " + searchText);

					message.setFlag(Flags.Flag.SEEN, true);

					break;

				}

			}

			inbox.close(false);
			store.close();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchText;
	}

	public static void validateGmailInbox(String messge) throws IOException {
		String emailProp = "\\src\\main\\resources\\Email\\mail.properties";
		PropertyDriver emailProperty = new PropertyDriver();
		emailProperty.setPropFilePath(emailProp);

		String host = PropertyDriver.readProp("mail.imap.host");
		String port = PropertyDriver.readProp("mail.imap.port");
		String mailuser = PropertyDriver.readProp("mail.user");
		String mailpassword = PropertyDriver.readProp("mail.password");
		int intport = Integer.parseInt(port);

		try (FileReader reader = new FileReader(PropertyDriver.getFilePath())) {
			Properties prop = new Properties();
			prop.load(reader);
			Session mailSession = Session.getDefaultInstance(prop);
			Store store = mailSession.getStore("imaps");
			store.connect(host, intport, mailuser, mailpassword);
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_WRITE);
			Flags seen = new Flags(Flags.Flag.SEEN);
			FlagTerm unseenFlagTerm = new FlagTerm(seen, false);
			Message messages[] = inbox.search(unseenFlagTerm);

			// Todo -- > Change the class to generic after POC
			if (messages.length == 0) {
				Assert.fail("There is no unread mails in the inbox");
				System.out.println("No messages found.");
			} else {
				for (int i = 0; i < messages.length; i++) {
					String Fromid = messages[i].getFrom()[0].toString();
					String subject = messages[i].getSubject();
					if (Fromid.equalsIgnoreCase("lk2712.svcs@gmail.com")
							&& subject.equalsIgnoreCase("-No-Reply- Shopping Details")) {
						String body = messages[i].getContent().toString();
						if (body.contains("Your Order has been placed successfully.")) {
							System.out.println("Your Order has been placed successfully.");

						} else {
							Assert.fail(messge + " doesnot contains in the mail");

						}

					}

				}
			}

			inbox.close(true);
			store.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}