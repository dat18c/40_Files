//file io bruges i programmet
import java.io.*;
import java.util.Scanner;

public class Files{

   public static void main(String[] Args) throws FileNotFoundException {
      File f = new File("tal.txt");
      System.out.println("Fil kan læses: " + f.canRead());
      System.out.println("Filens fuld sti: " + f.getAbsolutePath());
      System.out.println("Filens navn: " + f.getName());
      System.out.println("Filens længde: " + f.length());
      
      Scanner input = new Scanner(f);
      double sum = 0.0;
      while (input.hasNextDouble()){
         double tal;
         tal = input.nextDouble();
         sum = sum + tal;
         System.out.println(tal); 
      }
      System.out.println(sum);
   }

}