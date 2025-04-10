package Exercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String input=scanner.nextLine();

        String openings="";

        for (int i=0; i<input.length(); i++){
            char ch=input.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                openings+=ch;
            }
            else if (ch==')' || ch=='}' || ch==']'){
                if (openings.length()==0){
                    System.out.println("false");
                    return;
                }
                char last=openings.charAt(openings.length()-1);
                if (ch==')' && last=='(' || ch=='}' && last=='{' || ch==']' && last=='['){
                    openings=openings.substring(0,openings.length()-1);
                }
                else {
                    System.out.println("false");
                    return;
                }
            }
        }
        if (openings.isEmpty()) System.out.println("true");
        else System.out.println("false");
    }
}
