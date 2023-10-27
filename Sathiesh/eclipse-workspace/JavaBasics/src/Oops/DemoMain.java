package Oops;

public class DemoMain {

		public static void main(String[] args) {
			Demo samsung=new Demo();
			samsung.color="white";
			samsung.processor="intel";
			samsung.ram=4;
			System.out.println("The Mobile color is=:"+samsung.color);
			System.out.println("Processor"+samsung.processor);

			System.out.println("Ram=:"+samsung.ram);
			samsung.Browse();
			samsung.Game();
			samsung.communication();


		}

	}

