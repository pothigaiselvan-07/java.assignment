import java.util.Scanner;

public class calc {
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("sum: " + sum);
    }
    
    public static void sub(int a, int b) {
        int sub = a - b;
        System.out.println("sub: " + sub);
    }
    
    public static void mul(int a, int b) {
        int mul = a * b;
        System.out.println("mul: " + mul);
    }
    
    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        int div = a / b;
        System.out.println("div: " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        
        System.out.println("
        1.Add\n2.Subtract\n3.Multiply\n4.Divide
        choose");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                mul(a, b);
                break;
            case 4:
                div(a, b);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
}