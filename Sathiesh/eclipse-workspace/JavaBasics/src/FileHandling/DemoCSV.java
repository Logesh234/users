package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoCSV {

	public static void main(String[] args) throws IOException {
      FileWriter fw=new FileWriter("student.csv");
      fw.write("id,name,address");
      fw.write("\n12,Logesh,ponmalai");
      fw.write("\n13,Kishore,Mathur");
      fw.close();
      System.out.println("created");
      FileReader fr=new FileReader("student.csv");
      BufferedReader br=new BufferedReader(fr);
      String col=br.readLine();
      System.out.println(col);
      String row=br.readLine();

      while(row!=null)
      {
          System.out.println(row);
          row=br.readLine();
  
      }
      fr.close();
	}

}

