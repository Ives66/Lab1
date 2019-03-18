package test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import Calculation.Calculation;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class calculationTest {
    private Calculation problem=new Calculation();
    private boolean sus;
    private int com;

    public calculationTest(boolean sus,int com){
        this.com=com;
        this.sus=sus;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {true,2},
                {true,12},
                {true,9},
                {true,29},
                {false,34},
                {false,72},
                {false,100}
        }); }


    @org.junit.Test
    public void isFound() {

        assertEquals(sus,problem.isFound(com));

    }


}