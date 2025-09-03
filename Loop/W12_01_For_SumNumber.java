import java.util.Scanner;
public class W12_01_For_SumNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a Start Number : ");  
            int start = scanner.nextInt();
          System.out.print("Enter a Stop Number : ");
            int stop = scanner.nextInt();

        while (start >= stop) {                         
            System.out.println("Error! Start must be less than Stop.");
            System.out.print("Enter a Start Number : ");  
            start = scanner.nextInt();
            System.out.print("Enter a Stop Number : ");
            stop = scanner.nextInt();
        } 

        int sum = 0;
        int Count = 1;
        for (int i = start ;i <= stop ;i= i + 1 ) {
            System.out.println("No" + Count + "."+ sum + "+" + i + "=" + (sum += i));
            Count++;

        }
    }
}
