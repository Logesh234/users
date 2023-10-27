package Thread;



	public class SingleThreadExample extends Thread
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
			SingleThreadExample s=new SingleThreadExample();//created
			s.start();
			

		}

	}
