package com.example.asterbackend.domain.feed.presentation;

import com.example.asterbackend.domain.feed.service.AddLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/like")
public class LikeController {

    private final AddLikeService addLikeService;

    @PostMapping("/{feedId}")
    public void addLike(@PathVariable Long feedId) {
        addLikeService.addLike(feedId);
    }

}
