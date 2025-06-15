package training;

import java.util.Scanner;

public class EvenNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number between 0 and 10:");
        int number = input.nextInt();
        
        if (number >= 0 && number <= 10) {
            if (number % 2 == 0) {
                System.out.println("The entered number is even.");
            } else {
                System.out.println("The entered number is odd.");
            }
        } else {
            System.out.println("The number is not between 0 and 10.");
        }
        
        input.close();
    }
}