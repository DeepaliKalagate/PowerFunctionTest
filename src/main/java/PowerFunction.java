public class PowerFunction
{
    public int calculatePower(int a,int b)
    {
        int result=1;
        for(int i=1;i<=b;i++)
        {
            result=result*a;
        }
        return result;
    }
}
