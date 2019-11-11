package com.lti.model;

public class C 
{
	int x;
	String text;
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}
	
	public String getText() 
	{
		return text;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}

	public C() 
	{
		super();
	}

	public C(int x,String text) {
		System.out.println("Constructor(int,text)");
		this.x = x;
		this.text=text;
	}

	public C(String text, int x)
	{
		System.out.println("Constructor(test,int)");
		this.text = text;
		this.x=x;
		
	}

	@Override
	public String toString() {
		return "C [x=" + x + ", text=" + text + "]";
	}
	
	

}
