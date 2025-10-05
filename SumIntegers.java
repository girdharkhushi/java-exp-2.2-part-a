import java.util.ArrayList;
import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter integers separated by space:");
        String input = sc.nextLine();
        
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            // Parse string to int (primitive)
            int num = Integer.parseInt(token);
            
            // Autoboxing: int -> Integer
            numbers.add(num);
        }
        
        // Calculate sum using unboxing
        int sum = 0;
        for (Integer number : numbers) {
            // Unboxing: Integer -> int automatically
            sum += number;
        }
        
        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
