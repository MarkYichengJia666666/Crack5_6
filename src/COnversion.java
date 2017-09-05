/**
 * Created by jiayicheng on 17/8/14.
 */
public class COnversion {

    public int bitSwapRequired(int m,int n)
    {
        int count=0;
        for(int a=m^n;a!=0;a>>>=1)
        {
            count+=a&1;
        }

        return count;
    }


    public int bitSwapRequired1(int m,int n)
    {
        int count=0;
        for(int a=m^n;a!=0;a=(a&(a-1)))
        {
            count++;
        }

        return count;
    }

}
