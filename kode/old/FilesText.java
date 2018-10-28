//file io bruges i programmet
import java.io.*;
import java.util.Scanner;

public class FilesText{

   public static void main(String[] Args) throws FileNotFoundException {
      File f = new File("DT.txt");
      
      Scanner input = new Scanner(f);
      //check om der er element og udskriv - stakit-problemet
      if (input.hasNext()){
         System.out.print(input.next());
         while (input.hasNext()){
   
            System.out.print(" " + input.next()); 
         }
      }
      System.out.println();
      
      //læs en linie ad gangen og tæl ord pr. linie
      Scanner linieInput = new Scanner(f);
      while (linieInput.hasNextLine()){
         //læs linie, lav scanner til at gennemgå linie, udskriv antal ord i linie
         String linieText = linieInput.nextLine();
         Scanner linieScanner = new Scanner(linieText);
         int antalOrd=0;
         while (linieScanner.hasNext()){
            linieScanner.next();
            antalOrd++;
         }
         System.out.print(antalOrd + ": ");
         System.out.println(linieText);
      }
   }

}