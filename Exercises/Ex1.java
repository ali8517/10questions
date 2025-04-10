package Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num1="",num2="";
        String result = "";
        System.out.print("Number 1: ");
        num1=scanner.nextLine();

        System.out.print("Number 2: ");
        num2=scanner.nextLine();

        int i=num1.length()-1;
        int j=num2.length()-1;
        int x=0;
        while (i>=0 || j>=0 || x!=0){
            int digit1=(i>=0)?num1.charAt(i)-'0':0;
            int digit2=(j>=0)?num2.charAt(j)-'0':0;

            int sum=digit1+digit2+x;
            x=sum/10;
            int unit=sum%10;

            result=(unit)+result;
            i--;
            j--;
        }
        System.out.println("Result : "+result);
    }
}
