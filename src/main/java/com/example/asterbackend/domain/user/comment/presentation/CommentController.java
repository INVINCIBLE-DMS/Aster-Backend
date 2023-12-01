package com.example.asterbackend.domain.user.comment.presentation;

import com.example.asterbackend.domain.user.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.user.comment.presentation.response.FeedAndCommentsResponse;
import com.example.asterbackend.domain.user.comment.service.comment.CreateCommentService;
import com.example.asterbackend.domain.user.comment.service.comment.DeleteCommentService;
import com.example.asterbackend.domain.user.comment.service.comment.QueryCommentService;
import com.example.asterbackend.domain.user.comment.service.comment.UpdateCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final CreateCommentService createCommentService;

    private final QueryCommentService queryCommentService;

    private final UpdateCommentService updateCommentService;

    private final DeleteCommentService deleteCommentService;

    @PostMapping("/{feedId}")
    public void createComment(@PathVariable Long feedId, @RequestBody @Valid CommentRequest commentRequest) {
        createCommentService.createComment(feedId, commentRequest);
    }

    @GetMapping("/{feedId}")
    public FeedAndCommentsResponse queryComment(@PathVariable Long feedId) {
        return queryCommentService.queryComment(feedId);
    }

    @PatchMapping("/{commentId}")
    public void updateComment(@PathVariable Long commentId, @RequestBody @Valid CommentRequest commentRequest) {
        updateCommentService.updateComment(commentId, commentRequest);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable Long commentId) {
        deleteCommentService.deleteComment(commentId);
    }

}
