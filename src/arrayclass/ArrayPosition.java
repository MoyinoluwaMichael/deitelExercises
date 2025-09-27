package arrayclass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPosition {
    public static void main(String[] args) {

        int [] array = {54,62,64,12,19};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int nextPosition = i;
            for (int j = i+1; j <array.length; j++) {
                if (array[j] < array[i] && array[j] < array[nextPosition]){
                    nextPosition = j;
                }
            }
            int temp = array[i];
            array[i] = array[nextPosition];
            array[nextPosition] = temp;
        }

        System.out.println(Arrays.toString(array));

    }
}
