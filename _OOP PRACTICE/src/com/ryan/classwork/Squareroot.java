package com.ryan.classwork;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Squareroot {
    public static void main(String[]args){
        try{
            File file= new File("Numbers.txt");
            Scanner scanner= new Scanner(file);
            int number = scanner.nextInt();
            if (number<0){
                throw new IllegalArgumentException("Negative number not allowed");
            }

            double squareRoot=Math.sqrt(number);
            System.out.println("Square root of number"+number+"is"+squareRoot);
        }catch (FileNotFoundException e) {
        System.err.println("File numbers.txt not found.");
    } catch (IllegalArgumentException e) {
        System.err.println("Error: No number in file "+e.getMessage());
    } catch (ArithmeticException e) {
        System.err.println("ArithmeticException: " + e.getMessage());
    } catch (Exception e) {
        System.err.println("No Number in the file : " + e.getMessage());
    }
}
}


