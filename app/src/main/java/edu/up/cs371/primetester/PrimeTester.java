package edu.up.cs371.primetester;

import android.util.Log;

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
        int i;
        for (i=2; i*i<=n;i++)
        {
            Log.i("isPrime",""+i);
            temp=n%i;

            if (temp==0)
            {
                isPrime = false;
            }

        }
        if(n<2)
        {
            isPrime = false;
        }
       return isPrime;
    }
}
