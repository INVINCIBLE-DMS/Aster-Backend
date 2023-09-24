package com.example.asterbackend.domain.board.presentation.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateBoardRequest {

    private String content;

    private LocalDateTime writeTime;

}
