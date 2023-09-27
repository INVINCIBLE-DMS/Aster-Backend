package com.example.asterbackend.domain.comment.presentation;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.service.CreateCommentService;
import com.example.asterbackend.domain.comment.service.DeleteCommentService;
import com.example.asterbackend.domain.comment.service.UpdateCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final CreateCommentService createCommentService;

    private final UpdateCommentService updateCommentService;

    private final DeleteCommentService deleteCommentService;

    @PostMapping("/{feedId}")
    public void createComment(@PathVariable Long feedId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        createCommentService.createComment(feedId, request);
    }

    @PatchMapping("/{commentId}")
    public void updateComment(@PathVariable Long commentId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        updateCommentService.updateComment(commentId, request);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable Long commentId) {
        deleteCommentService.deleteComment(commentId);
    }

}
