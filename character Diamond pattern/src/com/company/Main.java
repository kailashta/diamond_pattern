package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String Of Odd Length");
        String name  = sc.next();
        int midPosition = name.length()/2;
        for(int i=0;i<name.length();i++){
            for(int j=0;j<name.length();j++){
                if((i+j) == midPosition){
                    System.out.print(name.charAt(i)+" ");
                }
                else if(j==midPosition){
                    System.out.print(name.charAt(i)+" ");
                }
                else if((j-i) == midPosition){
                    System.out.print(name.charAt(i)+" ");
                }
                else if((i-j)==midPosition){
                    System.out.print(name.charAt(i)+" ");
                }
                else if((i+j) == midPosition*3){
                    System.out.print(name.charAt(i)+" ");
                }
                else{
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
}
