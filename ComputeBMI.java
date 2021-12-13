/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
          double weight = 132.5;
          double heightInInches = 62.5;
          double bmi = ((weight/(heightInInches*heightInInches))*703);
          
          System.out.println("Your weight is: " + weight);
          System.out.println("Your height in inches is: " + heightInInches);
          System.out.println("Your Body Mass Index is : " + bmi);
        }
}
