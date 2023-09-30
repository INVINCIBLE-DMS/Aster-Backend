package com.example.asterbackend.domain.student.service;

import com.example.asterbackend.domain.student.domain.Student;
import com.example.asterbackend.domain.student.domain.repository.StudentRepository;
import com.example.asterbackend.domain.user.entity.type.Sex;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void studentName() {

        studentRepository.deleteAll(); // 이전의 모든 유저 정보 삭제

        List<Student> studentList = new ArrayList<>();

        //1-1반
        studentList.add(new Student(1101, "권민휘", Sex.MALE));
        studentList.add(new Student(1102, "김가은", Sex.FEMALE));
        studentList.add(new Student(1103, "김강민", Sex.MALE));
        studentList.add(new Student(1104, "김명진", Sex.FEMALE));
        studentList.add(new Student(1105, "김현성", Sex.MALE));
        studentList.add(new Student(1106, "김희찬", Sex.MALE));
        studentList.add(new Student(1107, "박재민", Sex.MALE));
        studentList.add(new Student(1108, "부현수", Sex.MALE));
        studentList.add(new Student(1109, "오송주", Sex.MALE));
        studentList.add(new Student(1110, "오현규", Sex.MALE));
        studentList.add(new Student(1111, "유하은", Sex.FEMALE));
        studentList.add(new Student(1112, "이지후", Sex.MALE));
        studentList.add(new Student(1113, "이태윤", Sex.MALE));
        studentList.add(new Student(1114, "이하윤", Sex.FEMALE));
        studentList.add(new Student(1115, "조영준", Sex.MALE));
        studentList.add(new Student(1116, "홍서은", Sex.FEMALE));

        //1-2반
        studentList.add(new Student(1201, "강태양", Sex.MALE));
        studentList.add(new Student(1202, "김호선", Sex.MALE));
        studentList.add(new Student(1203, "노승준", Sex.MALE));
        studentList.add(new Student(1204, "박예빈", Sex.FEMALE));
        studentList.add(new Student(1205, "서동빈", Sex.MALE));
        studentList.add(new Student(1206, "안승민", Sex.MALE));
        studentList.add(new Student(1207, "양윤호", Sex.FEMALE));
        studentList.add(new Student(1208, "유지우", Sex.MALE));
        studentList.add(new Student(1209, "이강희", Sex.MALE));
        studentList.add(new Student(1210, "이금규", Sex.MALE));
        studentList.add(new Student(1211, "이의진", Sex.FEMALE));
        studentList.add(new Student(1212, "이태규", Sex.MALE));
        studentList.add(new Student(1213, "차은비", Sex.FEMALE));
        studentList.add(new Student(1214, "최유준", Sex.MALE));
        studentList.add(new Student(1215, "최희영", Sex.FEMALE));
        studentList.add(new Student(1216, "한건희", Sex.MALE));

        //1-3반
        studentList.add(new Student(1301, "강현욱", Sex.MALE));
        studentList.add(new Student(1302, "김민재", Sex.MALE));
        studentList.add(new Student(1303, "김시열", Sex.MALE));
        studentList.add(new Student(1304, "김효정", Sex.FEMALE));
        studentList.add(new Student(1305, "남궁윤교", Sex.MALE));
        studentList.add(new Student(1306, "박의엘", Sex.MALE));
        studentList.add(new Student(1307, "서예린", Sex.FEMALE));
        studentList.add(new Student(1308, "오재영", Sex.MALE));
        studentList.add(new Student(1309, "원은지", Sex.FEMALE));
        studentList.add(new Student(1310, "유연준", Sex.MALE));
        studentList.add(new Student(1311, "육기준", Sex.MALE));
        studentList.add(new Student(1312, "이나경", Sex.FEMALE));
        studentList.add(new Student(1313, "이은성", Sex.MALE));
        studentList.add(new Student(1314, "이은호", Sex.MALE));
        studentList.add(new Student(1315, "임다영", Sex.FEMALE));
        studentList.add(new Student(1316, "조현민", Sex.MALE));

        //1-4반
        studentList.add(new Student(1401, "강해민", Sex.FEMALE));
        studentList.add(new Student(1402, "고은총", Sex.MALE));
        studentList.add(new Student(1403, "김대운", Sex.MALE));
        studentList.add(new Student(1404, "김도경", Sex.MALE));
        studentList.add(new Student(1405, "김승원", Sex.MALE));
        studentList.add(new Student(1406, "김어진", Sex.FEMALE));
        studentList.add(new Student(1407, "김준화", Sex.MALE));
        studentList.add(new Student(1408, "박수현", Sex.FEMALE));
        studentList.add(new Student(1409, "박지민", Sex.MALE));
        studentList.add(new Student(1410, "박현아", Sex.FEMALE));
        studentList.add(new Student(1411, "백승휘", Sex.MALE));
        studentList.add(new Student(1412, "변정현", Sex.MALE));
        studentList.add(new Student(1413, "이영하", Sex.MALE));
        studentList.add(new Student(1414, "이재영", Sex.MALE));
        studentList.add(new Student(1415, "이태영", Sex.MALE));
        studentList.add(new Student(1416, "최은빈", Sex.FEMALE));

        //2-1반
        studentList.add(new Student(2101, "강지인", Sex.MALE));
        studentList.add(new Student(2102, "강진현", Sex.MALE));
        studentList.add(new Student(2103, "길근우", Sex.MALE));
        studentList.add(new Student(2104, "김세현", Sex.MALE));
        studentList.add(new Student(2105, "김소연", Sex.FEMALE));
        studentList.add(new Student(2106, "김은빈", Sex.FEMALE));
        studentList.add(new Student(2107, "김정현", Sex.MALE));
        studentList.add(new Student(2108, "김주영", Sex.FEMALE));
        studentList.add(new Student(2109, "박도연", Sex.MALE));
        studentList.add(new Student(2110, "서유정", Sex.FEMALE));
        studentList.add(new Student(2111, "심예찬", Sex.MALE));
        studentList.add(new Student(2112, "양운석", Sex.MALE));
        studentList.add(new Student(2113, "유나현", Sex.FEMALE));
        studentList.add(new Student(2114, "이정호", Sex.MALE));
        studentList.add(new Student(2115, "이하성", Sex.MALE));
        studentList.add(new Student(2116, "조문성", Sex.MALE));
        studentList.add(new Student(2117, "조병진", Sex.MALE));
        studentList.add(new Student(2118, "최승우", Sex.MALE));

        //2-2반
        studentList.add(new Student(2201, "강민", Sex.MALE));
        studentList.add(new Student(2202, "강인혜", Sex.FEMALE));
        studentList.add(new Student(2203, "김규하", Sex.FEMALE));
        studentList.add(new Student(2204, "김민수", Sex.MALE));
        studentList.add(new Student(2205, "김민채", Sex.FEMALE));
        studentList.add(new Student(2206, "김상구", Sex.MALE));
        studentList.add(new Student(2207, "김성원", Sex.MALE));
        studentList.add(new Student(2208, "김은오", Sex.MALE));
        studentList.add(new Student(2209, "문성화", Sex.MALE));
        studentList.add(new Student(2210, "박주영", Sex.MALE));
        studentList.add(new Student(2211, "박준수", Sex.MALE));
        studentList.add(new Student(2212, "이강혁", Sex.MALE));
        studentList.add(new Student(2213, "임태곤", Sex.MALE));
        studentList.add(new Student(2214, "정승훈", Sex.MALE));
        studentList.add(new Student(2215, "정지관", Sex.MALE));
        studentList.add(new Student(2216, "최성현", Sex.MALE));
        studentList.add(new Student(2217, "최하은", Sex.FEMALE));
        studentList.add(new Student(2218, "홍승재", Sex.MALE));

        //2-3반
        studentList.add(new Student(2301, "강명석", Sex.MALE));
        studentList.add(new Student(2302, "강용수", Sex.MALE));
        studentList.add(new Student(2303, "김민승", Sex.MALE));
        studentList.add(new Student(2304, "김승현", Sex.MALE));
        studentList.add(new Student(2305, "김주원", Sex.MALE));
        studentList.add(new Student(2306, "김한비", Sex.FEMALE));
        studentList.add(new Student(2307, "김현민", Sex.MALE));
        studentList.add(new Student(2308, "마재영", Sex.MALE));
        studentList.add(new Student(2309, "안윤지", Sex.FEMALE));
        studentList.add(new Student(2310, "유현담", Sex.MALE));
        studentList.add(new Student(2311, "이효연", Sex.FEMALE));
        studentList.add(new Student(2312, "한예슬", Sex.FEMALE));

        //2-4반
        studentList.add(new Student(2401, "권하은", Sex.FEMALE));
        studentList.add(new Student(2402, "김연우", Sex.MALE));
        studentList.add(new Student(2403, "김지훈", Sex.MALE));
        studentList.add(new Student(2404, "김철우", Sex.MALE));
        studentList.add(new Student(2405, "김현석", Sex.MALE));
        studentList.add(new Student(2406, "도원준", Sex.MALE));
        studentList.add(new Student(2407, "박준하", Sex.MALE));
        studentList.add(new Student(2408, "서지호", Sex.MALE));
        studentList.add(new Student(2409, "양지은", Sex.FEMALE));
        studentList.add(new Student(2410, "양희범", Sex.MALE));
        studentList.add(new Student(2411, "오성환", Sex.MALE));
        studentList.add(new Student(2412, "유찬홍", Sex.MALE));
        studentList.add(new Student(2413, "이원성", Sex.MALE));
        studentList.add(new Student(2414, "이재동", Sex.MALE));
        studentList.add(new Student(2415, "이재하", Sex.MALE));
        studentList.add(new Student(2416, "이준영", Sex.MALE));
        studentList.add(new Student(2417, "장지성", Sex.MALE));
        studentList.add(new Student(2418, "조민준", Sex.MALE));

        //3-1반
        studentList.add(new Student(3101, "강석현", Sex.MALE));
        studentList.add(new Student(3102, "김경호", Sex.MALE));
        studentList.add(new Student(3103, "김기영", Sex.MALE));
        studentList.add(new Student(3104, "김민성", Sex.MALE));
        studentList.add(new Student(3105, "김시안", Sex.FEMALE));
        studentList.add(new Student(3106, "김태원", Sex.MALE));
        studentList.add(new Student(3107, "문정민", Sex.MALE));
        studentList.add(new Student(3108, "박상진", Sex.MALE));
        studentList.add(new Student(3109, "신윤호", Sex.MALE));
        studentList.add(new Student(3110, "안민우", Sex.MALE));
        studentList.add(new Student(3111, "양지원", Sex.FEMALE));
        studentList.add(new Student(3112, "오상우", Sex.MALE));
        studentList.add(new Student(3113, "유현명", Sex.MALE));
        studentList.add(new Student(3114, "이경수", Sex.MALE));
        studentList.add(new Student(3115, "이상운", Sex.MALE));
        studentList.add(new Student(3116, "이예빈", Sex.FEMALE));
        studentList.add(new Student(3117, "이준범", Sex.MALE));
        studentList.add(new Student(3118, "이준서", Sex.MALE));
        studentList.add(new Student(3119, "정대현", Sex.MALE));
        studentList.add(new Student(3120, "하태라", Sex.MALE));

        //3-2반
        studentList.add(new Student(3201, "강한별", Sex.MALE));
        studentList.add(new Student(3202, "김대희", Sex.MALE));
        studentList.add(new Student(3203, "김범진", Sex.MALE));
        studentList.add(new Student(3204, "김의찬", Sex.MALE));
        studentList.add(new Student(3205, "김준호", Sex.MALE));
        studentList.add(new Student(3206, "김진건", Sex.MALE));
        studentList.add(new Student(3207, "김태완", Sex.MALE));
        studentList.add(new Student(3208, "김호영", Sex.MALE));
        studentList.add(new Student(3209, "박상민", Sex.MALE));
        studentList.add(new Student(3210, "박세연", Sex.FEMALE));
        studentList.add(new Student(3211, "박휘응", Sex.MALE));
        studentList.add(new Student(3212, "손재민", Sex.MALE));
        studentList.add(new Student(3213, "오정수", Sex.MALE));
        studentList.add(new Student(3214, "이진형", Sex.MALE));
        studentList.add(new Student(3215, "임세현", Sex.MALE));
        studentList.add(new Student(3216, "장석연", Sex.MALE));
        studentList.add(new Student(3217, "조경현", Sex.MALE));
        studentList.add(new Student(3218, "조상현", Sex.MALE));
        studentList.add(new Student(3219, "추혜연", Sex.FEMALE));

        //3-3반
        studentList.add(new Student(3301, "김순호", Sex.FEMALE));
        studentList.add(new Student(3302, "김유빈", Sex.MALE));
        studentList.add(new Student(3303, "김지민", Sex.MALE));
        studentList.add(new Student(3304, "김태완", Sex.MALE));
        studentList.add(new Student(3305, "문정우", Sex.MALE));
        studentList.add(new Student(3306, "박종민", Sex.MALE));
        studentList.add(new Student(3307, "손지원", Sex.MALE));
        studentList.add(new Student(3308, "양채원", Sex.FEMALE));
        studentList.add(new Student(3309, "이용진", Sex.MALE));
        studentList.add(new Student(3310, "이정윤", Sex.MALE));
        studentList.add(new Student(3311, "이주찬", Sex.MALE));
        studentList.add(new Student(3312, "전민준", Sex.MALE));
        studentList.add(new Student(3313, "전세현", Sex.MALE));
        studentList.add(new Student(3314, "조우상", Sex.MALE));
        studentList.add(new Student(3315, "주보미", Sex.FEMALE));
        studentList.add(new Student(3316, "최영진", Sex.MALE));
        studentList.add(new Student(3317, "황진성", Sex.MALE));

        //3-4반
        studentList.add(new Student(3401, "김승진", Sex.MALE));
        studentList.add(new Student(3402, "김운일", Sex.MALE));
        studentList.add(new Student(3403, "남요셉", Sex.MALE));
        studentList.add(new Student(3404, "박민서", Sex.MALE));
        studentList.add(new Student(3405, "배준수", Sex.MALE));
        studentList.add(new Student(3406, "안도현", Sex.MALE));
        studentList.add(new Student(3407, "안진우", Sex.MALE));
        studentList.add(new Student(3408, "오주혜", Sex.FEMALE));
        studentList.add(new Student(3409, "이동현", Sex.MALE));
        studentList.add(new Student(3410, "임수빈", Sex.FEMALE));
        studentList.add(new Student(3411, "전서휘", Sex.MALE));
        studentList.add(new Student(3412, "전영준", Sex.MALE));
        studentList.add(new Student(3413, "채희성", Sex.MALE));
        studentList.add(new Student(3414, "최성현", Sex.MALE));
        studentList.add(new Student(3415, "최소연", Sex.FEMALE));
        studentList.add(new Student(3416, "최유빈", Sex.MALE));
        studentList.add(new Student(3417, "최희", Sex.FEMALE));
        studentList.add(new Student(3418, "하혜령", Sex.FEMALE));
        studentList.add(new Student(3419, "홍아연", Sex.FEMALE));

        studentRepository.saveAll(studentList);

    }
}