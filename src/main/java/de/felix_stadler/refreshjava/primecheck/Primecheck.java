package de.felix_stadler.refreshjava.primecheck;

public class Primecheck {
    static void main() {
        Primecheck check = new Primecheck();
        int[] array = check.arrayPrimes(100);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    static boolean isPrime(int number){
        boolean res = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                res = false;
                break;
            }
        }
        return res;
    }


    void listPrimes(){
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    int[] arrayPrimes(int length){
        int[] res = new int[length];
        int count = 0;
        int i = 2;
        do{
            if (isPrime(i)){
                res[count] = i;
                ++count;
            }
            ++i;
        }while(res[length-1]==0);
        return res;
    }


}
