package testclasses;

import classesForTest.ClassesForTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
    @Test
    public void test (){
        SoftAssert sa=new SoftAssert();
        ClassesForTest tr=new ClassesForTest();
        int sum= tr.sumOfNum(3,6);
        System.out.println("Fail one");
        sa.assertEquals(sum,6);
        System.out.println("Pass one");
        sa.assertEquals(sum,9);
        sa.assertAll();


        System.out.println("Today is Jan,14,2019 . Checked by Nargiza" );


    }
    }


