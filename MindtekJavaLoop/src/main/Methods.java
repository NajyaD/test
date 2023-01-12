/**
 * Copyright of Mindtek LLC
 * @author Arslan Kabulniyazov
 */
package main;

public class Methods {

    /**
     * Write a method that will accept two int parameters and
     * will do calculation based on provided operator.
     * If user provided invalid operator then method.
     * returns -1.
     * Ex:
     *   .calculate(15,10,'-'); -> returns 5;
     *   .calculate(100,2,'/'); -> returns 50;
     *   .calculate(2,2,'+'); -> returns 4;
     *   .calculate(8,5,'*'); -> returns 40;
     *   .calculate(8,5,'!'); -> returns -1;
     *
     * @param num1
     * @param num2
     * @param operator
     * @return
     */
    public int calculate(int num1, int num2, char operator){
        // TODO
        return -1;
    }

    /**
     * Write a method implementation that accept
     * String parameter and reverses it then returns.
     * Ex:
     *   .reverse("Hi"); returns "iH";
     *   .reverse("Java"); returns "avaJ";
     *   .reverse("Madam"); returns "madaM";
     *
     * @param value
     * @return
     */
    public String reverse(String value){
        // TODO
        return null;
    }

    /**
     * Write a method implementation that accepts two parameters
     * String value and char character. Method will count number
     * of chars in String and returns it.
     * (Method should ignore the cases)
     * Ex:
     *   .countLetters("Hello World", 'o'); -> returns 2;
     *   .countLetters("To be or not to be", ' '); -> returns 5;
     *   .countLetters("Sunny day", 'e'); -> returns 0;
     *   .countLetters("Success", 's'); -> returns 3;
     * @param value
     * @param letter
     * @return
     */
    public int countLetters(String value, char letter){
        // TODO
        return -1;
    }

    /**
     * Write a method implementation that accepts
     * String as a parameter and returns only upper cases
     * from provided String parameter.
     * If value doesn't contain upper case letters then
     * method will return "No upper cases."
     * Ex:
     *   .getUpperCases("United States of America"); -> returns "USA"
     *   .getUpperCases("Mindtek Bootcamp"); -> returns "MB"
     *   .getUpperCases("learning java"); -> returns "No upper cases."
     * @param value
     * @return
     */
    public String getUpperCases(String value){
        //TODO
        return null;
    }

    /**
     * Write a method implementation that accepts two int
     * parameters and will return the sum of numbers that are
     * in range of min and max parameters and can be
     * divided by 3 and 5.
     * (min and max numbers are included)
     * If the min number is more than max number then
     * it will return -1.
     *
     * Example:
     * 	   .canDivide3And5(0, 50) -> return 90; 15 + 30 + 45 = 90
     *     .canDivide3And5(10, 5) -> returns -1;
     *
     * @param min
     * @param max
     * @return
     */
    public int sumDivide3And5(int min, int max) {
        //TODO
        int[] nums=new int[0];
        return -1;
    }


}