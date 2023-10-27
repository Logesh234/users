package Oops;

public class Bill {
		private int billno;
		private int noofunit;
		private int costperunit;
		public Bill()
		{
			
		}
		public Bill(int billno, int noofunit, int costperunit) {
			super();
			this.billno = billno;
			this.noofunit = noofunit;
			this.costperunit = costperunit;
		}
		public int getBillno() {
			return billno;
		}
		public void setBillno(int string) {
			this.billno = string;
		}
		public int getNoofunit() {
			return noofunit;
		}
		public void setNoofunit(int noofunit) {
			this.noofunit = noofunit;
		}
		public int getCostperunit() {
			return costperunit;
		}
		public void setCostperunit(int costperunit) {
			this.costperunit = costperunit;
		}
		public double calculateAmount()
		{
			double totalbill=noofunit*costperunit;
			return totalbill;
		}
		@Override
		public String toString() {
			return "Bill [billno=" + billno + ", noofunit=" + noofunit + ", costperunit=" + costperunit
					+ ", calculateAmount()=" + calculateAmount() + "]";
		}
		

	}
