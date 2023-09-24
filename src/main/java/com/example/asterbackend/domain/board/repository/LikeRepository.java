package com.example.asterbackend.domain.board.repository;

import com.example.asterbackend.domain.board.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
