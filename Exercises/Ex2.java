package Exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter word : ");
        String strInput=scanner.nextLine();

        String temp="";

        for (int i=0; i<strInput.length(); i++){
            char ch=strInput.charAt(i);
            if (temp.indexOf(ch)==-1){
                temp+=ch;}
        }
        System.out.println("your temp : " +temp);
    }
}
