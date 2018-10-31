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
      Scanner input = new Scanner(f);
      
      //initialiser sum
      double sum = 0.0;
      int antal = 0;
      //læs inputstrømmen så længe der er flere doubles
      while (input.hasNextDouble())
      {
         //læs næste double
         double tal = input.nextDouble();
         System.out.println("Jeg har læst: " + tal);
         
         //læg det læste tal til sum
         sum += tal;
         //læg 1 til antal tal
         antal ++;  
      }  
      //udskriv sum
      System.out.println("Sum: " + sum);
      System.out.printf("Sum: %.1f%n", sum);
      System.out.println("Gennemsnit: " + sum/antal);
      System.out.printf("Gennemsnit: %.2f%n", sum/antal);
   }

}