package Oops;

public class MobileMain {
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
	    System.out.println("==============================");
			Demo honor=new Demo();
			honor.color="blue";
			honor.processor="i3";
			honor.ram=8;
			System.out.println("The Mobile color is=:"+honor.color);
			System.out.println("Processor"+honor.processor);

			System.out.println("Ram=:"+honor.ram);
			honor.Browse();
			honor.Game();
			honor.communication();

		}

	}


