package com.raggerbreak.pwchozad1server.service;

import com.raggerbreak.pwchozad1server.model.FibPosition;

import java.util.List;

public interface FibPositionService {
    FibPosition save(FibPosition fibPosition);
    List<FibPosition> getLastTenFibPositions();
}
