package ccd;
/*Java code to order food from online app*/
import java.util.Scanner;

public class ccd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("..................welcome to AAA..........");
		System.out.println("Please enter the name");
		String name=scan.nextLine();
		System.out.println("Hi"+" "+name+"! Welcome to AAA\n");
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
		
		System.out.println(".....Quick Searches.....");
		System.out.println("1.veg\n 2.nonveg");
		int food=scan.nextInt();
		System.out.println("Discover resturants by type of meal");
		System.out.println("1.Breakfast"+"  "+"2.Lunch"+"  "+"3.Dinner");
		int meal=scan.nextInt();
		System.out.println("Select the resturant");
    	System.out.println("1.ShantiSagar"+"2.IndraSagar");
    	int resturant=scan.nextInt();
    	System.out.println("...menu...");
		    if(food==1)
		    {
		    switch(food)
		    	{
		    	case 1:
		    		System.out.println("1.Idly-30rs\n2.vada-25rs\n3.poori-45rs");
		    		int brkfst=scan.nextInt();
		    			System.out.println("enter the number of plates:");
		    			int plate=scan.nextInt();
		    			if(brkfst==1) 
		    			{
		    			System.out.println("Total payable amount is"+plate*30+" "+"rs");
		    			}
		    			else if(brkfst==2)
		    			{
			    			System.out.println("Total payable amount is"+plate*25+" "+"rs");
			    			}
		    			else if(brkfst==3)
		    			{
			    			System.out.println("Total payable amount is"+plate*45+" "+"rs");
			    			}
		    			else {
		    				System.out.println("Enter a vaild option");
		    			}	
		    			break;
		    		case 2:
		    			System.out.println("1.Paneer fried rice-130rs\n2.Veg Thali -125rs\n3.Biriyani-145rs");
			    		int brkfst1=scan.nextInt();
			    			System.out.println("enter the number of plates:");
			    			int plate1=scan.nextInt();
			    			if(brkfst1==1) 
			    			{
			    			System.out.println("Total payable amount is"+plate1*130+"rs");
			    			}
			    			else if(brkfst1==2)
			    			{
				    			System.out.println("Total payable amount is"+plate1*125+"rs");
				    			}
			    			else if(brkfst1==3)
			    			{
				    			System.out.println("Total payable amount is"+plate1*145+"rs");
				    			}
			    			else {
			    				System.out.println("Enter a vaild option");
			    			}	
			    			break;
		    		case 3:
		    			System.out.println("1.Fried rice-130rs\n2.RotiCurry -125rs\n3.Curd Rice-145rs");
			    		int brkfst2=scan.nextInt();
			    			System.out.println("enter the number of plates:");
			    			int plate2=scan.nextInt();
			    			if(brkfst2==1) 
			    			{
			    			System.out.println("Total payable amount is"+plate2*130+"rs");
			    			}
			    			else if(brkfst2==2)
			    			{
				    			System.out.println("Total payable amount is"+plate2*125+"rs");
				    			}
			    			else if(brkfst2==3)
			    			{
				    			System.out.println("Total payable amount is"+plate2*145+"rs");
				    			}
			    			else {
			    				System.out.println("Enter a vaild option");
			    			}	
			    			break;
			    			default:
			    				System.out.println("enter valid option");
		    		}
		    }
		    else if(food==2)
		    {
		    	switch(food)
		    	{
		    	
		    
		    	case 1:
		    		System.out.println("1.Bread Omllet-30rs\n2.Roti-Egg burji-25rs");
		    		int brkfst=scan.nextInt();
		    			System.out.println("enter the number of plates:");
		    			int plate=scan.nextInt();
		    			if(brkfst==1) 
		    			{
		    			System.out.println("Total payable amount is"+plate*30+"rs");
		    			}
		    			else if(brkfst==2)
		    			{
			    			System.out.println("Total payable amount is"+plate*25+"rs");
			    			}
		    			
		    			else {
		    				System.out.println("Enter a vaild option");
		    			}	
		    			break;
		    		case 2:
		    			System.out.println("1.Chicken fried rice-130rs\n2.Non-veg Thali -125rs\n3.Nonveg-Biriyani-145rs");
			    		int brkfst1=scan.nextInt();
			    			System.out.println("enter the number of plates:");
			    			int plate1=scan.nextInt();
			    			if(brkfst1==1) 
			    			{
			    			System.out.println("Total payable amount is"+plate1*130+"rs");
			    			}
			    			else if(brkfst1==2)
			    			{
				    			System.out.println("Total payable amount is"+plate1*125+"rs");
				    			}
			    			else if(brkfst1==3)
			    			{
				    			System.out.println("Total payable amount is"+plate1*145+"rs");
				    			}
			    			else {
			    				System.out.println("Enter a vaild option");
			    			}	
			    			break;
		    		case 3:
		    			System.out.println("1. Fried Rice&Chicken Curry-130rs\n2.Ghee Rice&Mutton Curry-150rs");
			    		int brkfst2=scan.nextInt();
			    			System.out.println("enter the number of plates:");
			    			int plate2=scan.nextInt();
			    			if(brkfst2==1) 
			    			{
			    			System.out.println("Total payable amount is"+plate2*130+"rs");
			    			}
			    			else if(brkfst2==2)
			    			{
				    			System.out.println("Total payable amount is"+plate2*150+"rs");
				    			}
			    			
			    			else {
			    				System.out.println("Enter a vaild option");
			    			}	
			    			break;
		    		}
		    }
		  System.out.println("Items are added to your cart");
		  System.out.println("Please select the method of payment");
		  System.out.println("1.Cash on delivery\n2.Online\n3.Credit Card\n4.Debit card");
		  int payment=scan.nextInt();
		  System.out.println("Enter your location");
		  String loc=scan.next();
		  switch(payment)
		  {
		  case 1:
		  {

			  System.out.println("Order will be there at your location in a bit");
			  System.out.println("Thankyou for ordering!!");
			  break;
		  }
		  case 2:
		  {
			  System.out.println("Will be redirected to your payment page");
			  System.out.println("Amount will be deducted from your account");
			  System.out.println("Thankyou for ordering!!");
			  break;
			  
		  }
		  case 3:
		  {
			  System.out.println("enter your credit card number");
			  int credit=scan.nextInt();
			  System.out.println("enter the cvv number");
			  int cvv=scan.nextInt();
			  System.out.println("Amount will be deducted from your account");
			  System.out.println("Thankyou for ordering!!");
			  break;
		  }
		  }
		  }
		  
		    		
		    		
		    		
		    	}

		   
		
		    	