package com.raggerbreak.pwchozad1server.service.fib;

import com.raggerbreak.pwchozad1server.model.FibonacciNumber;

import java.util.List;

public interface FibServiceFeign {

    FibonacciNumber calculateFibonacciNumberAndSave(Integer fibonacciPosition);
    List<FibonacciNumber> getAllCalculatedFibonacciNumbers();
}
