/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Pc
 */
public class BasicOperation {
 public static float  addTwoNumbers(float addend1, float addend2 ){
float sum = 0;
sum = addend1 + addend2;
     return sum;
 }
  public static float  subtractTwoNumbers(float minuend1, float minuend2 ){
float subtraction = 0;
subtraction = minuend1 - minuend2;
     return subtraction;
 }
  public static float  multiplyTwoNumbers(float multiplicand1, float multiplicand2 ){
float multiplication = 0;
multiplication = multiplicand1 * multiplicand2;
     return multiplication;
 }
  public static float  divideTwoNumbers(float dividend1, float dividend2 ){
float division = 0;
division = dividend1 / dividend2;
     return division;
 }
}