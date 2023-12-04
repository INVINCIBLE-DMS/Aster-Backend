package com.example.asterbackend.domain.user.feed.presentation;

import com.example.asterbackend.domain.user.feed.service.AddLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aster/like")
public class LikeController {

    private final AddLikeService addLikeService;

    @PostMapping("/{feedId}")
    public void addLike(@PathVariable Long feedId) {
        addLikeService.addLike(feedId);
    }

}
