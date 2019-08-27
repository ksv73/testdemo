package com.cgi.demo;

public class Calculator {

	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a, int b)
	{
		return a-b;
	}
	public int product(int a,int b) {
		return a*b;
	}
	
	public boolean evenCheck(int num) 
	{
		boolean even=false;
		if(num%2==0) 
		{
			even=true;
		}
		return even;
	}
}
