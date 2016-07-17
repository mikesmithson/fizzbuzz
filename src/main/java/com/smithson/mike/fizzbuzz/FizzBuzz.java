package com.smithson.mike.fizzbuzz;

import com.smithson.mike.fizzbuzz.spec.FizzBuzzSpecs;

import java.util.List;

/**
 * Created by MikeSmithson on 7/16/2016.
 */
public class FizzBuzz {

    private final List<FizzBuzzSpecs> fizzBuzzSpecsList;

    public FizzBuzz(List<FizzBuzzSpecs> fizzBuzzSpecsList) {
        this.fizzBuzzSpecsList = fizzBuzzSpecsList;
    }

    public String calculate(int number) {
        StringBuilder result = new StringBuilder();

       for (FizzBuzzSpecs spec: fizzBuzzSpecsList) {
           if (spec.isSatisfiedBy(number)) {
               result.append(spec.responseFor(number));
           }
       }
        return result.toString();
    }
}
