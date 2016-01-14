package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */

    public static boolean isPrime(long n) {
        // for now, return a random result
        long temp;
        boolean isPrime = true;
        for (int i=2; i*i<=n;i++)
        {
            temp=n%i;

            if (n<2)
            {
                isPrime = false;
            }
            else if (temp==0)
            {
                isPrime = false;
            }

        }
       return isPrime;
    }
}
