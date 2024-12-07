package com.practise.main;


public class App {
	
	public int sum(int x,int y) {
		int z=x+y;
		return z;
	}
	
    public static void main(String[] args) {
        App app1=new App();
    	System.out.println("Sum is"+app1.sum(10, 20));
    }
}
