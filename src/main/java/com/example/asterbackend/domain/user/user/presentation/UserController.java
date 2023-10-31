package com.example.asterbackend.domain.user.user.presentation;

import com.example.asterbackend.domain.user.user.presentation.dto.request.WhoMatchRequest;
import com.example.asterbackend.domain.user.user.presentation.dto.response.GetNameResponse;
import com.example.asterbackend.domain.user.user.service.GetNameService;
import com.example.asterbackend.domain.user.user.service.ProfileUploadService;
import com.example.asterbackend.domain.user.user.service.WhoMatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final ProfileUploadService profileUploadService;

    private final GetNameService getNameService;

    private final WhoMatchService whoMatchService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/profile")
    public void upload(@RequestPart(required = false, value = "image") MultipartFile profileImage){
        profileUploadService.profileUpload(profileImage);
    }

    @GetMapping("/{nickname}")
    public GetNameResponse getName(@PathVariable String nickname) {
        return getNameService.getName(nickname);
    }

    @GetMapping()
    public int whoMatch(@RequestBody @Valid WhoMatchRequest request) {
        return whoMatchService.whoMatch(request);
    }

}