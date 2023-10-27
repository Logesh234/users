package Inheritance;

public class Bank 
{
		int accno;
		public Bank()
		{
			
		}
		public Bank(int accno) {
			super();
			this.accno = accno;
		}
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		@Override
		public String toString() {
			return "Bank [accno=" + accno + "]";
		}

	}

