/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

	 // FIXED: correct object types
	 Freshman std1 = new Freshman("James", 20, 12);
	 Senior std2 = new Senior("John", 30, 90);

	 // user input for GPA
	 System.out.print("Enter GPA for Freshman: ");
	 std1.setGpa(input.nextDouble());

	 System.out.print("Enter GPA for Senior: ");
	 std2.setGpa(input.nextDouble());

	 // output
	 System.out.println(std1);
	 System.out.println(std2);

	 input.close();
 }
}



