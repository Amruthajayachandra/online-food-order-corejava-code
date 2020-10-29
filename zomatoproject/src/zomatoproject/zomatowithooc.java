package zomatoproject;

import java.util.Scanner;

abstract class zomatowithooc
{ 
	abstract void quicksearch();
	void input()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("..................welcome to AJ..........");
	System.out.println("Please enter the name");
	String name=scan.nextLine();
	System.out.println("Hi"+" "+name+"! Welcome to AJ\n");
	System.out.println("Enter your Credentials");
	System.out.println("Choose how would you like to login");
	System.out.println("1.facebook"+ "  "+"2.google"+" "+"3.Mannual Login");
	int choice=scan.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter the email-id:");
	    String email=scan.next();
	    System.out.println("Enter the password:");
	    String pswd=scan.next();
	    break;
	case 2:
		
		System.out.println("Enter the email-id:");
	    String gmail=scan.next();
	    System.out.println("Enter the password:");
	    String psw0d=scan.next();
	    break;
	    
	case 3:
	    System.out.println("First name:");
	    String firstname=scan.next();
	    System.out.println("Last name:");
	    String lastname=scan.next();
	    System.out.println("phone Number:");
	    long n=scan.nextLong();
	    System.out.println("Location:");
	    String location=scan.next();
	    break;
	}
	System.out.println("1. Breakfast\n2.Lunch");
		
	}
	
}
class breakfast extends zomatowithooc
{
	void quicksearch()
	{   Scanner scan=new Scanner(System.in);
		System.out.println(".....Quick Searches for  Breakfast.....");
		System.out.println("Select the resturant");
    	System.out.println("1.ShantiSagar"+"2.IndraSagar");
    	int resturant=scan.nextInt();
    	System.out.println("...menu...");
		    if(resturant==1)
		    {
		    switch(resturant)
		    	{
		    	case 1:
		    		System.out.println("1.Idly-30rs\n2.vada-25rs\n3.poori-45rs");
		    		int brkfst1=scan.nextInt();
		    			System.out.println("enter the number of plates:");
		    			int plate=scan.nextInt();
		    			if(brkfst1==1) 
		    			{
		    			System.out.println("Total payable amount is"+plate*30+" "+"rs");
		    			}
		    			else if(brkfst1==2)
		    			{
			    			System.out.println("Total payable amount is"+plate*25+" "+"rs");
			    			}
		    			else if(brkfst1==3)
		    			{
			    			System.out.println("Total payable amount is"+plate*45+" "+"rs");
			    			}
		    			else {
		    				System.out.println("Enter a vaild option");
		    			}	
		    			break;
		    	case 2:
		    		System.out.println("1.Idly-40rs\n2.vada-35rs\n3.poori-45rs");
		    		int brkfst2=scan.nextInt();
		    			System.out.println("enter the number of plates:");
		    			int plate1=scan.nextInt();
		    			if(brkfst2==1) 
		    			{
		    			System.out.println("Total payable amount is"+plate1*30+" "+"rs");
		    			}
		    			else if(brkfst2==2)
		    			{
			    			System.out.println("Total payable amount is"+plate1*25+" "+"rs");
			    			}
		    			else if(brkfst2==3)
		    			{
			    			System.out.println("Total payable amount is"+plate1*45+" "+"rs");
			    			}
		    			else {
		    				System.out.println("Enter a vaild option");
		    			}
		    	
		    			break;
		    	default:
		    		System.out.println("enter the valid option");
	}
		    }
}
}
class lunch extends zomatowithooc
{
	void quicksearch()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(".....Quick Searches for Launch.....");
		System.out.println("Select the resturant");
    	System.out.println("1.ShantiSagar\n2.IndraSagar\n3.Krishnasagar");
    	int resturant=scan.nextInt();
    	System.out.println("...menu...");
	    if(resturant==1)
	    {
	    switch(resturant)
	    	{
	    	case 1:
	    		System.out.println("1.Full Meals-30rs\n2.Half Meals-25rs\n3.D-45rs");
	    		int brkfst1=scan.nextInt();
	    			System.out.println("enter the number of plates:");
	    			int plate=scan.nextInt();
	    			if(brkfst1==1) 
	    			{
	    			System.out.println("Total payable amount is"+plate*30+" "+"rs");
	    			}
	    			else if(brkfst1==2)
	    			{
		    			System.out.println("Total payable amount is"+plate*25+" "+"rs");
		    			}
	    			else if(brkfst1==3)
	    			{
		    			System.out.println("Total payable amount is"+plate*45+" "+"rs");
		    			}
	    			else {
	    				System.out.println("Enter a vaild option");
	    			}	
	    			break;
	    	case 2:
	    		System.out.println("1.Idly-40rs\n2.vada-35rs\n3.poori-45rs");
	    		int brkfst2=scan.nextInt();
	    			System.out.println("enter the number of plates:");
	    			int plate1=scan.nextInt();
	    			if(brkfst2==1) 
	    			{
	    			System.out.println("Total payable amount is"+plate1*30+" "+"rs");
	    			}
	    			else if(brkfst2==2)
	    			{
		    			System.out.println("Total payable amount is"+plate1*25+" "+"rs");
		    			}
	    			else if(brkfst2==3)
	    			{
		    			System.out.println("Total payable amount is"+plate1*45+" "+"rs");
		    			}
	    			else {
	    				System.out.println("Enter a vaild option");
	    			}
	    	
	    			break;
	    	default:
	    		System.out.println("enter the valid option");
}
	    }
}

		
	}


	
