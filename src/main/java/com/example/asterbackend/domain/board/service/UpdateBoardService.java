package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.entity.Board;
import com.example.asterbackend.domain.board.facade.BoardFacade;
import com.example.asterbackend.domain.board.presentation.dto.request.UpdateBoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateBoardService {

    private final BoardFacade boardFacade;

    public void updateBoard(UpdateBoardRequest updateBoardRequest, Long boardId) {
        Board board = boardFacade.currentBoard(boardId);

        board.updateTitleAndContent(updateBoardRequest.getContent());
    }

}
