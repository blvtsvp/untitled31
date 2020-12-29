package com.company;

import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        return b == 0 ? a: gcd(a,a%b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println("NOD(a,b,c,d) = " + gcd(gcd(a,b),gcd(c,d)));
    }
}
