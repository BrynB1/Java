package Sophmore;

import java.util.Scanner;

public class sieve {
    static class SieveOfEratosthenes
    {
        void sieveOfEratosthenes(int n)
        {
            boolean[] prime = new boolean[n+1];
            for(int i=0;i<=n;i++)
                prime[i] = true;

            for(int p = 2; p*p <=n; p++)
            {
                if(prime[p])
                {
                    for(int i = p*p; i <= n; i += p)
                        prime[i] = false;
                }
            }
            for(int i = 2; i <= n; i++)
            {
                if(prime[i])
                    System.out.print(i + " ");
            }
        }
        public void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number:");
            int n = sc.nextInt();
            System.out.print("The following are the prime numbers ");
            System.out.println("that are smaller than or equal to " + n);
            SieveOfEratosthenes g = new SieveOfEratosthenes();
            g.sieveOfEratosthenes(n);
        }
    }
}
