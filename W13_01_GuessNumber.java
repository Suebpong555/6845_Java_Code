import java.util.Random;
import java.util.Scanner;
public class W13_01_GuessNumber {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(10) + 1; 

        //System.out.println("Random number is geanerated :" + answer);

        int countguess = 0;
        boolean win = false;

        while (countguess < 3 ) {
           System.out.print(" Please enter your guess (1-10): ");
              int guess = kb.nextInt();
               
                if (answer == guess  ) {
                    System.out.println(" correct ! you've guessed the number."  );
                    System.out.println("==========WIN==========");
                    win = true;
                    break;
                } else {
                    System.out.println(" incorrect ! please try again."  );
                    System.out.println("==========LOSE==========");
                }
                countguess++;     
        }
        if (countguess == 3) 
            System.out.println("Game Over. The correct number was: " + answer);

            kb.close(); 
        }           
    }

    
