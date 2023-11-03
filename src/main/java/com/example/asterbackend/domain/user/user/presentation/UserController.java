package com.example.asterbackend.domain.user.user.presentation;

import com.example.asterbackend.domain.user.auth.presentation.dto.response.MyInfoResponse;
import com.example.asterbackend.domain.user.user.presentation.dto.request.WhoMatchRequest;
import com.example.asterbackend.domain.user.user.presentation.dto.response.GetNameResponse;
import com.example.asterbackend.domain.user.user.service.GetNameService;
import com.example.asterbackend.domain.user.user.service.MyInfoService;
import com.example.asterbackend.domain.user.user.service.WhoMatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final GetNameService getNameService;

    private final WhoMatchService whoMatchService;

    private final MyInfoService myInfoService;


    @GetMapping("/{nickname}")
    public GetNameResponse getName(@PathVariable String nickname) {
        return getNameService.getName(nickname);
    }

    @GetMapping()
    public int whoMatch(@RequestBody @Valid WhoMatchRequest request) {
        return whoMatchService.whoMatch(request);
    }

    @GetMapping
    public MyInfoResponse getMyInfo() {
        return myInfoService.getMyInfo();
    }

}