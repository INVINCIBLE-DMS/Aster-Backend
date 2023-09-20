package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.entity.Board;
import com.example.asterbackend.domain.board.presentation.dto.request.WriteBoardRequest;
import com.example.asterbackend.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WriteBoardService {

    private final BoardRepository boardRepository;

    public void writeBoard(WriteBoardRequest request) {
        boardRepository.save(
                Board.builder()
                        .id(request.getId())
                        .title(request.getTitle())
                        .content(request.getContent())
                        .writeTime(request.getWriteTime())
                        .build());
    }

}
