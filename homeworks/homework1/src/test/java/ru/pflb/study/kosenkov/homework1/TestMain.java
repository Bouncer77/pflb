package ru.pflb.study.kosenkov.homework1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMain {
    private Main main;

    @BeforeClass
    public void setUp(){
        main = new Main();
    }

    @DataProvider(name = "numberProvider")
    public Object[][] dataProvider(){
        return new Object[][]{
                {4,4,8},{8,8,16},{2,2,4}
        };
    }

    @Test(dataProvider = "numberProvider")
    public void testParameters(int a,int b,int sum){

        Assert.assertEquals(main.add(a,b), sum,
                "Results are not equal");
    }


    @Test
    public void testAdd(){

    }
    @Test
    public void testAdd1(){

        Assert.assertEquals(main.add(4,4), 8,
                "Results are not equal");
    }
    @Test
    public void testAdd2(){

        Assert.assertEquals(main.add(8,8), 16,
                "Results are not equal");
    }
    @Test
    public void testSub(){

        Assert.assertEquals(main.subtract(2,2), 0,
                "Results are not equal");
    }
    @Test(testName="test1", expectedExceptions = RuntimeException.class)
    public void testDiv(){
        main.divide(2,0);
//        Assert.assertEquals(main.divide(2,0), 1,
//                "Results are not equal");
    }
    @Test
    public void testMult(){

        Assert.assertEquals(main.multiply(2,2), 4,
                "Results are not equal");
    }
}
