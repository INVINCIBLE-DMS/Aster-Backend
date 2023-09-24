package com.example.asterbackend.domain.board.presentation;

import com.example.asterbackend.domain.board.service.AddLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/like")
public class LikeController {

    private final AddLikeService addLikeService;

    @PostMapping("/{boardId}")
    public void addLike(@PathVariable Long boardId) {
        addLikeService.addLike(boardId);
    }

}
