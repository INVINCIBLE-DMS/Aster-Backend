package com.example.asterbackend.domain.board.repository;

import com.example.asterbackend.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    void deleteById(Long boardId);
}
