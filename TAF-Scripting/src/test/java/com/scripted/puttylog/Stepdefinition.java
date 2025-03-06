package com.scripted.puttylog;

import org.testng.Assert;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.scripted.putty.PuttyUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {  
String host;
String username; 
String password; 
String[] commands= {"cd /appl/acr/ps/jrnl/01/detl/ && getfgen","cat /appl/acr/ps/jrnl/01/detl/detail."};
String fileName;
Session session ;
String id;
	@Given("I have a server with logs")
	public void i_have_a_server_with_logs() {
		    host = "10.236.250.21";  
	        username = "root"; 
	        password = "password@123"; 
	}

	@Given("I connect the server with credential")
	public void i_connect_the_server_with_credential() {
		try {
		 JSch jsch = new JSch();

         session = jsch.getSession(username, host, 22);

         session.setPassword(password);


         session.setConfig("StrictHostKeyChecking", "no");

         
         System.out.println("connecting to putty..........");

         session.connect();
         
         System.out.println("connection successful");
         
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@When("I get the file name for the live logs")
	public void i_get_the_file_name_for_the_live_logs() {
	  fileName=PuttyUtilities.executeCommand(session,commands[0]);
       
	}

	@When("I send a request for the live logs")
	public void i_send_a_request_for_the_live_logs() {
		PuttyUtilities.executeCommand(session,commands[1]+(fileName.trim()));
	}

	@Then("I Search for the Transaction with id {string}")
	public void i_search_for_the_transaction_with_id(String string) {
	  id=string;
	}

	@Then("I validate the flow of transaction for cash")
	public void i_validate_the_flow_of_transaction_for_cash() {
		 session.disconnect();
		 Assert.assertTrue(PuttyUtilities.CodeCheckCash(id));
	}

	@Then("I validate the flow of transaction for card")
	public void i_validate_the_flow_of_transaction_for_card() {
		Assert.assertTrue(PuttyUtilities.CodeCheckCard(id));
	}
}
