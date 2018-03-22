package com.uwyo.testautowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bestOfRockStar")
public class RockStarSongs implements CompactDisc {
	
	private String title = "kathiya karoon";
	private String singer = "Harshadeep Kaur";
	
	@Override
	public void play() {
		System.out.println(title+" sung by "+singer);
	}

}