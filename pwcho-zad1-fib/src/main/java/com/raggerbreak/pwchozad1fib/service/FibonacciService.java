package com.raggerbreak.pwchozad1fib.service;

import com.raggerbreak.pwchozad1fib.model.FibonacciNumber;

import java.util.List;

public interface FibonacciService {
    FibonacciNumber calculateFibonacciNumberAndSave(Integer position);
    List<FibonacciNumber> getAllCalculatedFibonacciNumbers();
}
