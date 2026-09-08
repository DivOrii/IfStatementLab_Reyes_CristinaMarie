import java.util.Scanner;

public class statements_LoopsLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Activity 1: Multiplication Table Generator (for loop)");
        System.out.println();

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // The loop starts at 1 and stops at 10, the more the better ^^
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();


        // moew gappppppppppppppppppppppppppppppppppp


        System.out.println("Activity 2: Sum of Natural Numbers (while loop)");
        System.out.println();

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int n2 = input.nextInt();

        int i2 = 1;
        int sum = 0;

        // Add numbers from 1 up to N
        while (i2 <= n2) {
            sum = sum + i2;
            i2++;
        }

        // Display the total
        System.out.println("Sum = " + sum);

        System.out.println();


        // moew gappppppppppppppppppppppppppppppppppp


        System.out.println("Activity 3: Factorial Calculator (do-while loop)");
        System.out.println("PS. Input can only go up to 65!");
        System.out.println();

        // Ask the user for a number which can only reach to 65
        System.out.print("Enter a number: ");
        int n3 = input.nextInt();

        int i3 = 1;
        long factorial3 = 1; // int can only reach up to 5!, which I switched to Long

        // Multiply the numbers from 1 up to
        do {
            factorial3 = factorial3 * i3;
            i3++;
        } while (i3 <= n3);

        // Display the answer
        System.out.println("Factorial = " + factorial3);

        System.out.println();


        // moew gappppppppppppppppppppppppppppppppppp


        System.out.println("Activity 4: Even and Odd Numbers (for loop)");
        System.out.println();

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int n4  = input.nextInt();

        // Print the even numbers
        System.out.print("Even numbers: ");
        for (int i4 = 1; i4 <= n4; i4++) {
            if (i4 % 2 == 0) {
                System.out.print(i4 + " ");
            }
        }

        System.out.println();

        // Print the odd numbers
        System.out.print("Odd numbers: ");
        for (int i4 = 1; i4 <= n4; i4++) {
            if (i4 % 2 != 0) {
                System.out.print(i4 + " ");
            }
        }

        System.out.println();


        // moew gappppppppppppppppppppppppppppppppppp


        System.out.println("Activity 5: Reverse Digits of a Number (while loop)");
        System.out.println();

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int n5 = input.nextInt();

        int reversed = 0;

        if (n5 == 0) {  // the number 0 makes the code buggy, so I added this to make it stable
            reversed = 0;
        } else {
            // Reverse the digits one by one
            while (n5 != 0) {
                int digit = n5 % 10;
                reversed = reversed * 10 + digit;
                n5 = n5 / 10;
            }
        }
        // Display the reversed number
        System.out.println("Reversed: " + reversed);

        input.close();
    }
}
