/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;
import java.util.Scanner;

/**
 *
 * @author Ali Hassan
 */
public class ReverseWord {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String temp = in.nextLine();
        char [] word = new char [temp.length()];
        for(int k = 0; k < temp.length(); k++){
            word[k]=temp.charAt(k);
        }
        
        System.out.print("The entered string is: ");
        for(char i:word){
            System.out.print(i);
        }
        
        System.out.print("\nThe reverse string is: ");
        for(int j = word.length-1; j >=0 ; j--){
            System.out.print(word[j]);
        }
        System.out.println();
    }
    
}
