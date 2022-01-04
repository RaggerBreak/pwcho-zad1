package com.raggerbreak.pwchozad1server.service.fib;

import com.raggerbreak.pwchozad1server.model.FibonacciNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FibServiceFeignImpl implements FibServiceFeign {

    private final FibServiceFeignClient fibServiceFeignClient;

    @Override
    public FibonacciNumber calculateFibonacciNumberAndSave(Integer fibonacciPosition) {
        return fibServiceFeignClient.calculateFibonacciNumberAndSave(fibonacciPosition).getBody();
    }

    @Override
    public List<FibonacciNumber> getAllCalculatedFibonacciNumbers() {
        return fibServiceFeignClient.getAllCalculatedFibonacciNumbers().getBody();
    }
}
