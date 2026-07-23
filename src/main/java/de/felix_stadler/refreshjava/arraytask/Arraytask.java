package de.felix_stadler.refreshjava.arraytask;

public class Arraytask{

    static void main() {
        int[] test = new int[]{6,3,5,180,8,2,4};
        printArray(test);
        bubbleSort(test);
        printArray(test);
    }

    static int getMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    static double getAverage(int[] array){
        int av;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        av = sum / array.length;
        return av;
    }

    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "; ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] array){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

}
