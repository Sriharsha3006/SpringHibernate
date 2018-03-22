package com.uwyo.testautowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:ProjectFile.properties")
public class RockStar implements CompactDisc {
	
	@Value("${rockstar.songName}")
	private String title;
	private String singer = "Mohit Chauhan";
	
	@Override
	public void play() {
		System.out.println(title+" sung by "+singer);
	}

}
