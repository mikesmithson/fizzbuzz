package com.smithson.mike.fizzbuzz;

import com.smithson.mike.fizzbuzz.spec.FizzBuzzSpec;

import java.util.List;

/**
 * Created by MikeSmithson on 7/16/2016.
 */
public class FizzBuzz {

    private final List<FizzBuzzSpec> fizzBuzzSpecList;

    public FizzBuzz(List<FizzBuzzSpec> fizzBuzzSpecList) {
        this.fizzBuzzSpecList = fizzBuzzSpecList;
    }

    public String calculate(int number) {
        StringBuilder result = new StringBuilder();

       for (FizzBuzzSpec spec: fizzBuzzSpecList) {
           if (spec.isSatisfiedBy(number)) {
               result.append(spec.responseFor(number));
           }
       }
        return result.toString();
    }
}
