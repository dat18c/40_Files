import java.io.*;
import java.util.*;

public class FileTest{

   public static void main(String[] args) throws FileNotFoundException {
      
      Scanner console = new Scanner(System.in);
      //System.out.print("Angiv filnavn: ");
      //String fileName = console.nextLine();
      //Scanner input = new Scanner(new File(fileName));
      Scanner input = getInputScanner(console);
      //Scanner input = new Scanner("Dat18c er gode!");
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
   
      PrintStream output = new PrintStream(new File("DT2.txt"));
      output.println(newName);
      output.println("Der er " + count + " ord");
      System.out.println("Det er også skrevet til fil.");
      
      //average value file
      averageFile();
   }
   
   public static Scanner getInputScanner(Scanner console) throws FileNotFoundException {
   
      System.out.print("Angiv filnavn: ");
      File f = new File(console.nextLine());
      while (!f.canRead()){
         System.out.println("Fil ikke fundet. Prøv igen.");
         System.out.print("Angiv filnavn: ");
         f = new File(console.nextLine());
      }
      return new Scanner(f);
   }
   
   public static void averageFile() throws FileNotFoundException{
      Scanner console = new Scanner(System.in);
      Scanner input = getInputScanner(console);
      double sum = 0; //sum af tal læst
      int n = 0; //antal tal læst
      while (input.hasNextDouble()){
         sum += input.nextDouble();
         n++;
      }
      PrintStream output = new PrintStream(new File("average.txt"));
      output.printf("Der er %d tal\n", n);
      output.printf("Summen er %4.2f\n", sum);
      output.printf("Gennemsnitter er %4.2f\n", sum/n);
      
   }
   
}