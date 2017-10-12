/*
*  Project :  A05b Metric Converter
*  File    :  MetricConverter.java
*  Name    :  Chris Langdale
*  Date    :  10/10/2017(10/12/2017)
*  
*  Description :  Create a MetricConverter class with the following static methods 
   (each method receives a metric value and returns the corresponding standard value):
      + kgToLbs(kg:double):double
      + kmToMiles(km:double):double
      + litersToQuarts(liters:double):double
      + celsiusToFahrenheit(celsius:double):double
*/

public class MetricConverter
{
   //variables
   
   
   //public static methods for kg to lbs
   public static double kgToLbs(double kg)
   {
      double lbs = kg * 2.2046;
      return lbs;
   }
   
   //public static method for km to miles
   public static double kmToMiles(double km)
   {
      double miles = km * 0.62137;
      return miles;
   }
   
   //public static method for liters to quarts
   public static double litersToQuarts(double liters)
   {
      double quarts = liters * 1.0567;
      return quarts;
   }
   
   //public static method for celsius to fahrenheit
   public static double celsiusToFahrenheit(double celsius)
   {
      double fahrenheit = celsius * 1.8 + 32;
      return fahrenheit;
   }
   
}//end of class