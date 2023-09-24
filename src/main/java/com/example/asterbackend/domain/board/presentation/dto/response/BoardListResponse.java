package com.example.asterbackend.domain.board.presentation.dto.response;

import com.example.asterbackend.domain.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class BoardListResponse {

    private String content;

    private LocalDateTime writeTime;

    public BoardListResponse(Board board) {
        this.content = board.getContent();
        this.writeTime = board.getWriteTime();
    }

}
