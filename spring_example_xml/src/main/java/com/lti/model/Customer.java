package com.lti.model;

public class Customer
{
		String fname,lname;

		public Customer() 
		{
			
		}

		public String getFname() 
		{
			return fname;
		}

		public void setFname(String fname)
		{
			this.fname = fname;
		}

		public String getLname() 
		{
			return lname;
		}

		public void setLname(String lname)
		{
			this.lname = lname;
		}

		@Override
		public String toString()
		{
			return "Customer [fname=" + fname + ", lname=" + lname + "]";
		}
		
		

}
