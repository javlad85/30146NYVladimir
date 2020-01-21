package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingMath {



    @Test
    public void testPrimeNumber() {
        boolean expectedOutcome = true;
        boolean actualOutCome = PrimeNumber.PrimeNumber(34);
        Assert.assertEquals(true, actualOutCome);

    }



    @Test
    public void testLowestDifference() {
        int expectResult = 1;
        int actualResult = LowestNumber.LowestNumber(new int[]{3, 7, 9, 2, 4});
        Assert.assertEquals(expectResult, actualResult);
    }




}
