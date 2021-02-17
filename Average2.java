package uriproblemsolves;

import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float a = obj.nextFloat();
        float b = obj.nextFloat();
        float c = obj.nextFloat();
        float ave = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);

        System.out.format("MEDIA = %.1f\n", ave);
    }
}
