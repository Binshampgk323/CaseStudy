package Casestudy;
import java.util.Scanner;
public class Casestudythree {
	Scanner s=new Scanner(System.in);
	static int booked[]=new int[25];
	String pr="",up="";int i=1;

	public void reg() {
		do {
		System.out.println("Registration");
		System.out.println();
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("Contact Number");
		String number=s.next();
		System.out.println("E-Mail ID");
		String mail=s.next();
		System.out.println("Enter proof type");
		String proof=s.next();
		System.out.println("Enter proof id");
		String proofid=s.next();
			booked[i]=1;
			System.out.println("Thank you... Your id is  "+i);
			i=i+1;
			System.out.println("Do you want to proceed(yes/no)");
			pr=s.next();
		if(pr.equals("no"))
		{
			System.out.println("Do you want to update the email id(yes/no)");
			up=s.next();
			if(up.equals("yes"))
			{
				System.out.println("Update Email:");
				System.out.println("Enter new Email id");
				mail=s.next();
				System.out.println("Email updated");
				System.out.println();
			}
			System.out.println("Your details are as follows");
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			System.out.println("Contact Number:"+number);
			System.out.println("E-Mail ID: "+mail);
			System.out.println("Proof type:"+proof);
			System.out.println("Proof id: "+proofid);
		}
		
		
	} 
	while(pr.contentEquals("yes"));
		
	}

}
