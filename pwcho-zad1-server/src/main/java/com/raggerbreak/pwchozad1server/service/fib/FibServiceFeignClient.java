package com.raggerbreak.pwchozad1server.service.fib;

import com.raggerbreak.pwchozad1server.model.FibonacciNumber;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "${feign.name}", url = "${feign.url}/api/fib/")
public interface FibServiceFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "/{fibonacciPosition}", produces = "application/json")
    ResponseEntity<FibonacciNumber> calculateFibonacciNumberAndSave(@PathVariable Integer fibonacciPosition);

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    ResponseEntity<List<FibonacciNumber>> getAllCalculatedFibonacciNumbers();
}
