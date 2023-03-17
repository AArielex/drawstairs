
import java.util.Scanner;

public class Driver{

    public static void main(String[] args){

    //Enable program to accept user input for height
    Scanner makeStairs = new Scanner(System.in);

    System.out.println("Enter stairs height and stairs width.");

    //Stairs height input
    int numSteps = makeStairs.nextInt();

    //Stairs width input
    int stepWidth = makeStairs.nextInt();
    
    //Output input by user
        for (int i = 0; i < numSteps; i++){
            for (int j = 0; j < (i + 1) * stepWidth; j++){
                System.out.print("*");
            }
            //change row
            System.out.println();
        }
        makeStairs.close();    
    }
}