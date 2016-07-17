package com.smithson.mike.fizzbuzz.spec;

/**
 * Created by MikeSmithson on 7/16/2016.
 */
public class BuzzSpec implements FizzBuzzSpecs {

    @Override
    public boolean isSatisfiedBy(Integer number) {
        return number % 5 == 0;
    }

    @Override
    public String responseFor(Integer number) {
        return "Buzz";
    }


}
