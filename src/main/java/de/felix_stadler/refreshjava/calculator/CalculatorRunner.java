package de.felix_stadler.refreshjava.calculator;
import de.felix_stadler.refreshjava.calculator.Calculator;
import java. util.Scanner;

public class CalculatorRunner {
    static void main(String[] args) {
        CalculatorRunner test = new CalculatorRunner();
    }

    int selectOperator(){
        Scanner scanner = new Scanner(System.in);
        int selection;
        do{ System.out.println("""
                Do you want to:
                1. Add up the numbers
                2. Subtract the first from the second number
                3. Multiply both numbers
                4. Divide the second through the first number?""");
        selection = scanner.nextInt();}
        while (selection > 4 || selection < 1);

        return selection;
    }
}
