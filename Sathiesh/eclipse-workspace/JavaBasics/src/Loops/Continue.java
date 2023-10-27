package Loops;

public class Continue {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)//0<=10
			//1<=10----4<=10 5<=10--6 to 10
		{
			if(i==5)//0==5 1==5 2==5 3==5 4==5 5==5=t
			{
				continue;//skip (
			}
			System.out.println(i);//0,1,2,3,4,6,7,8,9,10
		}

	}

}

