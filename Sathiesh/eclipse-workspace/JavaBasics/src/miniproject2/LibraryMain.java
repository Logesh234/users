package miniproject2;

import java.util.Scanner;

import MiniProjectCollection.StudentApp;

public class LibraryMain {

		
	
			static Scanner sc=new Scanner(System.in);

			public static void main(String[] args) {
				System.out.println("====================================================================");
				System.out.println("============= Library Management System =============================");
				System.out.println("====================================================================");
				String ch;
				Students app=new Students();
				System.out.println("enter your name");
				Scanner input = new Scanner(System.in);
				String name = input.nextLine();
				System.out.println("enter password");
				int pass=sc.nextInt();
				if(stringcompares(name,"logesh")==0&&strcmp(pass,"123")==0)
				{
					System.out.println("Login successfully");
			    do
				{
				
				System.out.println("\t\t 1)Add book \r\n"
						+ "\t\t 2)view book.\r\n"
						+ "\t\t 3)return book.\r\n"
						+ "\t\t 4)Update student information by id.\r\n");
				System.out.println("====================================================================");
				System.out.println("Enter your choice:");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				
				case 1: this
				break;
				case 2:	this.addbook();
				break;
				case 3:	app.return book();
				break;
			    default:System.out.println("Wrong choice!!"); 		   
				
			    
			    
				}
				
				System.out.println("Do you want to continue? (Y-Yes / N-No)");
				 ch=sc.next();
				}
				while(ch.equals("Y")||ch.equals("y"));
				System.out.println("====================================================================");

				System.out.println("Bye....");
			
				System.out.println("====================================================================");


			}

			

		}

			private static int strcmp(int pass, String string) {
				
				return 0;
			}

			private static int stringcompares(String name, String string) {
				// TODO Auto-generated method stub
				return 0;
			}
		}

	}

}
