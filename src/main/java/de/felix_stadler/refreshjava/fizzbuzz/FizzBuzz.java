package de.felix_stadler.refreshjava.fizzbuzz;

public class FizzBuzz {
    static void main() {
        for (int i = 0; i <= 100;  i++){
            System.out.print("\n" + i);
            if(i % 3 == 0){
                System.out.print(" Fizz");
            }
            else{
                System.out.print(" ");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }

        }
    }
}
