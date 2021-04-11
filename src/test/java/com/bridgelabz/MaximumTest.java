package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    @Test
    public void givenMaxAtFirst_ShouldReturnSameNumber (){
        Maximum maximum=new Maximum();
        Integer highest=maximum.findmax(20,15,10);
        Assert.assertEquals(20,(int)highest);

    }
    @Test
    public void givenMaxAtSecond_ShouldReturnSecondNumber (){
        Maximum maximum=new Maximum();
        Integer highest=maximum.findmax(5,15,10);
        Integer highest=maximum.findMaxInteger(5,15,10);
        Assert.assertEquals(15,(int)highest);

    }
    @Test
    public void givenMaxAtThird_ShouldReturnThirdNumber (){
        Maximum maximum=new Maximum();
        Integer highest=maximum.findmax(5,15,50);
        Integer highest=maximum.findMaxInteger(5,15,50);
        Assert.assertEquals(50,(int)highest);

    }
    @Test
    public void givenMaxDouble_AtFirst_shouldReturnFirstNumber(){
        Maximum maximum=new Maximum();
        Double highest=maximum.findMaxDouble(5.6,2.5,0.5);
        Assert.assertEquals((Double) 5.6,highest);
    }
    @Test
    public void givenMaxDouble_AtSecond_shouldReturnSecondNumber() {
        Maximum maximum = new Maximum();
        Double highest = maximum.findMaxDouble(43.45, 125.56, 65.78);
        Assert.assertEquals((Double) 125.56, highest);
    }
    @Test
    public void givenMaxDouble_AtThird_shouldReturnThirdNumber() {
        Maximum maximum = new Maximum();
        Double highest = maximum.findMaxDouble(0.1, 0.2, 0.3);
        Assert.assertEquals((Double) 0.3, highest);
    }
}