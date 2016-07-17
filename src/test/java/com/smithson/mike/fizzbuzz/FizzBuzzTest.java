package com.smithson.mike.fizzbuzz;

import com.smithson.mike.fizzbuzz.spec.BuzzSpec;
import com.smithson.mike.fizzbuzz.spec.FizzBuzzSpecs;
import com.smithson.mike.fizzbuzz.spec.FizzSpec;
import com.smithson.mike.fizzbuzz.spec.RegularNumberAndSpec;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by MikeSmithson on 7/16/2016.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        List<FizzBuzzSpecs> fizzBuzzSpecsList = new ArrayList<>();
        fizzBuzzSpecsList.add(new FizzSpec());
        fizzBuzzSpecsList.add(new BuzzSpec());
        fizzBuzzSpecsList.add(new RegularNumberAndSpec());


        fizzbuzz = new FizzBuzz(fizzBuzzSpecsList);
    }

    @Test
    public void neither_divisible_by_3_or_5_returns_number() {
        assertThat(fizzbuzz.calculate(1)).isEqualTo("1");
        assertThat(fizzbuzz.calculate(4)).isEqualTo("4");
    }

    @Test
    public void divisible_by_3_returns_fizz() {
        assertThat(fizzbuzz.calculate(3)).isEqualTo("Fizz");
    }

    @Test
    public void divisible_by_5_returns_buzz() {
        assertThat(fizzbuzz.calculate(5)).isEqualTo("Buzz");
    }

    @Test
    public void divisible_by_15_returns_fizzbuzz() {
        assertThat(fizzbuzz.calculate(15)).isEqualTo("FizzBuzz");
    }
}
