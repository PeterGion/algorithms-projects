public class findingGCD {
    // the algorithms: https://www.ict.up.ac.th/jirabhorn/algo59/quiz1_sol.pdf
    public static void main (String ags[])
    {
        System.out.println(euclidsGCD(2,16));
    }
    public int euclidsGCD(int m, int n)
    {
        if(n == 0)
            return m;
        int r;
        while(n != 0)
        {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
    //my implementation of finding GCD
    public int myGCD(int m, int n)
    {
        int smallestNum = 0;
        int largestNum = 0;
        if(m < n)
        {
            smallestNum = m;
            largestNum = n;
        }

        else
        {
            smallestNum = n;
            largestNum = m;
        }
        if(smallestNum == 0)
            return largestNum;

        int GCD = 0;
        for(int i = 1; i <= smallestNum; i++)
        {
            double fitstNumDivisor = (double) m / i;
            double secondNumDivisor = (double) n / i;
            if(fitstNumDivisor - (int) fitstNumDivisor == 0 &&
                    secondNumDivisor - (int) secondNumDivisor == 0)
                GCD = i;
        }
        return GCD;
    }
}
