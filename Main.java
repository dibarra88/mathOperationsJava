import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getInput();
    }
    public static void getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please enter the first number." );
        double operand1 = Double.parseDouble(scanner.nextLine());
        System.out.println( "Please enter the first number." );
        double operand2 = Double.parseDouble(scanner.nextLine());

        //call operations
        double sum = sum(operand1, operand2);
        double difference = difference(operand1,operand2);
        double division = division(operand1,operand2);
        double multiplication = multiplication(operand1,operand2);
        double remainder = remainder(operand1, operand2);
        showResults(operand1,operand2,sum,difference,division,multiplication,remainder);
    }
    public static double sum(double operand1, double operand2){
        double sum = operand1 + operand2;
        return sum;
    }
    public static double difference(double operand1, double operand2){
        double diff = operand1 - operand2;
        return  diff;
    }
    public static double division(double operand1, double operand2){
        double div = operand1 / operand2;
        return  div;
    }
    public static double multiplication(double operand1, double operand2){
        double mult = operand1 * operand2;
        return  mult;
    }
    public static double remainder(double operand1, double operand2){
        double rem = operand1 % operand2;
        return  rem;
    }
    public static void showResults(double operand1, double operand2, double sum, double difference, double division, double multiplication, double remainder){
        System.out.println(operand1 + " + " + operand2 + " = " + sum);
        System.out.println(operand1 + " - " + operand2 + " = " + difference);
        System.out.println(operand1 + " / " + operand2 + " = " + division);
        System.out.println(operand1 + " * " + operand2 + " = " + multiplication);
        System.out.println(operand1 + " % " + operand2 + " = " + remainder);
    }
}