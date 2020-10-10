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
    
    // Creates an array for the amount of data
    int[] height = new int[heightNumber];

    // Asks the user to input a number in seperate lines
    System.out.println("Please enter the heights on separate lines");

    // uses the for loop to get the height(s)
    for(int i = 0; i < height.length; i++){
      height[i] = input.nextInt();
    }
    
    // Declares a variable for future calculation
    int total = 0;

    // Gets the total of the height(s)
    for(int i = 0; i < height.length; i++){
      total = total + height[i];
    }

    // declares the average
    int average = total / height.length;

    // Tells the user the average height
    System.out.println("The average height is " + average + "cm");

    // Tells the user the heights above average
    System.out.println("The heights above average are");

    // Does the calculation and if any value from height that is over the value of averge, it will print out the number in seperate line
    for(int i = 0; i < height.length; i++){
      if(height[i] > average){
        System.out.println(height[i]);
      }
    }
    
    
  }
}
