package com.example.asterbackend.domain.board.presentation;

import com.example.asterbackend.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.asterbackend.domain.board.presentation.dto.request.UpdateBoardRequest;
import com.example.asterbackend.domain.board.presentation.dto.response.BoardListResponse;
import com.example.asterbackend.domain.board.service.CreateBoardService;
import com.example.asterbackend.domain.board.service.DeleteBoardService;
import com.example.asterbackend.domain.board.service.QueryBoardListService;
import com.example.asterbackend.domain.board.service.UpdateBoardService;
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

    private final UpdateBoardService updateBoardService;

    private final DeleteBoardService deleteBoardService;

    @PostMapping()
    public void createBoard(@RequestBody @Valid CreateBoardRequest createBoardRequest) {
        createBoardService.createBoard(createBoardRequest);
    }

    @GetMapping()
    public List<BoardListResponse> queryBoardList() {
        return queryBoardListService.queryBoardList();
    }

    @PatchMapping("/{boardId}")
    public void updateBoard(@RequestBody @Valid UpdateBoardRequest updateBoardRequest, @PathVariable Long boardId) {
        updateBoardService.updateBoard(updateBoardRequest, boardId);
    }

    @DeleteMapping("/{boardId}")
    public void removeBoard(@PathVariable Long boardId) {
        deleteBoardService.deleteBoard(boardId);
    }

}
