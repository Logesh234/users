package Thread;

public class DemoExampleRunnable implements Runnable{

		public void run()//run 
		{
			System.out.println("hai");
		}

		public static void main(String[] args) {
			DemoExample d=new DemoExample();
			Thread t=new Thread(d);
			t.start();//started

		}

	}
