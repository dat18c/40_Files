import java.io.*;
import java.util.*;

public class FileTest{

   public static void main(String[] args) throws FileNotFoundException {
      
      Scanner console = new Scanner(System.in);
      //System.out.print("Angiv filnavn: ");
      //String fileName = console.nextLine();
      //Scanner input = new Scanner(new File(fileName));
      Scanner input = getInputScanner(console);
      //Scanner input = new Scanner("Dat18v2 er gode!");
      System.out.println();
      String name;
      int count = 0;
      String newName = "";
      if (input.hasNext()){
         name = input.next();
         //System.out.print(name);
         newName = name;
         count++;
         while (input.hasNext()){
            name = input.next();
            //System.out.print(" " + name);
            newName += " " + name;
            count++;
         }
      }
      System.out.println(newName);
      System.out.println("Der er " + count + " ord");
      
   }
   
   public static Scanner getInputScanner(Scanner console) throws FileNotFoundException {
   
      System.out.print("Angiv filnavn: ");
      File f = new File(console.nextLine());
      while (!f.canRead()){
         System.out.println("Fil ikke fundet. Prøv igen.");
         System.out.print("Angiv filnavn: ");
         f = new File(console.nextLine());
      }
      System.out.println("Første dør åbnes for ældre!");
      return new Scanner(f);

   }
}