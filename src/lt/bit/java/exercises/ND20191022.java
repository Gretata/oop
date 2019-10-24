package lt.bit.java.exercises;

import java.util.Arrays;

public class ND20191022 {

    // BONUS-3
    public static void main(String[] args) {
        int[] masyvas1 = {1, 2, 3, 4, 5};
        int[] masyvas2 = {6, 7, 8, 9, 10};
        int ilgis = masyvas1.length + masyvas2.length;
        int[] masyvas3 = new int[ilgis];
        int pozicija = 0;

        for (int element : masyvas1) {
            masyvas3[pozicija] = element;
            pozicija++;
        }


        for (int element : masyvas2) {
            masyvas3[pozicija] = element;
            pozicija++;
        }
        System.out.println(Arrays.toString(masyvas3));
    }
}