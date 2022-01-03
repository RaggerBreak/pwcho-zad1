package com.raggerbreak.pwchozad1fib.service;

import com.raggerbreak.pwchozad1fib.model.FibonacciNumber;
import com.raggerbreak.pwchozad1fib.repository.FibonacciServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FibonacciServiceImpl implements FibonacciService {

    private final FibonacciServiceRepository fibonacciServiceRepository;

    @Override
    public FibonacciNumber calculateFibonacciNumberAndSave(Integer position) {

        FibonacciNumber fibonacciNumber;
        if (position <= 1) {
            fibonacciNumber = FibonacciNumber.builder()
                    .position(position)
                    .value(position)
                    .build();
        } else {
            int previousFib = 0;
            int currentFib = 1;
            for (int i = 0; i < position - 1; i++) {
                int newFib = previousFib + currentFib;
                previousFib = currentFib;
                currentFib = newFib;
            }

            fibonacciNumber = FibonacciNumber.builder()
                    .position(position)
                    .value(currentFib)
                    .build();
        }

        fibonacciNumber.setCreatedAt(LocalDateTime.now());
        return fibonacciServiceRepository.save(fibonacciNumber);
    }

    @Override
    public List<FibonacciNumber> getAllCalculatedFibonacciNumbers() {

        return Streamable.of(fibonacciServiceRepository.findAll()).toList()
                .stream()
                .sorted(Comparator.comparing(FibonacciNumber::getCreatedAt).reversed())
                .collect(Collectors.toList());
    }
}
