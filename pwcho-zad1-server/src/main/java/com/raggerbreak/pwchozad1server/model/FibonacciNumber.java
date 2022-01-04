package com.raggerbreak.pwchozad1server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FibonacciNumber implements Serializable {
    private static final long serialVersionUID = 1127015469949036182L;

    private String id;
    private LocalDateTime createdAt;
    private Integer position;
    private Integer value;
}
