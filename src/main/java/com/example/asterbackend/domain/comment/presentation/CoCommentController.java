package com.example.asterbackend.domain.comment.presentation;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.presentation.response.QueryCoCommentResponse;
import com.example.asterbackend.domain.comment.service.CreateCoCommentService;
import com.example.asterbackend.domain.comment.service.DeleteCoCommentService;
import com.example.asterbackend.domain.comment.service.QueryCoCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/co-comment")
public class CoCommentController {

    private final CreateCoCommentService createCoCommentService;

    private final QueryCoCommentService queryCoCommentService;

    private final DeleteCoCommentService deleteCoCommentService;

    @PostMapping("/{commentId}")
    public void createCoComment(@PathVariable Long commentId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        createCoCommentService.createCoComment(commentId, request);
    }

    @GetMapping("/{commentId}")
    public List<QueryCoCommentResponse> queryCoComment(@PathVariable Long commentId) {
        return queryCoCommentService.queryCoComment(commentId);
    }

    @DeleteMapping("/{coCommentId}")
    public void deleteCoComment(@PathVariable Long coCommentId) {
        deleteCoCommentService.deleteCoComment(coCommentId);
    }

}
