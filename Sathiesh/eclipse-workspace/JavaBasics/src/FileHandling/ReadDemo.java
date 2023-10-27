package FileHandling;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args) throws IOException {
       FileReader fin=new FileReader("newdd.txt");
       int i;
       while((i=fin.read())!=-1)
       {
           System.out.println((char)i);

       }
       
	}

}
