package com.example.asterbackend.domain.user.user.presentation;

import com.example.asterbackend.domain.user.auth.presentation.dto.response.MyInfoResponse;
import com.example.asterbackend.domain.user.user.presentation.dto.request.BothMatchRequest;
import com.example.asterbackend.domain.user.user.presentation.dto.request.WhoMatchRequest;
import com.example.asterbackend.domain.user.user.service.BothMatchService;
import com.example.asterbackend.domain.user.user.service.MyInfoService;
import com.example.asterbackend.domain.user.user.service.WhoMatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final WhoMatchService whoMatchService;

    private final BothMatchService bothMatchService;

    private final MyInfoService myInfoService;


    @GetMapping()
    public int whoMatch(@RequestBody @Valid WhoMatchRequest request) {
        return whoMatchService.whoMatch(request);
    }

    @GetMapping("/both")
    public int bothMatch(@RequestBody @Valid BothMatchRequest request) {
        return bothMatchService.bothMatch(request);
    }

    @GetMapping("/my-info")
    public MyInfoResponse getMyInfo() {
        return myInfoService.getMyInfo();
    }

}