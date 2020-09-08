package com.exercises.tests;

public class Recursive {

    public int fib (long n) {
        if(n >= 3) {
            return fib(n-1) + fib(n-2);
        }
        else
            return 1;
    }
}
