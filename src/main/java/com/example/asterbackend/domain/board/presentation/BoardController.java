package com.example.asterbackend.domain.board.presentation;

import com.example.asterbackend.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.asterbackend.domain.board.presentation.dto.response.BoardListResponse;
import com.example.asterbackend.domain.board.service.CreateBoardService;
import com.example.asterbackend.domain.board.service.QueryBoardListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final CreateBoardService createBoardService;

    private final QueryBoardListService queryBoardListService;

    @PostMapping()
    public void createBoard(@RequestBody @Valid CreateBoardRequest createBoardRequest) {
        createBoardService.createBoard(createBoardRequest);
    }

    @GetMapping()
    public List<BoardListResponse> queryBoardList() {
        return queryBoardListService.queryBoardList();
    }

}
