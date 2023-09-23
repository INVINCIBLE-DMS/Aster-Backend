package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteBoardService {

    private final BoardRepository boardRepository;

    public void deleteBoard(Long boardId) {
        boardRepository.deleteById(boardId);
    }

}
