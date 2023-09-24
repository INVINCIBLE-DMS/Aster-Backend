package com.example.asterbackend.domain.board.entity;

import com.example.asterbackend.domain.user.entity.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_nickname")
    private User user;

    @Column(name = "content", nullable = false, length = 200)
    private String content;

    @Column(name = "write_time", nullable = false)
    private LocalDateTime writeTime;

    @Column(name = "like_count", nullable = false)
    private int likeCount = 0;

    @OneToMany(mappedBy = "board")
    private List<Like> likeList = new ArrayList<>();

    public void updateTitleAndContent(String content) {
        this.content = content;
    }

    public void addLike() {
        likeCount++;
    }

    public void cancelLike() {
        likeCount--;
    }

}
