package com.example.asterbackend.domain.board.service;

import com.example.asterbackend.domain.board.entity.Board;
import com.example.asterbackend.domain.board.entity.Like;
import com.example.asterbackend.domain.board.facade.BoardFacade;
import com.example.asterbackend.domain.board.repository.LikeRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddLikeService {

    private final BoardFacade boardFacade;

    private final UserFacade userFacade;

    private final LikeRepository likeRepository;

    public void addLike(Long boardId) {
        Board board = boardFacade.currentBoard(boardId);

        User user = userFacade.getCurrentUser();

        board.addLike();

        likeRepository.save(
                Like.builder()
                        .board(board)
                        .nickname(user.getNickname())
                        .build());
    }

}
