package com.scripted.license;

@SuppressWarnings("serial")
public class InvalidLicensekeyException extends Exception {
	
	public InvalidLicensekeyException( String message )
    {
        super(message);
    }
}
