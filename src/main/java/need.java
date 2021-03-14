import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class need {
    private static final Logger logger = LogManager.getLogger(need.class);
    public need() {
    }

    public double log(double number) {
        double result=0;
        try {
            logger.info("[LOGARITHM] - " + number);
            if(number==0) {
                result = Double.NEGATIVE_INFINITY;
                throw new ArithmeticException("Case of Negative Infinity log(0)");
            }
            else if(number<0){
                result=Double.NaN;
                throw new ArithmeticException("Case of NaN");
            }
            else {
                result = Math.log(number);
            }
        } catch (ArithmeticException error){
            logger.error("[EXCEPTION - LOGARITHM] - Number Cannot be ZERO or LESS THAN ZERO " + error.getLocalizedMessage());
        }
        finally {
            logger.info("[RESULT - LOGARITHM] - " + result);
        }
        return result;
    }

    public double sqrt(double number) {
        double result=0;
        try{
            logger.info("[SQUAREROOT] - " + number);
            if(number<0){
                result=Double.NaN;
                throw new ArithmeticException("Case of NaN ");
            }
            else{
                result = Math.sqrt(number);
            }
        }catch (ArithmeticException error)
        {
            logger.error("[EXCEPTION - LOGARITHM] - Number Cannot be LESS THAN ZERO " + error.getLocalizedMessage());
        }
        finally {
            logger.info("[RESULT - SQUAREROOT] - " + result);
        }
        return result;
    }

    public BigInteger fact(int number) {
        logger.info("[FACTORIAL] - " +number);
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= number; i++)
            f = f.multiply(BigInteger.valueOf(i));
        logger.info("[RESULT - FACTORIAL] - " + f);
        return f;
    }

    public double power(double number1, double number2) {
        logger.info("[POWER] - " + number1 + ", " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public static void main(String[] args) {
        need calc = new need();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nScientific Calculator\nChoose to perform following operations");
            System.out.print("\n1.Press 1 for Log\t2.Press 2 for SquareRoot\t3.Press 3 for Factorial \t 4.Press 4 to Power\t5. Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                logger.error("Invalid input, Entered input is not a number");
                return;
            }
            switch (choice) {
                case 1: {
                    double number1;
                    try {
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        break;
                    }
                    System.out.println("Log of the given number is : " + calc.log(number1));
                    break;
                }
                case 2: {
                    double number1;
                    try {
                        System.out.print("Enter the first number : ");
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        break;
                    }
                    System.out.println("SquareRoot of the number is : " + calc.sqrt(number1));
                    break;
                }
                case 3: {
                    int number1;
                    try {
                        do {
                            System.out.print("Enter the integer number : ");
                            number1 = scanner.nextInt();
                        } while (number1 < 0);
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        break;
                    }
                    System.out.println("Factorial of the number is : " + calc.fact(number1));
                    break;
                }
                case 4: {
                    double number1, number2;
                    try {
                        System.out.print("Enter the base number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Enter the exponential number : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        break;
                    }
                    System.out.println("Power Function of the numbers are : " + calc.power(number1, number2));
                    break;
                }
                default: {
                    System.out.println("Have A Nice Day ! BYE");
                    return;
                }
            }
        } while (true);
    }
}
