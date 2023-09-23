package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.entity.Board;
import com.example.asterbackend.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.asterbackend.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class CreateBoardService {

    private final BoardRepository boardRepository;

    public void createBoard(CreateBoardRequest request) {
        LocalDateTime now = LocalDateTime.now();

        boardRepository.save(
                Board.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .writeTime(now)
                        .build());
    }

}
