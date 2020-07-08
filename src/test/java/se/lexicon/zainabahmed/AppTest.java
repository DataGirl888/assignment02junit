package se.lexicon.zainabahmed;

import static org.junit.Assert.*;

import org.junit.Test;
import static junit.framework.TestCase.fail;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing division method for divide by zero errors (IN PROGRESS, errors for now)
     * Testing all mathematical operations (STUBS)
     */
    @org.junit.Test
    public void shouldAnswerWithTrue() throws Exception
    {
        assertTrue( true );
        fail("True method test not implemented yet");
    }

    @org.junit.Test
    public void testOperationAdd()  throws Exception{
        //Arrange
        //Act
        //Assert
        fail("Test not implemented yet");
    }

    @org.junit.Test
    public void testTestOperationAdd()  throws Exception{
        //Arrange
        //Act
        //Assert
        fail("Test not implemented yet");
    }

    @org.junit.Test
    public void testOperationSubtract()  throws Exception{
        //Arrange
        //Act
        //Assert
        fail("Test not implemented yet");
    }

    @org.junit.Test
    public void testTestOperationSubtract()  throws Exception{
        //Arrange
        //Act
        //Assert
        fail("Test not implemented yet");
    }

    @org.junit.Test
    public void testOperationMultiply()  throws Exception{
        //Arrange
        //Act
        //Assert
        fail("Test not implemented yet");
    }

    @org.junit.Test
    public void testOperationDivide()  throws Exception{
        //Arrange
        double myDivisor = 1, myDividend = 200, myQuotient =0;

        //Act
        myQuotient = myDividend / myDivisor;
        boolean isZero = false;
        if (myDivisor == 0) {
            isZero = true;
        }

        //Assert
        assertTrue(isZero);
        fail("Divide by zero error");
    }
}
