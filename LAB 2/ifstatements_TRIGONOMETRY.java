import java.util.Scanner;
import java.lang.Math.*;

public class ifstatements_TRIGONOMETRY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// === PROBLEM 1 ===
        System.out.println();
        System.out.println("========================================");
        System.out.println("Problem 1");
        System.out.println("       TRIGONOMETRIC FUNCTION CALCULATOR");
        System.out.println("========================================");
        System.out.println();
        // Asking the user to put an angle in degrees
        System.out.println("Trigonometric Function Calculator");
        System.out.println();
        System.out.println();
        System.out.println("Please put an Angle in Degrees");
        double Angle = input.nextDouble();

        System.out.println();
        // Asking the function choices, moew
        System.out.println("Please pick a function!! ");
        System.out.println("1: sine");
        System.out.println("2: cosine");
        System.out.println("3: Tangent");
        System.out.println("4: All three");
        System.out.println();
        System.out.println("Enter your choice! ");
        int Ch = input.nextInt();


        // Since Java's Sine, Cosine, and Tangent uses Radians instead of degrees. So we convert the angle first to do the math.
        double rad = Math.toRadians(Angle);

        // Calculate the selected trigonometric function.
        if (Ch == 1) {
            System.out.println("Results: ");
            System.out.println("Sine: " + Math.sin(rad));  // this tells us the ratio of the OPPOSITE side to the hypotenuse.

        } else if (Ch == 2) {
            System.out.println("Results: ");
            System.out.println("Cousine: " + Math.cos(rad)); // Cosine tells us the ratio of the ADJACENT side to the hypotenuse.

        } else if (Ch == 3) {
            // Making sure to check if input on Tangent is undefined
            double normalAngle = Angle % 180;

            if (Math.abs(normalAngle - 90) < 1 ||
                    Math.abs(normalAngle + 90) < 1) {
                System.out.println("WARNING!! TANGENT is undefined or almost very very close to being as undefined."); // error msg
            } else {
                System.out.println("Results: ");
                System.out.println("Tangent: " + Math.tan(rad)); // This is used to calculated using the angle in Radians.
            }

        } else if (Ch == 4) { // All Together, if the user is that much of a straigth forward person.
            System.out.println("Results: ");
            System.out.println("Sine: " + Math.sin(rad));
            System.out.println("Cousine: " + Math.cos(rad));

            double normalAngle = Angle % 180; // Tan becomes undefined when the adjacent side is 0, which happens at angles like 90° and 270°.
            if (Math.abs(normalAngle - 90) < 1 ||
                    Math.abs(normalAngle + 90) < 1) {
                System.out.println("WARNING!! TANGENT is undefined or almost very very close to being as undefined."); // error msg
            } else {
                System.out.println("Tangent: " + Math.tan(rad)); // the Tangent
            }

        } else {
            System.out.println("Whomp whomp, invalid choice."); // If the user picks else than going to 1-4 option.
        }


// CRITICAL THINKING QUESTIONS!@!

     // Why do we need to convert angles from degrees to radians?
        // We need to change degrees to radians because Java uses radians, when calculating sine, cosine, and tangent.

     // What makes tangent undefined at certain angles?
        // Tangent is always undefined when we try to divide by zero, Which this happens at angle 90 degrees and 270 degrees.

     // How could you modify this program to also calculate reciprocal functions (cosecant, secant, cotangent)?
         /*
         we can add more fomulas for them to make it more fully and more functional, like an absolute calculator than can make you more dyslexic.

         cosecant = 1 / sine
         secant = 1 / cosine
         cotangent = 1 / tangent

          */

// === PROBLEM 2 ===
        System.out.println();
        System.out.println("========================================");
        System.out.println("Problem 2");
        System.out.println("       ANGLE QUADRANT DETECTER");
        System.out.println("========================================");
        System.out.println();

        // MOEW GAPPPPPPPPPPPPPPPPPPPPPPP

        System.out.println("Angle Quadrant Detecter");
        System.out.println();
        System.out.println();
        System.out.println("Enter an Angle in Degrees");
        double angle = input.nextDouble();

        // Normalizing the angle to a value between 0° and 360
        angle = angle % 360 ;


        if ( angle < 0) {
            angle = angle + 360;
        }

        // checking if the angle is exactly on an axis
        if (angle == 0) {
            System.out.println("The angle is on the positive x-axis.");
            System.out.println("Sine: 0");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: 0");

        } else if (angle == 90) {
            System.out.println("The angle is on the positive y-axis.");
            System.out.println("Sine: Positive");
            System.out.println("Cosine: 0");
            System.out.println("Tangent: Undefined");

        } else if (angle == 180) {
            System.out.println("The angle is on the negative x-axis.");
            System.out.println("Sine: 0");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: 0");

        } else if (angle == 270) {
            System.out.println("The angle is on the negative y-axis.");
            System.out.println("Sine: Negative");
            System.out.println("Cosine: 0");
            System.out.println("Tangent: Undefined");

        } else if (angle > 0 && angle < 90) { // Checking if the angle is between 0° and 90°
            System.out.println("Quadrant I");
            System.out.println("Sine: Positive");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: Positive");

        } else if (angle > 90 && angle < 180) { // Checking if the angle is between 90° and 180°
            System.out.println("Quadrant II");
            System.out.println("Sine: Positive");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: Negative");

        } else if (angle > 180 && angle < 270) { // Checking if the angle is between 180° and 270°
            System.out.println("Quadrant III");
            System.out.println("Sine: Negative");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: Positive");

        } else { // Any remaining angle belongs to Quadrant IV
            System.out.println("Quadrant IV");
            System.out.println("Sine: Negative");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: Negative");
        }


        // I am dying

        // Critical Thinking Questions:

            // Why is it important to normalize angles before determining their quadrant?
                 /*
                 Normalizing makes sure the angle is between 0° and 360°.
                 This makes it easier to know which quadrant the angle belongs to,
                 even if the user enters a very large or negative angle.
                 */

            // How does the sign of trigonometric functions change across different quadrants?
                 /*
                 The signs change depending on the quadrant.
                 Quadrant I: sine, cosine, and tangent are positive.
                 Quadrant II: sine is positive, while cosine and tangent are negative.
                 Quadrant III: sine and cosine are negative, while tangent is positive.
                 Quadrant IV: sine is negative, cosine is positive, and tangent is negative.
                 */

            // What special considerations are needed for angles exactly on the axes?
                 /*
                 Angles on the axes are not part of any quadrant.
                 At 0° and 180°, sine is 0 and tangent is also 0.
                 At 90° and 270°, cosine is 0 and tangent is undefined.
                 So, the program checks these angles separately.
                 */

// === PROBLEM 3 ===
        System.out.println();
        System.out.println("========================================");
        System.out.println("Problem 3");
        System.out.println("       RIGHT TRIANGLE SOLVER");
        System.out.println("========================================");
        System.out.println();

        // moew gapPPPPPPPPPPP

        System.out.println("Right Triangle Solver");
        System.out.println();
        System.out.println();

        System.out.println("1. I know two sides");
        System.out.println("2. I know one side and one angle");
        System.out.println();
        System.out.println("Choose an option");
        int option = input.nextInt();


        // option 1, if the user knows two sides
        if (option == 1) {

            System.out.println("Enter side A: ");
            double a = input.nextDouble(); // base
            System.out.println();
            System.out.println("Enter side B: ");
            double b = input.nextDouble(); // height


            // making sure if both sides is positive
            if ( a<=0 || b<=0 ) {
                System.out.println ("Sides must be positive");
            } else {


                // Math.sqrt to finds that square root
                double c = Math.sqrt(a * a + b * b); // Using the pythorean theorem c² = a² + b² as base

                // finding the angles using inverse trigonometric functions
                double angleA = Math.toDegrees(Math.atan(a / b));
                double angleB = 90 - angleA;

                // Calculating the Area
                // Area = 1/2 * base * height
                double area = 0.5 * a * b;

                System.out.println("Results: "); // Printing the results of choice 1
                System.out.println("Side A + a");
                System.out.println("Side B + b");
                System.out.println("Hypotenuse: " + c);
                System.out.println("AngleA: " + angleA + "degrees");
                System.out.println("AngleB: " + angleB + "degrees");
                System.out.println("Right angle: 90 degrees");
                System.out.println("Area: " + area);
            }

            // Option 2, if the user knows one side and two side
        } else if (option == 2) {
            System.out.println("Enter the known side");
            double side = input.nextDouble();

            System.out.println("Enter the known angle (must be less than 90)");
            double inputtednangle = input.nextDouble();

            // check if inputs are valid
            if ( side <= 0 || inputtednangle <= 0 || inputtednangle >= 90) {
                System.out.println("Invalid input");
                System.out.println("Side must be positive and the angle must be between 0 and 90");

            } else { //Converting the degrees to radians
                double radians = Math.toRadians(inputtednangle);

                //ASSUMING the known side is the opposite side
                //sin(angle) = opposite/hypotenuse
                double hypote = side / Math.sin(radians); //hypotenuse as hypote for short because I cannot with the spelling

                // tan(Angle) = opposite/adjacent
                double adjacent = side / Math.tan(radians); //thee adjacent

                // the other smol angle = 90 - known angle
                double otherAngle = 90 - inputtednangle;

                // Area = 1/2 * base * height
                double area = 0.5 * side * adjacent;

                System.out.println("Results: "); //Printing the results of option 2
                System.out.println("known side: " + side);
                System.out.println("Opposite side: " + side);
                System.out.println("Adjacent side: " + adjacent);
                System.out.println("Hypotenuse: " + hypote);
                System.out.println("Angle A: " + inputtednangle + "Degrees");
                System.out.println("Angle B: " + otherAngle + "Degrees");
                System.out.println("Right angle: 90 degrees");
                System.out.println("Area: " + area);

            }

        } else {
            System.out.println("Invalid Choice"); //If the user pick anything other than 1 and 2.
        }

        // Critical Thinking Questions:

            // Why must we validate that angles in a right triangle are less than 90°?
                     /*
                     Angles in a right triangle must be less than 90° because
                     90° is already the right angle.
                     The other two angles must add up to 90°.
                     */

            // How does your program handle the different cases of known values?
                     /*
                     The program gives the user two choices.
                     If the user knows two sides, it uses the Pythagorean theorem
                     to find the hypotenuse and uses trigonometry to find the angles.
                     If the user knows one side and one angle, it uses sine and tangent
                     to find the missing sides and then finds the other angle.
                     */

            // What would happen if a user entered values that don't form a valid right triangle?
                     /*
                     If the values don't form a valid right triangle, the calculations
                     may give incorrect results.
                     That is why the program checks if the side and angle are valid
                     before doing the calculations.
                     */

// === PROBLEM 4 ===
        System.out.println();
        System.out.println("========================================");
        System.out.println("Problem 4");
        System.out.println("       TRIGONOMETRIC IDENTITY VERIFIER");
        System.out.println("========================================");
        System.out.println();

        // MOEW GAPPPPPPPPPPPPPPP

        System.out.println("Trigonometric Identity Verifier");
        System.out.println();
        System.out.println();

        System.out.println("Enter an angle in degrees:");
        double moewangle = input.nextDouble();

        // Small value used because decimals can have tiny rounding errors
        double tolerance = 0.000001;

        // Change the angle from degrees to radians for Math.sin() and Math.cos()
        double radians = Math.toRadians(moewangle);

        // Finding the basic trigonometric values
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);


        // Identity 1: sin²θ + cos²θ = 1
        double left1 = (sin * sin) + (cos * cos);
        double right1 = 1;
        double difference1 = Math.abs(left1 - right1);

        System.out.println();
        System.out.println("Identity 1: sin²θ + cos²θ = 1");
        System.out.println("Left side: " + left1);
        System.out.println("Right side: " + right1);

        // Check if the difference is small enough
        if (difference1 <= tolerance) {
            System.out.println("Identity holds true.");
        } else {
            System.out.println("Identity does not hold.");
            System.out.println("Difference: " + difference1);
        }


        // Identity 2: 1 + tan²θ = sec²θ
        // Tangent and secant cannot be found when cosine is 0
        if (Math.abs(cos) < tolerance) {
            System.out.println();
            System.out.println("Identity 2: 1 + tan²θ = sec²θ");
            System.out.println("Identity is undefined because cosine is 0.");

        } else {
            double tan = sin / cos;
            double sec = 1 / cos;

            double left2 = 1 + (tan * tan);
            double right2 = sec * sec;
            double difference2 = Math.abs(left2 - right2);

            System.out.println();
            System.out.println("Identity 2: 1 + tan²θ = sec²θ");
            System.out.println("Left side: " + left2);
            System.out.println("Right side: " + right2);

            // Check if the difference is small enough
            if (difference2 <= tolerance) {
                System.out.println("Identity holds true.");
            } else {
                System.out.println("Identity does not hold.");
                System.out.println("Difference: " + difference2);
            }
        }


        // Identity 3: sin(2θ) = 2sinθcosθ
        // 2θ means the angle is multiplied by 2
        double left3 = Math.sin(2 * radians);
        double right3 = 2 * sin * cos;
        double difference3 = Math.abs(left3 - right3);

        System.out.println();
        System.out.println("Identity 3: sin(2θ) = 2sinθcosθ");
        System.out.println("Left side: " + left3);
        System.out.println("Right side: " + right3);

        // Check if the difference is small enough
        if (difference3 <= tolerance) {
            System.out.println("Identity holds true.");
        } else {
            System.out.println("Identity does not hold.");
            System.out.println("Difference: " + difference3);
        }

    // Critical Thinking Questions:

        // Why must we validate that angles in a right triangle are less than 90°?
             /*
             Floating-point numbers can have very small rounding errors.
             Because of this, two values that should be equal might not be
             exactly the same. A tolerance lets us treat very small differences
             as equal.
             */

        // How does your program handle the different cases of known values?
             /*
             The identity 1 + tan²θ = sec²θ might have more precision issues
             because tan and sec involve division by cosine.
             When cosine is very close to 0, the values can become very large,
             which can cause bigger rounding errors.
             */

        // What would happen if a user entered values that don't form a valid right triangle?
             /*
             We can add more identities by calculating the left side and right
             side of each identity and comparing them using the same tolerance.
             We could also let the user choose which identity they want to check.
             */


// === PROBLEM 5 ===
        System.out.println();
        System.out.println("========================================");
        System.out.println("Problem 5");
        System.out.println("       WAVE PROPERTIES ANALYZER");
        System.out.println("========================================");
        System.out.println();

        // MOEW GAPPPPPPPPPPPPP
        System.out.println("Wave Properties Analyzer");
        System.out.println();
        System.out.println();

        // Ask the user for the wave properties
        System.out.print("Enter amplitude: ");
        double amplitude = input.nextDouble();
        System.out.println();
        System.out.print("Enter frequency: ");
        double frequency = input.nextDouble();
        System.out.println();
        System.out.print("Enter phase shift (in radians): ");
        double phaseShift = input.nextDouble();
        System.out.println();
        System.out.print("Enter time: ");
        double time = input.nextDouble();

        // Amplitude cannot be negative and frequency must be greater than 0
        if (amplitude < 0 || frequency <= 0) {
            System.out.println("Invalid input. Amplitude must be 0 or more and frequency must be greater than 0.");
            input.close();
            return;
        }

        // Calculate the angle used inside the sine function
        // The formula is y = A sin(2πft + phase shift)
        double rahangle = 2 * Math.PI * frequency * time + phaseShift;

        // Calculate the wave's value at the given time
        double waveValue = amplitude * Math.sin(rahangle);

        System.out.println("\nInstantaneous value: " + waveValue);

        // Small tolerance because computers may give very tiny decimal values,
        // and calling it moo-tolerance because they look like they moo (they errored, causing me to use a different unique variable name.
        double mootolerance = 0.000001;

        // Find where the wave is in its cycle
        double cyclePosition = rahangle % (2 * Math.PI);

        if (Math.abs(waveValue - amplitude) < mootolerance) {
            System.out.println("The wave is at a peak.");

        } else if (Math.abs(waveValue + amplitude) < mootolerance) {
            System.out.println("The wave is at a trough.");

        } else if (Math.abs(waveValue) < mootolerance) {
            System.out.println("The wave is at a zero-crossing.");

        } else {
            System.out.println("The wave is between a peak, trough, and zero-crossing.");
        }

        // A peak happens when the angle reaches π/2 + 2πn
        // We find the next n that makes the peak happen after the given time.
        double period = 1 / frequency;

        double peakTime = (Math.PI / 2 - phaseShift) / (2 * Math.PI * frequency);

        while (peakTime <= time) {
            peakTime += period;
        }

        System.out.println("Next peak will occur at time: " + peakTime);

        // Critical Thinking Questions

            // 1. How did you determine if the wave is at a peak or trough?
                /*
                A peak happens when the sine value is 1, so the wave value equals
                the amplitude. A trough happens when the sine value is -1, so the
                wave value equals negative amplitude. A zero-crossing happens when
                the wave value is 0.
                */

            // 2. What mathematical approach did you use to find the next peak?
                /*
                I used the fact that sine reaches a peak at π/2 + 2πn.
                I first calculated when a peak occurs, then added the wave's
                period (1/frequency) until the peak was after the given time.
                */

            // 3. How would you modify this program to handle non-sinusoidal waves?
                /*
                I would like to change the formula used to calculate the wave. For example,
                a square wave could use conditions instead of Math.sin(). A triangle
                wave would also need a different mathematical formula.
                */

        input.close();

    }
}
