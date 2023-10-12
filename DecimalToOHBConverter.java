/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@Dinesh Suralkar
 */

package practice_java;


import java.util.Scanner;
import java.util.*;

public class DecimalToOHBConverter {

    public static String convertToBase(int n, int base) {
        int temp = n;

        String s = "";
        while (n != 0) {
            int rem = n % base;
            rem = Math.abs(rem);
            if (rem == 10) {
                s = "A" + s;
            } else if (rem == 11) {
                s = "B" + s;
            } else if (rem == 12) {
                s = "C" + s;
            } else if (rem == 13) {
                s = "D" + s;
            } else if (rem == 14) {
                s = "E" + s;
            } else if (rem == 15) {
                s = "F" + s;
            } else {
                s = rem + s;
            }
            n = n / base;
        }
        if (temp < 0) {
            //  System.out.println("Number is -ve "+temp);
            return "-" + s;
        } else {
            // System.out.println("Number is +ve "+temp);
            return s;
        }
    }

    public static void handleUserInput() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number :");
            int n = sc.nextInt();
            System.out.println("Enter Base(2,8,16) :");
            int base = sc.nextInt();
            if (base == 2 || base == 8 || base == 16) {
                System.out.println(convertToBase(n, base));
            } else {
                System.out.println("Enter Valid Base ");
                System.out.println("Press Y | N ");
                String response = sc.next().toUpperCase();

                if (response.equals("Y") || response.equals("YES")) {
                    handleUserInput();
                } else {
                    return;
                }
            }
        } catch (InputMismatchException e) {
            handleUserInput();
        } catch (Exception e) {
            handleUserInput();
        }
    }

    public static void main(String[] args) {
        handleUserInput();
    }

}
