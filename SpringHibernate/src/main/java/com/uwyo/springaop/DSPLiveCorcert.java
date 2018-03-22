package com.uwyo.springaop;

import org.springframework.stereotype.Component;

@Component
public class DSPLiveCorcert implements Performance {
	

	@Override
	public void perform() {
		System.out.println("I am performing songs from NENU LOCAL");
	}

}
