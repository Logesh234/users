package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriteExample {

	public static void main(String[] args) throws IOException {
      FileOutputStream fout=new FileOutputStream("newdd.txt");
      String s="hello";
      byte b[]=s.getBytes();
      fout.write(b);
      System.out.println("created");
      
	}

}

