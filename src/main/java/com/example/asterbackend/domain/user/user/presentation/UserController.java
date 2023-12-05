package com.example.asterbackend.domain.user.user.presentation;

import com.example.asterbackend.domain.user.auth.presentation.dto.response.MyInfoResponse;
import com.example.asterbackend.domain.user.user.presentation.dto.request.BothMatchRequest;
import com.example.asterbackend.domain.user.user.presentation.dto.request.WhoMatchRequest;
import com.example.asterbackend.domain.user.user.service.BothMatchService;
import com.example.asterbackend.domain.user.user.service.DeleteUserService;
import com.example.asterbackend.domain.user.user.service.MyInfoService;
import com.example.asterbackend.domain.user.user.service.WhoMatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aster/user")
public class UserController {

    private final WhoMatchService whoMatchService;

    private final BothMatchService bothMatchService;

    private final MyInfoService myInfoService;

    private final DeleteUserService deleteUserService;

    @GetMapping("/{username}")
    public int whoMatch(@PathVariable String username) {
        return whoMatchService.whoMatch(username);
    }

    @GetMapping("/both/{username1}/{username2}")
    public int bothMatch(@PathVariable String username1, @PathVariable String username2) {
        return bothMatchService.bothMatch(username1, username2);
    }

    @GetMapping("/my-info")
    public MyInfoResponse getMyInfo() {
        return myInfoService.getMyInfo();
    }

    @DeleteMapping()
    public void deleteAllUser() {
        deleteUserService.deleteAllUser();
    }

}