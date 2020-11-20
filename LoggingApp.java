/*
* The loggingapp program implements an application that determines how many 
* logs of particular lengths which weight 20kg/M can be loaded onto a truck 
* with a weight capacity of 1100 kg.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-20 
* Class LoggingApp.
*/

import java.util.Scanner;

public class LoggingApp {
  
  /**
  * The loggingapp function implements an application that determines how many 
  * logs of particular lengths which weight 20kg/M can be loaded onto a truck 
  * with a weight capacity of 1100 kg.
  */

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter log length (0.25m, 0.5m or 1m)");

    // String input 
    float length = myObj.nextFloat();

    // Output input by user
    System.out.println("Total log capacity: " + (1100 / (length * 20))); 
  }
}
