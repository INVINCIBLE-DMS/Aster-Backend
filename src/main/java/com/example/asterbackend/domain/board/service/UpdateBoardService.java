package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.entity.Board;
import com.example.asterbackend.domain.board.presentation.dto.request.UpdateBoardRequest;
import com.example.asterbackend.domain.board.repository.BoardRepository;
import com.example.asterbackend.global.exception.board.BoardNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateBoardService {

    private final BoardRepository boardRepository;

    public void updateBoard(UpdateBoardRequest updateBoardRequest, Long boardId) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(()-> BoardNotFoundException.EXCEPTION);

        board.updateTitleAndContent(updateBoardRequest.getTitle(), updateBoardRequest.getContent());
    }

}
