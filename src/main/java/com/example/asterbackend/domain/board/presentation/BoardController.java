package com.example.asterbackend.domain.board.presentation;

import com.example.asterbackend.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.asterbackend.domain.board.service.CreateBoardService;
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

    private final CreateBoardService createBoardService;

    @PostMapping()
    public void writeBoard(@RequestBody @Valid CreateBoardRequest createBoardRequest) {
        createBoardService.createBoard(createBoardRequest);
    }

}
