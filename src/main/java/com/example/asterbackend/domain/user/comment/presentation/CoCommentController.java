package com.example.asterbackend.domain.user.comment.presentation;

import com.example.asterbackend.domain.user.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.user.comment.presentation.response.QueryCoCommentResponse;
import com.example.asterbackend.domain.user.comment.service.cocomment.CreateCoCommentService;
import com.example.asterbackend.domain.user.comment.service.cocomment.DeleteCoCommentService;
import com.example.asterbackend.domain.user.comment.service.cocomment.QueryCoCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aster/co-comment")
public class CoCommentController {

    private final CreateCoCommentService createCoCommentService;

    private final QueryCoCommentService queryCoCommentService;

    private final DeleteCoCommentService deleteCoCommentService;

    @PostMapping("/{commentId}")
    public void createCoComment(@PathVariable Long commentId, @RequestBody @Valid CommentRequest commentRequest) {
        createCoCommentService.createCoComment(commentId, commentRequest);
    }

    @GetMapping("/{commentId}")
    public List<QueryCoCommentResponse> queryCoComment(@PathVariable Long commentId) {
        return queryCoCommentService.queryCoComment(commentId);
    }

    @DeleteMapping("/{commentId}")
    public void deleteCoComment(@PathVariable Long commentId) {
        deleteCoCommentService.deleteCoComment(commentId);
    }

}
