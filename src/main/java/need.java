import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;

public class need {
    //private static final Logger logger = LogManager.getLogger(need.class);
    public need() {
    }

    public double log(double number) {
        //logger.info("[LOGARITHM] - " + number);
        double result = Math.log(number);
        //logger.info("[RESULT - LOGARITHM] - " + result);
        return result;
    }

    public double sqrt(double number) {
        //logger.info("[SQUAREROOT] - " + number);
        double result = Math.sqrt(number);
        //logger.info("[RESULT - SQUAREROOT] - " + result);
        return result;
    }

    public BigInteger fact(int number) {
        //logger.info("[FACTORIAL] - " +number);
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= number; i++)
            f = f.multiply(BigInteger.valueOf(i));
        //logger.info("[RESULT - FACTORIAL] - " + f);
        return f;
    }

    public double power(double number1, double number2) {
        //logger.info("[POWER] - " + number1 + ", " + number2);
        double result = Math.pow(number1, number2);
        //logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public static void main(String[] args) {
        need calc = new need();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to Log\nPress 2 to SquareRoot\nPress 3 to Factorial\nPress 4 to Power\n"
                    + "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                //logger.error("Invalid input, Entered input is not a number");
                return;
            }
            switch (choice) {
                case 1: {
                    double number1;
                    try {
                        System.out.println("Enter the first number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        //logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Log of the given number is : " + calc.log(number1));
                    break;
                }
                case 2: {
                    double number1;
                    try {
                        System.out.println("Enter the first number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        //logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("SquareRoot of the number is : " + calc.sqrt(number1));
                    break;
                }
                case 3: {
                    int number1;
                    try {
                        do {
                            System.out.println("Enter the integer number : ");
                            number1 = scanner.nextInt();
                        } while (number1 < 0);
                    } catch (InputMismatchException error) {
                        //logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Factorial of the number is : " + calc.fact(number1));
                    break;
                }
                case 4: {
                    double number1, number2;
                    try {
                        System.out.println("Enter the base number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Enter the exponential number : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        //logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Power Function of the numbers are : " + calc.power(number1, number2));
                    break;
                }
                default: {
                    System.out.println("Exiting....");
                    break;
                }
            }
        } while (true);
    }
}
