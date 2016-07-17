package com.smithson.mike.fizzbuzz.spec;

import static java.lang.String.valueOf;

/**
 * Created by MikeSmithson on 7/16/2016.
 */
public class RegularNumberSpec implements FizzBuzzSpecs {

    @Override
    public boolean isSatisfiedBy(Integer number) {
        return number % 3 != 0 && number % 5 != 0;
    }

    @Override
    public String responseFor(Integer number) {
        return valueOf(number);
    }
}
