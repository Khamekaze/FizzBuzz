package com.khamurai.fizzbuzz;

/**
 * FizzBuzz created by Kim Göransson, Mudassar Abbas and Soleiman Ibrahim
 *
 */
public class Main {

    public static void main(String[] args) {
        //Instantiate integer i
        int i = 1;
        //Instantiate String output
        String output;

        while(i <= 100) {
            if(i % 3 == 0 && i % 5 == 0) {
                //Checks if i is divisible by 3 and 5
                output = "FizzBuzz";
            } else if(i % 3 == 0) {
                //Checks if i is divisible by 3
                output = "Fizz";
            } else if(i % 5 == 0) {
                //Checks if i is divisible by 5
                output = "Buzz";
            } else {
                //Default case, set output to value of i
                output = String.valueOf(i);
            }

            if(i == 42) {
                //Sets output if i equals 42
                output = "Answer to the Ultimate Question of Life, the Universe, and Everything";
            }

            //Prints value of output
            System.out.println(output);
            i++;
        }
    }
}
