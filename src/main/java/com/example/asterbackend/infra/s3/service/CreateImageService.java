package com.example.asterbackend.infra.s3.service;

import com.example.asterbackend.domain.user.feed.presentation.dto.response.ImageUrlResponse;
import com.example.asterbackend.infra.s3.util.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;


@Service
@RequiredArgsConstructor
@Transactional
public class CreateImageService {

    private final S3Util s3Util;

    public ImageUrlResponse createImage(MultipartFile multipartFiles) {

        String imageUrl = s3Util.uploadImage(multipartFiles);

        return new ImageUrlResponse(imageUrl);
    }

}
