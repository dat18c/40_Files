import java.io.*;
import java.util.Scanner;

//Liniebaseret processering
public class LineBased
{

   public static void main(String[] args)
      throws FileNotFoundException
   {
      //åben filen
      File f = new File("data.txt");
      //sæt scanner på fil
      Scanner filInput = new Scanner(f);
      
      //læs linier så længe der er flere
      while (filInput.hasNextLine())
      {
         //læs linie
         String s = filInput.nextLine();
         
         //processer næste linie
         processLine(s);
      }
   }

   //processer linie
   public static void processLine(String text)
   {
      //udskriv linie
      System.out.println(text);
      
      //scanner på linie
      Scanner linie = new Scanner(text);
      String navn = linie.next();
      int indsats = linie.nextInt();
      String klub = linie.next();
      
      System.out.println(navn + " har satset " + indsats + " på " + klub);
   }
}  