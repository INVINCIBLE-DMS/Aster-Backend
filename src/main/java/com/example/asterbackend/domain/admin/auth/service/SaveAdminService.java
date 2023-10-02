package com.example.asterbackend.domain.admin.auth.service;

import com.example.asterbackend.domain.admin.user.entity.Admin;
import com.example.asterbackend.domain.admin.user.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SaveAdminService {

    private final AdminRepository adminRepository;

    public void saveAdmin() {
        adminRepository.deleteAll();

        List<Admin> adminList = new ArrayList<>();

        adminList.add(new Admin("강태양"));
        adminList.add(new Admin("김명진"));
        adminList.add(new Admin("박의엘"));
        adminList.add(new Admin("변정현"));
        adminList.add(new Admin("육기준"));
        adminList.add(new Admin("이의진"));
        adminList.add(new Admin("이지후"));
        adminList.add(new Admin("이태규"));

        adminRepository.saveAll(adminList);
    }

}
