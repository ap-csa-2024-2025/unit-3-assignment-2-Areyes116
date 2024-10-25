import java.util.Scanner;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Problem 1
        System.out.println("Problem 1");
        System.out.println("Please enter a double:");
        double inputDouble = scanner.nextDouble();
        if (inputDouble == 12.345)
        {
            System.out.println("YES");
        }

        // Problem 2
        System.out.println("\nProblem 2");
        System.out.println("Please enter an integer:");
        int inputInt = scanner.nextInt();
        if (inputInt == 48) {
            System.out.println("YES");
        }

        // Problem 3
        System.out.println("\nProblem 3");
        System.out.println("Please enter two integers:");
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        if (secondInt == 2 * firstInt)
        {
            System.out.println("YES");
        }

        // Problem 4
        System.out.println("\nProblem 4");
        System.out.println("Please enter an integer:");
        int num = scanner.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Divisible by 2!");
        }
        if (num % 3 == 0)
        {
            System.out.println("Divisible by 3!");
        }

        // Problem 5
        System.out.println("\nProblem 5");
        System.out.println("Please enter an integer:");
        int evenOddNum = scanner.nextInt();
        if (evenOddNum % 2 == 0)
        {
            System.out.println("Even");
        } else
        {
            System.out.println("Odd");
        }

        // Problem 6
        System.out.println("\nProblem 6");
        System.out.println("Please enter a letter grade:");
        scanner.nextLine(); // Consume newline
        String grade = scanner.nextLine();
        if (grade.equals("A"))
        {
            System.out.println("90-100");
        } else if (grade.equals("B"))
        {
            System.out.println("80-90");
        } else if (grade.equals("C"))
        {
            System.out.println("70-80");
        } else if (grade.equals("D"))
        {
            System.out.println("60-70");
        } else if (grade.equals("F"))
        {
            System.out.println("0-60");
        } else
        {
            System.out.println("Invalid letter grade");
        }

        // Problem 7
        System.out.println("\nProblem 7");
        Random random = new Random();
        int random1 = random.nextInt(51);  // 0-50
        int random2 = random.nextInt(50) + 51;  // 51-100
        System.out.printf("%d + %d = ?\n", random1, random2);
        int userAnswer = scanner.nextInt();
        if (userAnswer == random1 + random2)
        {
            System.out.println("Correct!");
        } else
        {
            System.out.println("Wrong");
        }

        // Problem 8
        System.out.println("\nProblem 8");
        System.out.println("What is the temperature?");
        int temperature = scanner.nextInt();
        if (temperature >= 97 && temperature <= 99)
        {
            System.out.println("Temperature is OK");
        } else
        {
            System.out.println("NOT NORMAL");
        }

        scanner.close();
    }
}

