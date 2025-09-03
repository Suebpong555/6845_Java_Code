import java.util.Scanner;   
public class W12_02_Sumnumber {
    public static void main(String[] args) {
        //ใช้ do while วนรับค่าไปเรื่อยๆ
        Scanner scanner= new Scanner(System.in);

        int start, stop;
          do{                      
            System.out.println("Error! Start must be less than Stop.");
            System.out.print("Enter a Start Number : ");  
            start = scanner.nextInt();
            System.out.print("Enter a Stop Number : ");
            stop = scanner.nextInt();
            
            int sum = 0;
            int Count = 1;
            
        if (start < stop){
            for (int i = start ;i <= stop ;i= i + 1 ) {
                System.out.println("No" + Count + "."+ sum + "+" + i + "=" + (sum += i));
                Count++;
            }  
        }else{
            System.out.println("Please try again"); 
         }  
           } while (start >= stop);

       
    }
}
