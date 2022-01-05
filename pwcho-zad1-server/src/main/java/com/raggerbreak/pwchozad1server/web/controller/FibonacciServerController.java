package com.raggerbreak.pwchozad1server.web.controller;

import com.raggerbreak.pwchozad1server.model.FibPosition;
import com.raggerbreak.pwchozad1server.model.FibonacciNumber;
import com.raggerbreak.pwchozad1server.service.FibonacciServerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/server")
@RequiredArgsConstructor
public class FibonacciServerController {

    private final FibonacciServerService fibonacciServerService;

    @PostMapping("/fib/{fibonacciPosition}")
    public ResponseEntity<FibonacciNumber> calculateFibonacciNumberAndSave(@PathVariable Integer fibonacciPosition) {
        return ResponseEntity.ok(fibonacciServerService.calculateFibonacciNumber(fibonacciPosition));
    }

    @GetMapping("/fib/all")
    public ResponseEntity<List<FibonacciNumber>> getAllCalculatedFibonacciNumbers() {
        return ResponseEntity.ok(fibonacciServerService.getAllCalculatedFibonacciNumbers());
    }

    @GetMapping("/position/last10")
    public ResponseEntity<List<FibPosition>> getLastTenFibPositions() {
        return ResponseEntity.ok(fibonacciServerService.getLastTenFibPositions());
    }
}
