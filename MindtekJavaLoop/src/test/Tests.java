/**
 * Copyright of Mindtek LLC
 * @author Arslan Kabulniyazov
 */
package test;

import main.Methods;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    Methods methods = new Methods();

    @Test
    public void testCalculate1(){
        Assert.assertEquals(10,methods.calculate(6,4,'+'));
    }

    @Test
    public void testCalculate2(){
        Assert.assertEquals(44,methods.calculate(50,6,'-'));
    }

    @Test
    public void testCalculate3(){
        Assert.assertEquals(11,methods.calculate(88,8,'/'));
    }

    @Test
    public void testCalculate4(){
        Assert.assertEquals(25,methods.calculate(5,5,'*'));
    }

    @Test
    public void testCalculate5(){
        Assert.assertEquals(-1,methods.calculate(5,5,'='));
    }

    @Test
    public void testReverse1(){
        Assert.assertEquals("ACO",methods.reverse("OCA"));
    }

    @Test
    public void testReverse2(){
        Assert.assertEquals("Hello World",methods.reverse("dlroW olleH"));
    }

    @Test
    public void testReverse3(){
        Assert.assertEquals(" 1 ",methods.reverse(" 1 "));
    }

    @Test
    public void testCountLetters1(){
        Assert.assertEquals(1,methods.countLetters("carpet",'C'));
    }

    @Test
    public void testCountLetters2(){
        Assert.assertEquals(2,methods.countLetters("Apple",'p'));
    }

    @Test
    public void testCountLetters3(){
        Assert.assertEquals(0,methods.countLetters("iPhone",'a'));
    }

    @Test
    public void testCountLetters4(){
        Assert.assertEquals(2,methods.countLetters("Eagle",'E'));
    }

    @Test
    public void testGetUpperCases1(){
        Assert.assertEquals("P",methods.getUpperCases("iPhone"));
    }

    @Test
    public void testGetUpperCases2(){
        Assert.assertEquals("KL",methods.getUpperCases("Keep Learning"));
    }

    @Test
    public void testGetUpperCases3(){
        Assert.assertEquals("No upper cases.",methods.getUpperCases("no pain no gain"));
    }

    @Test
    public void testSumCanDivide1() {
        int sum = 150;
        assertEquals(sum, methods.sumDivide3And5(10, 60));
    }

    @Test
    public void testSumCanDivide2() {
        int sum = 225;
        assertEquals(sum, methods.sumDivide3And5(60, 100));
    }

    @Test
    public void testSumCanDivide3() {
        int sum = 0;
        assertEquals(sum, methods.sumDivide3And5(-35, 35));
    }

    @Test
    public void testSumCanDivide4() {
        int sum = -1;
        assertEquals(sum, methods.sumDivide3And5(60, 20));
    }

}