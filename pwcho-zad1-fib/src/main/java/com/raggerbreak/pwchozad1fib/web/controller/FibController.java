package com.raggerbreak.pwchozad1fib.web.controller;

import com.raggerbreak.pwchozad1fib.model.FibonacciNumber;
import com.raggerbreak.pwchozad1fib.service.FibonacciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fib")
@RequiredArgsConstructor
public class FibController {

    private final FibonacciService fibonacciService;

    @PostMapping("/{fibonacciPosition}")
    public ResponseEntity<FibonacciNumber> calculateFibonacciNumberAndSave(@PathVariable Integer fibonacciPosition) {
        return ResponseEntity.ok(fibonacciService.calculateFibonacciNumberAndSave(fibonacciPosition));
    }

    @GetMapping("/all")
    public ResponseEntity<List<FibonacciNumber>> getAllCalculatedFibonacciNumbers() {
        return ResponseEntity.ok(fibonacciService.getAllCalculatedFibonacciNumbers());
    }
}
