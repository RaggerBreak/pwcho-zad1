package com.raggerbreak.pwchozad1server.service;

import com.raggerbreak.pwchozad1server.model.FibPosition;
import com.raggerbreak.pwchozad1server.model.FibonacciNumber;
import com.raggerbreak.pwchozad1server.service.fib.FibServiceFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FibonacciServerServiceImpl implements FibonacciServerService {

    private final FibPositionService fibPositionService;
    private final FibServiceFeign fibServiceFeign;

    @Override
    public FibonacciNumber calculateFibonacciNumber(Integer position) {

        FibonacciNumber calculatedFibonacciNumber = fibServiceFeign.calculateFibonacciNumberAndSave(position);

        fibPositionService.save(FibPosition.builder()
                .position(calculatedFibonacciNumber.getPosition())
                .createdAt(calculatedFibonacciNumber.getCreatedAt())
                .build());

        return calculatedFibonacciNumber;
    }

    @Override
    public List<FibonacciNumber> getAllCalculatedFibonacciNumbers() {
        return fibServiceFeign.getAllCalculatedFibonacciNumbers();
    }

    @Override
    public List<FibPosition> getLastTenFibPositions() {
        return fibPositionService.getLastTenFibPositions();
    }
}
