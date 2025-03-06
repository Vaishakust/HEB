package com.scripted.jsonParser;

public class ObjectRepositoryMob {
	
	@SuppressWarnings("unused")
	private WebObjectRepo webObjectRepo;
	private mobileOR mobileOR;

	@Override
	public String toString() {		
		
			return "ObjectRepository [mobileOR=" + mobileOR + "]";
		
	}
	
	public mobileOR getmobileOR() {
		
		return mobileOR;
	}
	
	public void setmobileOR(mobileOR mobileOR) {
		this.mobileOR = mobileOR;
	}


}
