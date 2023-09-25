package com.example.asterbackend.domain.comment.presentation;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.service.CreateCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final CreateCommentService createCommentService;

    @PostMapping("/{feedId}")
    public void createComment(@RequestBody @Valid CreateAndUpdateCommentRequest request, @PathVariable Long feedId) {
        createCommentService.createComment(request, feedId);
    }

}
