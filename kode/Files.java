//file io bruges i programmet
import java.io.*;
import java.util.Scanner;

public class Files{

   public static void main(String[] Args) throws FileNotFoundException {
      //lav et filobjekt til at læse fra
      File f = new File("tal.txt");
      System.out.println("Fil kan læses: " + f.canRead());
      System.out.println("Filens fuld sti: " + f.getAbsolutePath());
      System.out.println("Filens navn: " + f.getName());
      System.out.println("Filens længde: " + f.length());
      
      //brug fil-objektet som input-strøm
      
      //initialiser sum

      //læs inputstrømmen så længe der er flere doubles
      
         //læs næste double
         
         //læg det læste tal til sum
         
      //udskriv sum
      
   }

}