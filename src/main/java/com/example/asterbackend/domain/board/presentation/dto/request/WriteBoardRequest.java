package com.example.asterbackend.domain.board.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class WriteBoardRequest {

    private String title;

    private String content;

    private LocalDateTime writeTime;

}
