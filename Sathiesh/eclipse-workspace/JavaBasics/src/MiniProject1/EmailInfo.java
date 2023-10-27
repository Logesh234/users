package MiniProject1;

	
import java.util.Scanner;
class EmailInfo{
	
	EmailInfo() {
		System.out.println("=======================================================");
		System.out.println("======================EMAIL INFORMATION======================");
		System.out.println("=======================================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First name :");
		String fname=sc.next();
		System.out.println("=======================================================");
		System.out.println("Enter your last name :");
		String lname=sc.next();
		System.out.println("=======================================================");
		String mail="";
		String domain="Edubridge.com";
		String password="";
		int passLength=8;
		//password
		String passSet="ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789!@#$%";
		char[] pass = new char[passLength];
		for (int i=0;i<passLength;i++) {
			int rand=(int) (Math.random() * passSet.length());
			pass[i]=passSet.charAt(rand);	
		}
		password=new String(pass);
		//mail choice 
		System.out.println("enter your choice for mail\n1.gmail\n2.hotmail\n3.outlook\n4.yahoo");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:mail="gmail";break;
		case 2:mail="hotmail";break;
		case 3:mail="outlook";break;
		case 4:mail="yahoo";break;
		}
		//email name
		String emailName =fname.toLowerCase()+lname.toLowerCase()+"@"+mail +"."+ domain;
		System.out.println("name:"+fname+lname+"\n"+
		"email :"+emailName+"\npassword :"+password);
		System.out.println("=======================================================");
		System.out.println("====================Thanks for Using===================================");
		System.out.println("=======================================================");
		
	}
}