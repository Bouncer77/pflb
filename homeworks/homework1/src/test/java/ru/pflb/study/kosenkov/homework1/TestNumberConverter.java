package ru.pflb.study.kosenkov.homework1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNumberConverter {

    @BeforeMethod
    private void soutThread(){
        System.out.println("Thread number: " + Thread.currentThread().getId());
    }

    @DataProvider(name = "decBinProvider", parallel = true)
    public Object[][] decBinProvider(){
        return new Object[][] {
                {255, "11111111"},{1, "1"},
                {15, "1111"}, {64, "1000000"}
        };
    }

    @Test(description = "method testing convertDecToBin",
            dataProvider = "decBinProvider")
    public void testConvertDecToBin(int num, String expectedResult){
        Assert.assertEquals(NumberConverter.convertDecToBin(num),expectedResult);
    }

    @DataProvider(name = "decHexProvider", parallel = true)
    public Object[][] decHexProvider(){
        return new Object[][]{
                {255, "ff"}, {1, "1"},
                {15, "f"}, {64, "40"}
        };
    }

    @Test(description = "method testing convertDecToHex",
            dataProvider = "decHexProvider")
    public void testConvertDecToHex(int num, String expectedResult){
        Assert.assertEquals(NumberConverter.convertDecToHex(num),expectedResult);
    }

    @DataProvider(name = "binHexProvider", parallel = true)
    public Object[][] binOctProvider(){
        return new Object[][]{
                {0b11111111,"377"}, {0b1,"1"},
                {0b1111,"17"}, {0b1000000, "100"}
        };
    }

    @Test(description = "method testing convertBinToOct",
            dataProvider = "binHexProvider")
    public void testConvertBinToOct(int num, String expectedResult){
        Assert.assertEquals(NumberConverter.convertBinToOct(num),expectedResult);
    }

    @DataProvider(name = "isBinOROctORHexPositiveProvider", parallel = true)
    public Object[] isBinOROctORHexPositiveProvider(){
        return new Object[]{"15","1111","f"};
    }

    @Test(description = "Positive test - method isBinOROctORHex",
            dataProvider = "isBinOROctORHexPositiveProvider")
    public void testPositiveIsBinOROctORHex(String strNum){
        Assert.assertTrue(NumberConverter.isBinOROctORHex(strNum));
    }

    @DataProvider(name = "isBinOROctORHexNegativeProvider",
            parallel = true)
    public Object[] isBinOROctORHexNegativeProvider(){
        return new Object[]{"zero","nan","Hello, world!"};
    }

    @Test(description = "Negative test - method isBinOROctORHex",
            dataProvider = "isBinOROctORHexNegativeProvider")
    public void testNegativeIsBinOROctORHex(String strNum){
        Assert.assertFalse(NumberConverter.isBinOROctORHex(strNum));
    }
}
