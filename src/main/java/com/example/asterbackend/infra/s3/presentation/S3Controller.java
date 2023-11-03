package com.example.asterbackend.infra.s3.presentation;

import com.example.asterbackend.domain.user.feed.presentation.dto.response.ImageUrlResponse;
import com.example.asterbackend.infra.s3.service.CreateImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/image")
public class S3Controller {

    private final CreateImageService createImageService;

    @PostMapping
    public ImageUrlResponse createImage(@RequestPart(value = "image", required = false) MultipartFile multipartFiles) {
        return createImageService.createImage(multipartFiles);
    }
}
