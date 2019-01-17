import classesForTest.ClassesForTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassesForTestTest {

    @Test
    public void testSumOfNum() {
        SoftAssert sa = new SoftAssert();
        ClassesForTest tr = new ClassesForTest();
        int sum = tr.sumOfNum(3, 6);
        System.out.println("Fail one");
        sa.assertEquals(sum, 6);
        System.out.println("Pass one");
        sa.assertEquals(sum, 9);
        sa.assertAll();


        Assert.assertEquals(4, 4);//Nargiza, Jan 15
    }
}