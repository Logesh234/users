package Thread;


	public class FirstThreadTable extends Thread
	{
		Table t;
		public FirstThreadTable(Table t)
		{
			this.t=t;
			
		}
		public void run()
		{
			t.printTable(2);
			
		}
		

	}
	 class SecondThread extends Thread
	{
		Table t;
		public SecondThread(Table t)
		{
			this.t=t;
			
		}
		public void run()
		{
			t.printTable(10);
			
		}
		

	}


