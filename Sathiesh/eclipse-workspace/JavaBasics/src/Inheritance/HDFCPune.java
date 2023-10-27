package Inheritance;

	public class HDFCPune extends HDFC
	{
		int dp;
		public HDFCPune() {
			
		}
		public HDFCPune(int accno,int amount,int dp) {
			setAccno(accno);
			setAmount(amount);
			this.dp = dp;
		}
		public int getDp() {
			return dp;
		}
		public void setDp(int dp) {
			this.dp = dp;
		}
		
		public double caluclateamt()
		{
			double total=amount+dp;
			return total;
			
		}
		@Override
		public String toString() {
			return super.toString()+"HDFCPune [dp=" + dp + ", caluclateamt()=" + caluclateamt() + "]";
		}
		

	}

