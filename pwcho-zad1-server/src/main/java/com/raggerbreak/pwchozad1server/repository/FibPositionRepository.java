package com.raggerbreak.pwchozad1server.repository;

import com.raggerbreak.pwchozad1server.model.FibPosition;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FibPositionRepository extends JpaRepository<FibPosition, Long> {
    List<FibPosition> findAllByPositionNotNullOrderByCreatedAtDesc(Pageable pageable);
}
