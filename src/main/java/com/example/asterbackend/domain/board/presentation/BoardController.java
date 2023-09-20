package com.example.asterbackend.domain.board.presentation;

import com.example.asterbackend.domain.board.presentation.dto.request.WriteBoardRequest;
import com.example.asterbackend.domain.board.service.WriteBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final WriteBoardService writeBoardService;

    @PostMapping()
    public void writeBoard(@RequestBody @Valid WriteBoardRequest writeBoardRequest) {
        writeBoardService.writeBoard(writeBoardRequest);
    }

}
