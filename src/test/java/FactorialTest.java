import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorialTest1(){


     //When
        long expected = 120;
        long actual = Factorial.factorial(5);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void factorialTest2(){

        //When
        long expected = 720;
        long actual = Factorial.factorial(6);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void factorialTest3(){

        //When
        long expected = 5040;
        long actual = Factorial.factorial(7);

        Assert.assertEquals(expected,actual);

    }


}