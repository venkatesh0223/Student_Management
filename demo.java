import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        int k = 2,n = 4;
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int c = 0;
        for(int i=0; i<a.length; i++)
        {
            boolean z = false;
            boolean m = false;
            for(int j=0; j<a.length; j++)
            {
                int va = k+a[j];
                int x = a[i]-va;
                int y = b[i]-b[j];
                if(x<=y)
                {
                    if((va-k) == a[j])
                    {
                        z = true;
                    }
                }

                int va2 = k+b[i];
                int x2 = a[i]-a[j];
                int y2 = va2-b[j];
                if(x2<=y2)
                {
                    if((va2-k) == b[i])
                    {
                        m = true;
                    }
                }
                if(z && m)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}