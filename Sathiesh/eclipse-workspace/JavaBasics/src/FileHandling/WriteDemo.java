package FileHandling;



import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
      FileWriter fw=new FileWriter("newE.txt");
      fw.write("hai hello how r u");
      fw.close();
      System.out.println("writed");
	}

}

