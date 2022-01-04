package com.raggerbreak.pwchozad1fib.model;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RedisHash("Fibonacci")
public class FibonacciNumber implements Serializable {
    private static final long serialVersionUID = -5250704608098147715L;
    private String id;

    private LocalDateTime createdAt;
    private Integer position;
    private Integer value;
}
