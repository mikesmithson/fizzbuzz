package com.smithson.mike.fizzbuzz.spec;

/**
 * Created by MikeSmithson on 7/16/2016.
 */
public interface FizzBuzzSpec {
    public boolean isSatisfiedBy(Integer number);
    public String  responseFor(Integer number);
}
