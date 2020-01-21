package design;

import org.testng.annotations.Test;

import java.time.Month;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingEmployeeInfo {



    @Test
    public void testCalculateEmployeeBonus () {

        System.out.println("Testing calculateEmployeeBonus");
        assertEquals(2000, 0);
    }


    @Test
    public void testCalculateEmployeePension(){
        System.out.println("Testing calculateEmployeeBonus");
        assertEquals("january", "2020/04/12");

    }

    @Test
    public void testYearWorked() {
        assertEquals(10, 2008);
    }



    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.



    }
}
