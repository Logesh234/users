package Array;

public class SingleShallowCopy {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int a1[][]=a;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a1[i][j]);
			}
			System.out.println();
		}
a[0][0]++;
System.out.println("after increment a original");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(a1[i][j]);
	}
	System.out.println();
}
	
	
	System.out.println("after increment copy");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(a1[i][j]);
		}
		System.out.println();
	}
		}

}


