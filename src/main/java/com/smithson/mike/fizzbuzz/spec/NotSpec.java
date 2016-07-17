package com.smithson.mike.fizzbuzz.spec;

/**
 * Created by mikesmithson on 7/17/16.
 */
public class NotSpec {

    private final FizzBuzzSpecs fizzBuzzSpec;

    public NotSpec(FizzBuzzSpecs fizzBuzzSpec) {
            this.fizzBuzzSpec = fizzBuzzSpec;
    }


    public boolean isNotSatisfiedBy(Integer number) {
        return !this.fizzBuzzSpec.isSatisfiedBy(number);
    }

}
