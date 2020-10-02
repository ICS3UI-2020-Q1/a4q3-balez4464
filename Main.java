import java.util.Scanner;

/**
 *This program allows user to enter a  number than caluclates the sum from 1 to that number
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user for a number
    System.out.println("Please enter an integer to count down to");

    //creates intergers
    int usersNumber = input.nextInt();
    //for adding to base number everytime
    int accumulator = 1;
    //sum of consecutive numbers
    int sum = 0;

    //while loop
    while(accumulator <= usersNumber){
      //finding sum of consecutive numbers
      sum = sum + accumulator;
      //adding to the accumulator for next time
      accumulator = accumulator + 1;
    }
    System.out.println("The sum from 1 - " + usersNumber + " is " + sum);

  }
}
