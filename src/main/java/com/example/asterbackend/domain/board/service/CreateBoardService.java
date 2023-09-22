package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.entity.Board;
import com.example.asterbackend.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.asterbackend.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateBoardService {

    private final BoardRepository boardRepository;

    public void createBoard(CreateBoardRequest request) {
        boardRepository.save(
                Board.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .writeTime(request.getWriteTime())
                        .build());
    }

}