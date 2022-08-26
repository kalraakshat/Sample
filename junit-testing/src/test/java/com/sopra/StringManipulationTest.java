package com.sopra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringManipulationTest {
	@Test
	public void TestConcat() {
		StringManipulation s=new StringManipulation();
			String result= s.concat("akshat", "kalra");
			        
			        assertEquals("akshat kalra", result);
			        
			        System.out.println("Testing Successful");
			    }
		}
