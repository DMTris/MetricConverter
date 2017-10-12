/*
*  Project :  A05b Metric Converter
*  File    :  MetricConverterTest.java
*  Name    :  Chris Langdale
*  Date    :  10/10/2017(10/12/2017)
*
*  Description :  Create a MetricConverterTest application that runs from the following menu:
      KG to lbs
      KM to miles
      Liters to quarts
      Celsius to Fahrenheit
*/

import java.util.Scanner;

public class MetricConverterTest
{
   //scanner convertInput variable for menu methods
   static Scanner convertInput = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      //variable declaration
      Scanner input = new Scanner(System.in);
      char selection = ' ';
      
      //display menu do-while
      do
      {
         System.out.println("\n--(Metric Conversion)--");
         System.out.println("1. KG to lbs");
         System.out.println("2. KM to miles");
         System.out.println("3. Liters to quarts");
         System.out.println("4. Celsius to Fahrenheit");
         System.out.println("5. Exit\n");
         System.out.print("Selection: ");
         
         //assign selection
         selection = input.next().charAt(0);
         
         //switch for menu selections
         switch (selection)
         {
            case '1': menuOption1(); break;
            case '2': menuOption2(); break;
            case '3': menuOption3(); break;
            case '4': menuOption4(); break;
            case '5': break;
            default: System.out.print("Invalid Selection.\n"); pause();
         }
         
      }while (selection != '5');//end of do-while
      
   }//end main
   
   //menuOption1 - kgToLbs
   public static void menuOption1()
   {
      System.out.print("Enter the kg to convert...");
      double kg = convertInput.nextDouble();
      
      System.out.printf("%.3f lbs.%n",MetricConverter.kgToLbs(kg));
      pause();
   }
   
   //menuOption2 - kmToMiles
   public static void menuOption2()
   {
      System.out.print("Enter the km to convert...");
      double km = convertInput.nextDouble();
      
      System.out.printf("%.3f miles.%n",MetricConverter.kmToMiles(km));
      pause();
   }
   
   //menuOption3 - litersToQuarts
   public static void menuOption3()
   {
      System.out.print("Enter the liters to convert...");
      double liters = convertInput.nextDouble();
      
      System.out.printf("%.3f quarts.%n",MetricConverter.litersToQuarts(liters));
      pause();
   }
   
   //menuOption4 - celsiusToFahrenheit
   public static void menuOption4()
   {
      System.out.print("Enter the celsius to convert...");
      double celsius = convertInput.nextDouble();
      
      System.out.printf("%.3f Fahrenheit.%n",MetricConverter.celsiusToFahrenheit(celsius));
      pause();
   }
   
   
   //pause method (from instructor)
   public static void pause()
   {
      try
      {
         System.out.print("Press <Enter> to continue...");
         System.in.read();
      }
      catch (Exception e)
      {
         System.err.printf("Error %s%c\n", e.getMessage(), 7);
      }
   }
   
}//end class