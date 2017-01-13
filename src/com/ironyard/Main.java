package com.ironyard;

import java.util.Scanner;

/**
 * comments here
 */
public class Main {

    public static void main(String[] args) {
	// My Family's Ages

        System.out.println("Enter five different strings:");

        Scanner scanner = new Scanner(System.in);
        boolean areUnique = true;

        String familyAges[] = new String [5];

        familyAges[0] = scanner.next();
        familyAges[1] = scanner.next();
        familyAges[2] = scanner.next();
        familyAges[3] = scanner.next();
        familyAges[4] = scanner.next();

//        boolean allStringsAreUnique = true;
        for (int i=0; i < familyAges.length; i++) {
           // System.out.println( familyAges[i] ) ;
            String tmp = familyAges[i];;

            for (int j=0; j < familyAges.length; j++) {
                String x = familyAges[j];

                if (x.equals(tmp) && i != j) {

                    areUnique =false;

                    }
                }
            }

        System.out.println("Are all of your strings the unique?" + areUnique);

        scanner.close();

        }

    }

