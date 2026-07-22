package de.felix_stadler.refreshjava.calculator;
import java. util.Scanner;

public class CalculatorRunner {
    static void main() {
        CalculatorRunner test = new CalculatorRunner();
        Calculator calculator = new Calculator();
        System.out.println(test.Operation(calculator, test.getNumber(), test.selectOperator(), test.getNumber()));
    }

    int selectOperator(){
        Scanner scanner = new Scanner(System.in);
        int selection;
        do{
            System.out.println("""
                Do you want to:
                1. Add up the numbers
                2. Subtract the first from the second number
                3. Multiply both numbers
                4. Divide the second through the first number?""");
        selection = scanner.nextInt();}
        while (selection > 4 || selection < 1);
        return selection;
    }

    double getNumber(){
        Scanner scanner = new Scanner(System.in);
        double number;
        System.out.println("Enter Number: ");
        number = scanner.nextDouble();
        return number;
    }

    double Operation(Calculator calc, double number1, int operator, double number2){
        double res;
        switch (operator) {
            case 1:
                res = calc.add(number1, number2);
                break;
            case 2:
                res = calc.subtract(number1, number2);
                break;
            case 3:
                res = calc.multiply(number1, number2);
                break;
            case 4:
                res = calc.division(number1, number2);
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}
