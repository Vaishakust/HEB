package com.scripted.api.testscripts;

import org.testng.annotations.Test;

import com.scripted.envconfig.EnvConfigDefine;

public class EnvTest extends EnvConfigDefine {
	
	@Test
	public void envTest() {
		
		System.out.println(baseurl());
	}

}
