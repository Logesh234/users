package Inheritance;

	public class HDFC extends Bank
	{
		int amount;
		public HDFC()
		{
			
		}
		public HDFC(int accno,int amount) {
			setAccno(accno);//inherited code
			this.amount = amount;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		@Override
		public String toString() {
			return super.toString()+"HDFC [amount=" + amount + "]";
		}
		

	}

