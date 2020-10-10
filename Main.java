import java.util.Scanner;
/**
 * Gets the average height based on user's data and tells the user which height is above average
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user how much heights they want to enter
    System.out.println("How many heights would you like to enter");

    // Gets the the amount of heights they want to enter
    int heightNumber = input.nextInt();
    
    int[] height = new int[heightNumber];

    System.out.println("Please enter the heights on separate lines");

    for(int i = 0; i < height.length; i++){
      height[i] = input.nextInt();
    }
    
    int total = 0;

    for(int i = 0; i < height.length; i++){
      total = total + height[i];
    }

    int average = total / height.length;

    System.out.println("The average height is " + average + "cm");

    System.out.println("The heights above average are");

    for(int i = 0; i < height.length; i++){
      if(height[i] > average){
        System.out.println(height[i]);
      }
    }
    
    
  }
}
