package com.smithson.mike.fizzbuzz.spec;

import static java.lang.String.valueOf;

/**
 * Created by MikeSmithson on 7/16/2016.
 */
public class RegularNumberAndSpec implements FizzBuzzSpec {
    private NotSpec notDivisibleByThree = new NotSpec(new FizzSpec());
    private NotSpec notDivisibleByFive = new NotSpec(new BuzzSpec());


    @Override
    public boolean isSatisfiedBy(Integer number) {
        return notDivisibleByThree.isNotSatisfiedBy(number) && notDivisibleByFive.isNotSatisfiedBy(number);
    }

    @Override
    public String responseFor(Integer number) {
        return valueOf(number);
    }
}
