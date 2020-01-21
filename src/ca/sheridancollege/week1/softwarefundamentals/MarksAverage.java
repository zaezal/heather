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
public class MarksAverage {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        double [] marks = new double [3];
        System.out.println("Please enter three double values");
        double sum = 0;
        for (int i = 0; i < marks.length; i++){
            marks[i] = input.nextDouble();
            sum += marks[i];
        }
        System.out.printf("Average: %.2f\n",sum/3);
    }    
}
