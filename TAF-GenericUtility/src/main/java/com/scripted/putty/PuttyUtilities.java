package com.scripted.putty;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.Session;

public class PuttyUtilities {
	static List<String> CodeList=new ArrayList<String>();
	 public static boolean CodeCheckCard(String id) {
		 boolean result=false;
		 String tempid="0.00"+id;
	    	id=tempid;
	    	List<String> listOfcodes=new ArrayList<String>();
	    	listOfcodes.add("s-");
	    	listOfcodes.add("eR");
	    	listOfcodes.add("e-");
	    	listOfcodes.add("eA");
	    	listOfcodes.add("eU");
	    	listOfcodes.add("eB");
	    	listOfcodes.add("VX");
	    	//listOfcodes.add("BA");
	    	//listOfcodes.add("M-");
	    	listOfcodes.add("RK");
	    	listOfcodes.add("RC");
	    	listOfcodes.add("rZ");
	    	listOfcodes.add("b-");
	    	listOfcodes.add("F-");
	    	listOfcodes.add("bF");
	    	listOfcodes.add("z-");
	    	for(int i=0;i<CodeList.size();i++) {
	    		 String[] codes=CodeList.get(i).split("\\s+");
	             String[] codeKey=codes[0].split("(?=[a-zA-Z])",2);
	             if(codes.length>=2&&codeKey.length==2)
	             if((codeKey[1].trim()).equals("A-")&&(codes[1].trim()).equals(id)) {
	            	 System.out.println("Match found with id "+id+" card payment Checking for flow");
	            	 System.out.println("Code A- present for "+id );
	            	 result=true;
	            	 int k=0;
	            	
	            	 for(int j=i+1;j<CodeList.size();j++) {
	            		 String[] codes1=CodeList.get(j).split("\\s+");
	                     String[] codeKey1=codes1[0].split("(?=[a-zA-Z])",2);
	                     
	            		 if((codeKey1[1].trim()).equals("IP")) {
	            			 System.out.println("Code IP present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("BA")) {
	            			 System.out.println("Code cD present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("cD")) {
	            			 System.out.println("Code cD present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("cB")) {
	            			 System.out.println("Code cB present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("M-")) {
	            			 System.out.println("Code M- present for "+id );
	            			 continue;
	            		 }
	            		 else if(codeKey1[1].equals(listOfcodes.get(k))) {
	            			 System.out.println("Code "+listOfcodes.get(k)+" present for "+id );
	            			 k++;
	            		 }
	            		  
	            		 else {
	            			 System.out.println("Code "+listOfcodes.get(k)+" is not present for "+id );
	            			 result=false;
	            			 break;
	            		 }
	            		 if((codeKey1[1].trim()).equals("z-"))
	            			 break;
	            	     }
//	            	 for(int l=0;l<codeKey.length;l++)
//                    	 System.out.println(codeKey[l]);
	            	 
	            	 break;
	             }
	    	}
	    	return result;
	    }
	    
	    public static String executeCommand(Session session, String command) {
	    	 ChannelExec channel = null;
	         BufferedReader reader = null;
	         String output="";
	    	try {
	            channel = (ChannelExec) session.openChannel("exec");
	            channel.setCommand(command);

	            
	            InputStream inputStream = channel.getInputStream();
	            channel.connect();

	           
	            reader = new BufferedReader(new InputStreamReader(inputStream));
	            String line;
	           
	            while ((line = reader.readLine()) != null) {
	            	 CodeList.add(line);
	            	 output+=line;
	              //  System.out.println(line);
	            }

	           
	            channel.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    	return output;
	    }
	    
	    
	    public static boolean CodeCheckCash(String id) {
	    	String tempid="0.00"+id;
	    	id=tempid;
	    	boolean result=false;
	    	List<String> listOfcodes=new ArrayList<String>();
	    	listOfcodes.add("s-");
	    	//listOfcodes.add("BA");
//	    	listOfcodes.add("M-");
	    	listOfcodes.add("RC");
	    	listOfcodes.add("rZ");
	    	listOfcodes.add("b-");
	    	listOfcodes.add("F-");
	    	listOfcodes.add("bF");
	    	listOfcodes.add("z-");
	    	for(int i=0;i<CodeList.size();i++) {
	    		 String[] codes=CodeList.get(i).split("\\s+");
	             String[] codeKey=codes[0].split("(?=[a-zA-Z])",2);
	           //  System.out.println(codeKey[1].trim());
	             if(codes.length>=2&&codeKey.length>=2)
	             if((codeKey[1].trim()).equals("A-")&&(codes[1].trim()).equals(id)) {
	            	 System.out.println("Match found with id"+id+" cash payment Checking for flow");
	            	 System.out.println("Code A- present for "+id );
	            	 result=true;
	            	 int k=0;
	            	
	            	 for(int j=i+1;j<CodeList.size();j++) {
	            		 String[] codes1=CodeList.get(j).split("\\s+");
	                     String[] codeKey1=codes1[0].split("(?=[a-zA-Z])",2);
	            		 if((codeKey1[1].trim()).equals("IP")) {
	            			 System.out.println("Code IP present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("cD")) {
	            			 System.out.println("Code cD present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("BA")) {
	            			 System.out.println("Code cD present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("cB")) {
	            			 System.out.println("Code cB present for "+id );
	            			 continue;
	            		 }
	            		 else if((codeKey1[1].trim()).equals("M-")) {
	            			 System.out.println("Code M- present for "+id );
	            			 continue;
	            		 }

	            		 else if(codeKey1[1].equals(listOfcodes.get(k))) {
	            			 System.out.println("Code "+listOfcodes.get(k)+" present for "+id );
	            			 k++;
	            		 }
	            		  
	            		 else {
	            			 System.out.println(codeKey1[1]);
	            			 System.out.println("Code "+listOfcodes.get(k)+" is not present for "+id );
	            			 result=false;
	            			 break;
	            		 }
	            		 if((codeKey1[1].trim()).equals("z-"))
	            			 break;
	            	     }
	            	 
	            	 break;
	             }
	    	}
	    	return result;
	    }
	    
	    
	    public static boolean CodeCheckCash() {
	    	boolean result=false;
	    	List<String> listOfcodes=new ArrayList<String>();
	    	listOfcodes.add("s-");
	    	listOfcodes.add("BA");
	    	listOfcodes.add("M-");
	    	listOfcodes.add("RC");
	    	listOfcodes.add("rZ");
	    	listOfcodes.add("b-");
	    	listOfcodes.add("F-");
	    	listOfcodes.add("bF");
	    	listOfcodes.add("z-");
	    	for(int i=0;i<CodeList.size();i++) {
	    		 String[] codes=CodeList.get(i).split("\\s+");
	             String[] codeKey=codes[0].split("(?=[a-zA-Z])",2);
	           //  System.out.println(codeKey[1].trim());
	             if(codes.length>=2&&codeKey.length>=2)
	             if((codeKey[1].trim()).equals("A-")) {
	            	 System.out.println("****************************************************");
	            	 System.out.println("Match found with id"+codes[1].trim()+" Checking for flow");
	            	 System.out.println("Code A- present for "+ codes[1].trim());
	            	 result=true;
	            	 int k=0;
	            	
	            	 for(int j=i+1;j<CodeList.size();j++) {
	            		 String[] codes1=CodeList.get(j).split("\\s+");
	                     String[] codeKey1=codes1[0].split("(?=[a-zA-Z])",2);
	            		 if((codeKey1[1].trim()).equals("IP")) {
	            			 System.out.println("Code IP present for "+codes[1].trim() );
	            			 continue;
	            		 }
	            		 else if(codeKey1[1].equals(listOfcodes.get(k))) {
	            			 System.out.println("Code "+listOfcodes.get(k)+" present for "+codes[1].trim() );
	            			 k++;
	            		 }
	            		  
	            		 else {
	            			 System.out.println(codeKey1[1]);
	            			 System.out.println("Code "+listOfcodes.get(k)+" is not present for "+codes[1].trim());
	            			 System.out.println("Invalid cash transaction for id "+codes[1].trim());
	            			 result=false;
	            			 break;
	            		 }
	            		 if((codeKey1[1].trim()).equals("z-"))
	            			 System.out.println("****************************************************");
	            			 break;
	            	     }
	             }
	    	}
	    	return result;
	    }
	    
		 public static boolean CodeCheckCard() {
			 boolean result=false;
		    	List<String> listOfcodes=new ArrayList<String>();
		    	listOfcodes.add("s-");
		    	listOfcodes.add("eR");
		    	listOfcodes.add("e-");
		    	listOfcodes.add("eA");
		    	listOfcodes.add("eU");
		    	listOfcodes.add("eB");
		    	listOfcodes.add("VX");
		    	listOfcodes.add("BA");
		    	listOfcodes.add("M-");
		    	listOfcodes.add("RK");
		    	listOfcodes.add("RC");
		    	listOfcodes.add("rZ");
		    	listOfcodes.add("b-");
		    	listOfcodes.add("F-");
		    	listOfcodes.add("bF");
		    	listOfcodes.add("z-");
		    	for(int i=0;i<CodeList.size();i++) {
		    		 String[] codes=CodeList.get(i).split("\\s+");
		             String[] codeKey=codes[0].split("(?=[a-zA-Z])",2);
		             if(codes.length>=2&&codeKey.length>=2)
		             if((codeKey[1].trim()).equals("A-")) {
		            	 System.out.println("****************************************************");
		            	 System.out.println("Match found with id "+codes[1].trim()+" Checking for flow");
		            	 System.out.println("Code A- present for "+codes[1].trim() );
		            	 result=true;
		            	 int k=0;
		            	
		            	 for(int j=i+1;j<CodeList.size();j++) {
		            		 String[] codes1=CodeList.get(j).split("\\s+");
		                     String[] codeKey1=codes1[0].split("(?=[a-zA-Z])",2);
		            		 if((codeKey1[1].trim()).equals("IP")) {
		            			 System.out.println("Code IP present for "+codes[1].trim());
		            			 continue;
		            		 }
		            		 else if(codeKey1[1].equals(listOfcodes.get(k))) {
		            			 System.out.println("Code "+listOfcodes.get(k)+" present for "+codes[1].trim() );
		            			 k++;
		            		 }
		            		  
		            		 else {
		            			 System.out.println(codeKey1[1]);
		            			 System.out.println("Code "+listOfcodes.get(k)+" is not present for "+codes[1].trim() );
		            			 result=false;
		            			 System.out.println("Invalid card transaction for id "+codes[1].trim());
		            			 break;
		            		 }
		            		 if((codeKey1[1].trim()).equals("z-"))
		            			 System.out.println("****************************************************");
		            			 break;
		            	     }
		           
		             }
		    	}
		    	return result;
		    }
}
