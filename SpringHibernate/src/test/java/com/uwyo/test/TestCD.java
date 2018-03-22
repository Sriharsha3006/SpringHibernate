package com.uwyo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.uwyo.testautowire.MediaPlayer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:uwyo-test.xml" })
public class TestCD {
	
	@Autowired
	MediaPlayer mp;
	
	
	@Test
	public void testAll() {
		mp.playSong();
		assertNotNull(mp);
	}

}
