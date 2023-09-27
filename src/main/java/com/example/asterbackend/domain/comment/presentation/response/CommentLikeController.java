package com.example.asterbackend.domain.comment.presentation.response;

import com.example.asterbackend.domain.comment.service.AddCommentLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/commentLike")
public class CommentLikeController {

    private final AddCommentLikeService addCommentLikeService;

    @PostMapping("/{commentId}")
    public void addCommentLike(@PathVariable Long commentId) {
        addCommentLikeService.addCommentLike(commentId);
    }

}
