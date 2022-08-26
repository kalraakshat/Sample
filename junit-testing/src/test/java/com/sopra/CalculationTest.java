package com.sopra;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class CalculationTest {
	
	Calculation c;
	@Test
    void testSum() {
        Calculation c= new Calculation();
        int result= c.sum(10, 20);
        
        assertEquals(30, result);
        
        System.out.println("Testing Successful");
    }
	/*@Test
	void testdiv() {
		Calculation c= new Calculation();
        int result= c.div(10, 20);
        
        assertEquals(200, result);
        
        System.out.println("Testing Successful");
    }*/
	
	
	@Test
    void Excep() {
        assertThrows(Exception.class, ()->c.Div(10, 0));
        System.out.println("Exception");
        
    }
    
    @Test
    void CustomException() {
       
		assertThrows(Exception.class, ()->c.testExc(120, 234));
        System.out.println("Num > 100");
        
    }
	@Test
	void cubicwalasum() {
		Calculation c= new Calculation();
        int result= c.cubesum(3, 5);
        
        assertEquals(152, result);
        
        System.out.println("Testing Successful");
    }
	}
