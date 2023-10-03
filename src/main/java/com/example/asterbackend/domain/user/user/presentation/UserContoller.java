package com.example.asterbackend.domain.user.user.presentation;

import com.example.asterbackend.domain.user.user.presentation.dto.response.GetNameResponse;
import com.example.asterbackend.domain.user.user.service.GetNameService;
import com.example.asterbackend.domain.user.user.service.ProfileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserContoller {

    private final ProfileUploadService profileUploadService;
    private final GetNameService getNameService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/profile")
    public void upload(@RequestPart(required = false, value = "image") MultipartFile profileImage) throws IOException {
        profileUploadService.profileUpload(profileImage);
    }

    @GetMapping("/{nickname}")
    public GetNameResponse getName(@PathVariable String nickname) {
        return getNameService.getName(nickname);
    }
}
