package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.presentation.dto.response.BoardListResponse;
import com.example.asterbackend.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryBoardListService {

    private final BoardRepository boardRepository;

    public List<BoardListResponse> queryBoardList() {
        return boardRepository.findAll()
                .stream()
                .map(BoardListResponse::new)
                .collect(Collectors.toList());
    }

}
