import java.util.Scanner;

class MD_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("____");
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter option in words: ");
        String option = sc.nextLine();
        option = option.trim();
        option = option.toLowerCase();
        switch (option) {
            case "add":
                int sum = num1 + num2;
                System.out.println("Sum: " + sum);
                break;

            case "substract":
                int sub = num1 - num2;
                System.out.println("Subtract: " + sub);
                break;

            case "multiply":
                int prod = num1 * num2;
                System.out.println("Product is: " + prod);
                break;

            case "divide":
                int div = num1 / num2;
                System.out.println("Division: " + div);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
