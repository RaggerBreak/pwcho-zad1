package com.raggerbreak.pwchozad1fib.repository;

import com.raggerbreak.pwchozad1fib.model.FibonacciNumber;
import org.springframework.data.repository.CrudRepository;


public interface FibonacciServiceRepository extends CrudRepository<FibonacciNumber, String> {
}
