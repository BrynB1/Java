package Sophmore;

import java.util.*;

class happyNumber
{
    static int sumDigitSquare(int n)
    {
        int sq = 0;
        while (n > 0)
        {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }
    static boolean isHappy(int n)
    {
        HashSet<Integer> s = new HashSet<>();
        s.add(n);
        while (true)
        {
            if (n == 1)
                return true;
            n = sumDigitSquare(n);
            if ((s.contains(n) && n != (int)s.toArray()[ s.size()-1 ] ))
                return false;
            s.add(n);
        }
    }
    public static void main(String[] args)
    {
        int n = 23;
        if (isHappy(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}