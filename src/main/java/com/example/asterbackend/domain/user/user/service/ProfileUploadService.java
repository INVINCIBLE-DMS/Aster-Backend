package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.infra.s3.util.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ProfileUploadService {

    private final UserFacade userFacade;
    private final S3Util s3Util;

    @Transactional
    public void profileUpload(MultipartFile profileImage) {
        User user = userFacade.getCurrentUser();

        String profileImageUrl = s3Util.uploadImage(profileImage);

        user.profileUpload(profileImageUrl);

    }

}