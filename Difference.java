package uriproblemsolves;

import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();
        int D = obj.nextInt();
        int diff = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + diff);
    }
}
