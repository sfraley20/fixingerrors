import java.util.Scanner;

public class FixingErrors {
    public static void main(String[] args){


        Scanner keybd = new Scanner(System.in);

        String Name;

        String Age;

        String yourDOB;

        System.out.println("Please enter your name: ");

        Name = keybd.nextLine();

        System.out.println("Hi, " + Name);

        System.out.println("How old are you?");

        Age = keybd.nextLine();

        System.out.println("What year were you born");

        yourDOB = keybd.nextLine();

        System.out.println("You're getting old! " + Age + " is old :)");








    }
}