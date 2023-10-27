package ForLoops;

public class ReverseTriangles {

	public static void main(String[] args) {
			for(int row=1;row<=5;row++)//1<=5 2<=5 3<=5
			{
				for(int col=5;col>=row;col--)//col=5>=1 4>=1---0>=1=f
					                          //col>=2 4>=2 3>=2 2>=2
					                         //col=5>=3 4>=3 3>=3
				{
					System.out.print(" " +"*");//54321
					                      //5432
					                      //543
					                     //54
					                     //5
				}
				System.out.println();
				
			}

		}

	}


