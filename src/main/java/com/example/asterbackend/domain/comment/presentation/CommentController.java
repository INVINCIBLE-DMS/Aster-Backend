package com.example.asterbackend.domain.comment.presentation;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.service.CreateCommentService;
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

    @PostMapping("/{feedId}")
    public void createComment(@PathVariable Long feedId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        createCommentService.createComment(feedId, request);
    }

    @PatchMapping("/{feedId}")
    public void updateComment(@PathVariable Long feedId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        updateCommentService.updateComment(feedId, request);
    }

}
