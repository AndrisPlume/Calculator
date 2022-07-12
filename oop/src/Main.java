import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calc calc1 = new Calc();

//input 1st number
        System.out.print("Write your first number: ");
        double num1 = input.nextInt();
        calc1.setNumber1(num1);

//input 2nd number
        System.out.print("Write your second number: ");
        double num2 = input.nextInt();
        calc1.setNumber2(num2);

        input.nextLine();
        System.out.println("Chose the action: sum - (s), substraction - (m), devision - (d), reizinasna - (x)");
        String action = input.nextLine();

//calculations
        switch (action) {
            case "s":
                System.out.println("Sum is: " + calc1.sum());
                break;
            case "m":
                System.out.println("Substraction is: " + calc1.min());
                break;
            case "d":
                System.out.println("Devision " + calc1.dev());
                break;
            case "x":
                System.out.println("Result is: " + calc1.reiz());
                break;
            default:
                System.out.println("default");
        }
    }
}