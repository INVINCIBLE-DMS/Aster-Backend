package com.example.asterbackend.domain.board.facade;

import com.example.asterbackend.domain.board.entity.Board;
import com.example.asterbackend.domain.board.repository.BoardRepository;
import com.example.asterbackend.global.exception.board.BoardNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BoardFacade {

    private final BoardRepository boardRepository;

    public Board currentBoard(Long boardId) {
        return boardRepository.findById(boardId)
                .orElseThrow(()-> BoardNotFoundException.EXCEPTION);
    }

}
