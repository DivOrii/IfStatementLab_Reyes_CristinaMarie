import java.util.Scanner;

public class IfStatementLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  // Age Category Checker
     System.out.println("Enter your age: ");
      int Age = input.nextInt();
      
      if (Age<13)  {
      System.out.println("You are a child");
    } else if (Age<=19){
      System.out.println("You are a teenager");
    } else {
      System.out.println("You are an adult");
    }
System.out.println();
      
  // Temperature Evaluator
      System.out.println("Enter today's temperature in Celsius: ");
        double temperature = input.nextDouble();

        if (temperature<0) {
            System.out.println("Freezing point.");
        } else if (temperature<=25) {
            System.out.println("Normal weather.");
        } else {
            System.out.println("Hot weather.");
        }
  System.out.println();
      
  // Simple Grade Evaluator
      System.out.println("Enter your test score: ");
        int score = input.nextInt();

        if (score>=90) {
            System.out.println("Excellent");
        } else if (score>=75) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
System.out.println();
      
  // Circle Calculator
      System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        if (radius<=0) {
            System.out.println("Invalid radius.");
        } else {
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;
        
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);
        }
System.out.println();
  // Even or Odd Number
       System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
System.out.println();
      
  input.close();
    }
}
