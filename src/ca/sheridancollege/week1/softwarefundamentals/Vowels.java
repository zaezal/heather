/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Vowels {

    public static void main(String args[]) {
        char[] vowels = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        for (int i = 0; i < vowels.length; i++) {
            System.out.print(vowels[i]);
        }
    }
}
