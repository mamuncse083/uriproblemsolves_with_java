package uriproblemsolves;

import java.util.Scanner;

public class Avarage1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float a = obj.nextFloat();
        float b = obj.nextFloat();

        float ave = (float) ((a * 3.5 + b * 7.5) / (3.5 + 7.5));

        System.out.format("MEDIA = %.5f\n", ave);
    }
}
