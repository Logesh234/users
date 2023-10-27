package Thread;

	public class  MultiThreadExample extends Thread
	{
		public void run()//start invoke the run 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hai");//
				try
				{
					Thread.sleep(3000);
				}
				catch (Exception e) {
				     System.out.println(e);
				}
			}
			
		}

		public static void main(String[] args) {
			SingleThreadExample s=new SingleThreadExample();
			s.setName("firstThread");//created
			System.out.println(s.getName());
			s.start();
			SingleThreadExample s1=new SingleThreadExample();
			s1.setName("SecondThread");//created
			System.out.println(s1.getName());//created
			s1.start();
			

		}

	}
