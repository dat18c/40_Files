//fil pakken
import java.io.*;
import java.util.Scanner;

public class Filer
{

   public static void main(String[] args)
         throws FileNotFoundException
   {
      File f = new File("DT.txt");
      System.out.println("File eksister? " + f.exists());
      System.out.println("canRead " + f.canRead());
      System.out.println("Størrelse " + f.length());
      System.out.println("Path: " + f.getAbsolutePath());
      
      //brug fil-objektet som input-strøm
      Scanner input = new Scanner(f);
      
      //initialiser sum
      int antal = 0;
      //læs inputstrømmen så længe der er flere doubles
      while (input.hasNext())
      {
         //læs næste ord
         String ord = input.next();
         
         //udskriv ord
         System.out.print(ord + " ");
         
         //læg 1 til antal ord
         antal++;
      }   
      //udskriv sum
      System.out.println("Antal ord: " + antal);
   }
}