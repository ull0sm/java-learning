/*1. Custom Exception: Invalid Age Exception
Define a custom exception called InvalidAgeException that extends Exception. Write a program that takes the age of a person as input and throws InvalidAgeException if the age is less than 18 or greater than 100. Handle this exception and display an appropriate message.

Concepts Covered:

Defining custom exceptions
Throwing and catching exceptions */

import java.util.Scanner;

public class age_n_exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age:");
        int age = sc.nextInt();
        try {
            if (age < 100 && age >= 18) {
                System.out.println("valid entry");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("wrong entry!!!!");
        }
    }
}