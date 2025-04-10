package Exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int len = scanner.nextInt();

        System.out.println("Enter list of array: ");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        int minDist = len + 1;
        int lastX = -1;
        int lastY = -1;

        for (int i = 0; i < len; i++) {
            if (array[i] == x) {
                lastX = i;
                if (lastY != -1) {
                    if (Math.abs(lastX - lastY) < minDist) minDist = Math.abs(lastX - lastY);
                }
            } else if (array[i] == y) {
                lastY = i;
                if (lastX != -1) {
                    if (Math.abs(lastX - lastY) < minDist) minDist = Math.abs(lastX - lastY);
                }
            }
        }
        if (minDist<=len) System.out.println("Minimum distance between "+x+" and "+y+" is: "+minDist+".");
        else System.out.println("At least one of the numbers does not exist in the array.");
    }
}