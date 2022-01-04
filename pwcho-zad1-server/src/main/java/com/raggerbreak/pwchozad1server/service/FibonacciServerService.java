package com.raggerbreak.pwchozad1server.service;

import com.raggerbreak.pwchozad1server.model.FibPosition;
import com.raggerbreak.pwchozad1server.model.FibonacciNumber;

import java.util.List;

public interface FibonacciServerService {
    FibonacciNumber calculateFibonacciNumber(Integer position);
    List<FibonacciNumber> getAllCalculatedFibonacciNumbers();
    List<FibPosition> getLastTenFibPositions();
}
