import java.util.Scanner;

public class CALCULATOR {
    //Simple calculator code block
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //User to input first number
        System.out.print("Enter first number");
        double num1 = scanner.nextDouble();

//User to input second number
        System.out.print("Enter second number");
        double num2 = scanner.nextDouble();

//Calculations to be done
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double divide = num1 / num2;
        double modulus = num1 % num2;
        double squareRootNum1 = Math.sqrt(num1);

        System.out.println("Sum is :" + sum);
        System.out.println("Difference is :" + difference);
        System.out.println("Product is :" + product);
        System.out.println("Divide is :" + divide);
        System.out.println("Modulus is : " + modulus);
        System.out.println("Square root is : " + squareRootNum1);





    }
}






