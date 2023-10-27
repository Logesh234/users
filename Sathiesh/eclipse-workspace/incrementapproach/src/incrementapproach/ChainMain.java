package incrementapproach;

public class ChainMain {

	public static void main(String[] args) {
		Chain addchain=new AddNumber();
		Chain subchain=new SubNumber();
		
			addchain.setNextChain(subchain);
			Numbers requst=new Numbers(4, 2, "sub");
            addchain.calculate(requst);

	}

}
