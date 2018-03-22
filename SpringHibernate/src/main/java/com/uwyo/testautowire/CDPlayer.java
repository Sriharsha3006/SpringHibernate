package com.uwyo.testautowire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	
	@Autowired
	@Qualifier("rockStar")
	private CompactDisc cd;
	
	
	@Override
	public void playSong() {
		cd.play();
		}
}

