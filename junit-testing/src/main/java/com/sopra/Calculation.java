package com.sopra;

public class Calculation {
	public int sum(int num1,int num2 ) {
		return num1+num2;
	}
	/*public int div(int num3,int num4) {
		return num3*num4;
		
	}*/
	
	public float Div(int num1,int num2) {
        return num1/num2;
    }
    
    public int testExc(int a,int b) throws Exception {
        if(a>100)
            throw(new Exception());
        return a+b;
    }
	
	
	public int cubesum(int num5,int num6) {
		int c = num5*num5*num5;
		int d = num6*num6*num6;
		return c+d;
		
	}
}
