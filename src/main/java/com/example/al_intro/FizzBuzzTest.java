package com.example.al_intro;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FizzBuzzTest {

    @Test
    public void fizzbuzzwith9() {
        assertEquals("Fizz", FizzBuzz.fizbuzz(9));
    }

    @Test
    public void fizzbuzzwith5() {
        assertEquals("Buzz", FizzBuzz.fizbuzz(5));
    }

    @Test
    public void fizzbuzzwith15() {
        assertEquals("FizzBuzz", FizzBuzz.fizbuzz(15));
    }

    @Test
    public void fizzbuzzwith103() {
        assertEquals("103", FizzBuzz.fizbuzz(103));
    }

    @Test
    public void fizzbuzzwithneg17() {
        assertNull(FizzBuzz.fizbuzz(-17));
    }
    @Test
    public void basic_fizzBuzz() {
        FizzBuzz.basic_fizzBuzz();
    }

}
