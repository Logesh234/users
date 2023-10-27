package Thread;


	public class MultiThreadTable{

		public static void main(String[] args) {
			Table t=new Table();
			FirstThreadTable f=new FirstThreadTable(t);
			f.start();
			try
			{
				f.join();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			SecondThread s=new SecondThread(t);
			s.start();

		}

	}
