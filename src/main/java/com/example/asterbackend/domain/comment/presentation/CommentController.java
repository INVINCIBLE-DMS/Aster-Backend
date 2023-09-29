package com.example.asterbackend.domain.comment.presentation;

import com.example.asterbackend.domain.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.presentation.response.QueryCommentResponse;
import com.example.asterbackend.domain.comment.service.comment.CreateCommentService;
import com.example.asterbackend.domain.comment.service.comment.DeleteCommentService;
import com.example.asterbackend.domain.comment.service.comment.QueryCommentService;
import com.example.asterbackend.domain.comment.service.comment.UpdateCommentService;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public List<QueryCommentResponse> queryComment(@PathVariable Long feedId) {
        return queryCommentService.queryComment(feedId);
    }

    @PatchMapping("/{commentId}")
    public void updateComment(@PathVariable Long commentId, @RequestBody @Valid SurveyRequest request) {
        updateCommentService.updateComment(commentId, request);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable Long commentId) {
        deleteCommentService.deleteComment(commentId);
    }

}
