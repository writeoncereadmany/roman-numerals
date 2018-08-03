package co.unruly.romannumerals;

import org.junit.Ignore;
import org.junit.Test;

import static co.unruly.romannumerals.RomanNumerals.romanise;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class RomanNumeralsTest    {

    @Test
    public void shouldReturnIWhenPassed1(){
        assertThat(romanise(1), is("I"));
    }

    @Test
    public void shouldReturnIIWhenPassed2(){
        assertThat(romanise(2), is("II"));
    }

    @Test
    public void shouldReturnIIIWhenPassed3(){
        assertThat(romanise(3), is("III"));
    }

    @Test
    public void shouldReturnIVWhenPassed4(){
        assertThat(romanise(4), is("IV"));
    }

    @Test
    public void shouldReturnVWhenPassed5(){
        assertThat(romanise(5), is("V"));
    }

    @Test
    public void shouldReturnVIWhenPassed6(){
        assertThat(romanise(6), is("VI"));
    }

    @Test
    public void shouldReturnXWhenPassed10(){
        assertThat(romanise(10), is("X"));
    }

    @Test
    public void shouldReturnXXWhenPassed20(){
        assertThat(romanise(20), is("XX"));
    }

    @Test
    public void shouldReturnLWhenPassed50(){
        assertThat(romanise(50), is("L"));
    }

    @Test
    public void shouldReturnCWhenPassed100(){
        assertThat(romanise(100), is("C"));
    }

    @Test
    public void shouldReturnXLWhenPassed40(){
        assertThat(romanise(40), is("XL"));
    }

    @Test
    public void shouldReturnXCWhenPassed90(){
        assertThat(romanise(90), is("XC"));
    }

    @Test
    public void shouldReturnXCIXWhenPassed99(){
        assertThat(romanise(99), is("XCIX"));
    }
}