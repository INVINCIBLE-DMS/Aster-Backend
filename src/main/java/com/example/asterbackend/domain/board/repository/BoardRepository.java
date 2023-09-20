package com.example.asterbackend.domain.board.repository;

import com.example.asterbackend.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
