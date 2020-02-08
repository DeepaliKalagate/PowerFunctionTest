import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerFunctionCalculatorTest
{
    PowerFunction powerFunction=new PowerFunction();

    @Test
    public void givenNumber_WhenCorrect_ThenShouldCalculatePower()
    {
        int result=powerFunction.calculatePower(2,3);
        Assert.assertEquals(8,result);
    }

    @Test
    public void givenNumber_ShouldCalculatePower()
    {
        int result=powerFunction.calculatePower(0,0);
        Assert.assertEquals(1,result);
    }

    @Test
    public void givenNumber_ShouldCalculatePowerSuccessfully()
    {
        int result=powerFunction.calculatePower(2,0);
        Assert.assertEquals(1,result);
    }

    @Test
    public void givenNumber_WhenNegative_ThenShouldCalculatePower()
    {
        int result=powerFunction.calculatePower(2,-3);
        Assert.assertEquals(1,result);
    }

    @Test
    public void givenNumber_WhenBaseNegative_ThenShouldCalculatePower()
    {
        int result=powerFunction.calculatePower(-2,3);
        Assert.assertEquals(-8,result);
    }







}
