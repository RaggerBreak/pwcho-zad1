package com.raggerbreak.pwchozad1server.service;

import com.raggerbreak.pwchozad1server.model.FibPosition;
import com.raggerbreak.pwchozad1server.repository.FibPositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FibPositionServiceImpl implements FibPositionService {

    private final FibPositionRepository fibPositionRepository;

    @Override
    public FibPosition save(FibPosition fibPosition) {
        return fibPositionRepository.save(fibPosition);
    }

    @Override
    public List<FibPosition> getLastTenFibPositions() {
        return fibPositionRepository.findAllByPositionNotNullOrderByCreatedAtDesc(PageRequest.of(0, 10));
    }
}
