package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.service.facade.UserFacade;
import com.example.asterbackend.infra.util.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ProfileUploadService {

    private final UserFacade userFacade;
    private final S3Util s3Facade;

    @Transactional
    public void profileUpload(MultipartFile profileImage) throws IOException {
        User user = userFacade.getCurrentUser();

        String profileImageUrl = "";

        if(user.getProfileImageUrl() != null && !user.getProfileImageUrl().isEmpty()){
            profileImageUrl = user.getProfileImageUrl();
            s3Facade.deleteFile(profileImageUrl.split("/")[3]);
        }

        profileImageUrl = s3Facade.upload(profileImage);

        user.profileUpload(profileImageUrl);

    }

}