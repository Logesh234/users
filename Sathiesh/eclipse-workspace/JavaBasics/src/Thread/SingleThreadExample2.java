package Thread;

public class SingleThreadExample2 extends Thread
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
		
		s.start();
		s.setName("firstThread");//created
		System.out.println(s.getName());
		s.setPriority(MIN_PRIORITY);
		System.out.println(s.getPriority());
		SingleThreadExample s1=new SingleThreadExample();
		
		s1.start();
		s1.setName("SecondThread");//created
		s1.setPriority(MAX_PRIORITY);
		System.out.println(s1.getPriority());
		System.out.println(s1.getName());//created
		

	}

}
