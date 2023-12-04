package com.example.asterbackend.domain.user.student.service;

import com.example.asterbackend.domain.user.student.entity.Student;
import com.example.asterbackend.domain.user.student.repository.StudentRepository;
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
        studentList.add(new Student("1101", "권민휘"));
        studentList.add(new Student("1102", "김가은"));
        studentList.add(new Student("1103", "김강민"));
        studentList.add(new Student("1104", "김명진"));
        studentList.add(new Student("1105", "김현성"));
        studentList.add(new Student("1106", "김희찬"));
        studentList.add(new Student("1107", "박재민"));
        studentList.add(new Student("1108", "부현수"));
        studentList.add(new Student("1109", "오송주"));
        studentList.add(new Student("1110", "오현규"));
        studentList.add(new Student("1111", "유하은"));
        studentList.add(new Student("1112", "이지후"));
        studentList.add(new Student("1113", "이태윤"));
        studentList.add(new Student("1114", "이하윤"));
        studentList.add(new Student("1115", "조영준"));
        studentList.add(new Student("1116", "홍서은"));

// 1-2반
        studentList.add(new Student("1201", "강태양"));
        studentList.add(new Student("1202", "김호선"));
        studentList.add(new Student("1203", "노승준"));
        studentList.add(new Student("1204", "박예빈"));
        studentList.add(new Student("1205", "서동빈"));
        studentList.add(new Student("1206", "안승민"));
        studentList.add(new Student("1207", "양윤호"));
        studentList.add(new Student("1208", "유지우"));
        studentList.add(new Student("1209", "이강희"));
        studentList.add(new Student("1210", "이금규"));
        studentList.add(new Student("1211", "이의진"));
        studentList.add(new Student("1212", "이태규"));
        studentList.add(new Student("1213", "차은비"));
        studentList.add(new Student("1214", "최유준"));
        studentList.add(new Student("1215", "최희영"));
        studentList.add(new Student("1216", "한건희"));

// 1-3반
        studentList.add(new Student("1301", "강현욱"));
        studentList.add(new Student("1302", "김민재"));
        studentList.add(new Student("1303", "김시열"));
        studentList.add(new Student("1304", "김효정"));
        studentList.add(new Student("1305", "남궁윤교"));
        studentList.add(new Student("1306", "박의엘"));
        studentList.add(new Student("1307", "서예린"));
        studentList.add(new Student("1308", "오재영"));
        studentList.add(new Student("1309", "원은지"));
        studentList.add(new Student("1310", "유연준"));
        studentList.add(new Student("1311", "육기준"));
        studentList.add(new Student("1312", "이나경"));
        studentList.add(new Student("1313", "이은성"));
        studentList.add(new Student("1314", "이은호"));
        studentList.add(new Student("1315", "임다영"));
        studentList.add(new Student("1316", "조현민"));

// 1-4반
        studentList.add(new Student("1401", "강해민"));
        studentList.add(new Student("1402", "고은총"));
        studentList.add(new Student("1403", "김대운"));
        studentList.add(new Student("1404", "김도경"));
        studentList.add(new Student("1405", "김승원"));
        studentList.add(new Student("1406", "김어진"));
        studentList.add(new Student("1407", "김준화"));
        studentList.add(new Student("1408", "박수현"));
        studentList.add(new Student("1409", "박지민"));
        studentList.add(new Student("1410", "박현아"));
        studentList.add(new Student("1411", "백승휘"));
        studentList.add(new Student("1412", "변정현"));
        studentList.add(new Student("1413", "이영하"));
        studentList.add(new Student("1414", "이재영"));
        studentList.add(new Student("1415", "이태영"));
        studentList.add(new Student("1416", "최은빈"));

        //2-1반
        studentList.add(new Student("2101", "강지인"));
        studentList.add(new Student("2102", "강진현"));
        studentList.add(new Student("2103", "길근우"));
        studentList.add(new Student("2104", "김세현"));
        studentList.add(new Student("2105", "김소연"));
        studentList.add(new Student("2106", "김은빈"));
        studentList.add(new Student("2107", "김정현"));
        studentList.add(new Student("2108", "김주영"));
        studentList.add(new Student("2109", "박도연"));
        studentList.add(new Student("2110", "서유정"));
        studentList.add(new Student("2111", "심예찬"));
        studentList.add(new Student("2112", "양운석"));
        studentList.add(new Student("2113", "유나현"));
        studentList.add(new Student("2114", "이정호"));
        studentList.add(new Student("2115", "이하성"));
        studentList.add(new Student("2116", "조문성"));
        studentList.add(new Student("2117", "조병진"));
        studentList.add(new Student("2118", "최승우"));

        //2-2반
        studentList.add(new Student("2201", "강민"));
        studentList.add(new Student("2202", "강인혜"));
        studentList.add(new Student("2203", "김규하"));
        studentList.add(new Student("2204", "김민수"));
        studentList.add(new Student("2205", "김민채"));
        studentList.add(new Student("2206", "김상구"));
        studentList.add(new Student("2207", "김성원"));
        studentList.add(new Student("2208", "김은오"));
        studentList.add(new Student("2209", "문성화"));
        studentList.add(new Student("2210", "박주영"));
        studentList.add(new Student("2211", "박준수"));
        studentList.add(new Student("2212", "이강혁"));
        studentList.add(new Student("2213", "임태곤"));
        studentList.add(new Student("2214", "정승훈"));
        studentList.add(new Student("2215", "정지관"));
        studentList.add(new Student("2216", "최성현"));
        studentList.add(new Student("2217", "최하은"));
        studentList.add(new Student("2218", "홍승재"));

        //2-3반
        studentList.add(new Student("2301", "강명석"));
        studentList.add(new Student("2302", "강용수"));
        studentList.add(new Student("2303", "김민승"));
        studentList.add(new Student("2304", "김승현"));
        studentList.add(new Student("2305", "김주원"));
        studentList.add(new Student("2306", "김한비"));
        studentList.add(new Student("2307", "김현민"));
        studentList.add(new Student("2308", "마재영"));
        studentList.add(new Student("2309", "안윤지"));
        studentList.add(new Student("2310", "유현담"));
        studentList.add(new Student("2311", "이효연"));
        studentList.add(new Student("2312", "한예슬"));

        //2-4반
        studentList.add(new Student("2401", "권하은"));
        studentList.add(new Student("2402", "김연우"));
        studentList.add(new Student("2403", "김지훈"));
        studentList.add(new Student("2404", "김철우"));
        studentList.add(new Student("2405", "김현석"));
        studentList.add(new Student("2406", "도원준"));
        studentList.add(new Student("2407", "박준하"));
        studentList.add(new Student("2408", "서지호"));
        studentList.add(new Student("2409", "양지은"));
        studentList.add(new Student("2410", "양희범"));
        studentList.add(new Student("2411", "오성환"));
        studentList.add(new Student("2412", "유찬홍"));
        studentList.add(new Student("2413", "이원성"));
        studentList.add(new Student("2414", "이재동"));
        studentList.add(new Student("2415", "이재하"));
        studentList.add(new Student("2416", "이준영"));
        studentList.add(new Student("2417", "장지성"));
        studentList.add(new Student("2418", "조민준"));

        //3-1반
        studentList.add(new Student("3101", "강석현"));
        studentList.add(new Student("3102", "김경호"));
        studentList.add(new Student("3103", "김기영"));
        studentList.add(new Student("3104", "김민성"));
        studentList.add(new Student("3105", "김시안"));
        studentList.add(new Student("3106", "김태원"));
        studentList.add(new Student("3107", "문정민"));
        studentList.add(new Student("3108", "박상진"));
        studentList.add(new Student("3109", "신윤호"));
        studentList.add(new Student("3110", "안민우"));
        studentList.add(new Student("3111", "양지원"));
        studentList.add(new Student("3112", "오상우"));
        studentList.add(new Student("3113", "유현명"));
        studentList.add(new Student("3114", "이경수"));
        studentList.add(new Student("3115", "이상운"));
        studentList.add(new Student("3116", "이예빈"));
        studentList.add(new Student("3117", "이준범"));
        studentList.add(new Student("3118", "이준서"));
        studentList.add(new Student("3119", "정대현"));
        studentList.add(new Student("3120", "하태라"));

        //3-2반
        studentList.add(new Student("3201", "강한별"));
        studentList.add(new Student("3202", "김대희"));
        studentList.add(new Student("3203", "김범진"));
        studentList.add(new Student("3204", "김의찬"));
        studentList.add(new Student("3205", "김준호"));
        studentList.add(new Student("3206", "김진건"));
        studentList.add(new Student("3207", "김태완"));
        studentList.add(new Student("3208", "김호영"));
        studentList.add(new Student("3209", "박상민"));
        studentList.add(new Student("3210", "박세연"));
        studentList.add(new Student("3211", "박휘응"));
        studentList.add(new Student("3212", "손재민"));
        studentList.add(new Student("3213", "오정수"));
        studentList.add(new Student("3214", "이진형"));
        studentList.add(new Student("3215", "임세현"));
        studentList.add(new Student("3216", "장석연"));
        studentList.add(new Student("3217", "조경현"));
        studentList.add(new Student("3218", "조상현"));
        studentList.add(new Student("3219", "추혜연"));

        //3-3반
        studentList.add(new Student("3301", "김순호"));
        studentList.add(new Student("3302", "김유빈"));
        studentList.add(new Student("3303", "김지민"));
        studentList.add(new Student("3304", "김태완"));
        studentList.add(new Student("3305", "문정우"));
        studentList.add(new Student("3306", "박종민"));
        studentList.add(new Student("3307", "손지원"));
        studentList.add(new Student("3308", "양채원"));
        studentList.add(new Student("3309", "이용진"));
        studentList.add(new Student("3310", "이정윤"));
        studentList.add(new Student("3311", "이주찬"));
        studentList.add(new Student("3312", "전민준"));
        studentList.add(new Student("3313", "전세현"));
        studentList.add(new Student("3314", "조우상"));
        studentList.add(new Student("3315", "주보미"));
        studentList.add(new Student("3316", "최영진"));
        studentList.add(new Student("3317", "황진성"));

        //3-4반
        studentList.add(new Student("3401", "김승진"));
        studentList.add(new Student("3402", "김운일"));
        studentList.add(new Student("3403", "남요셉"));
        studentList.add(new Student("3404", "박민서"));
        studentList.add(new Student("3405", "배준수"));
        studentList.add(new Student("3406", "안도현"));
        studentList.add(new Student("3407", "안진우"));
        studentList.add(new Student("3408", "오주혜"));
        studentList.add(new Student("3409", "이동현"));
        studentList.add(new Student("3410", "임수빈"));
        studentList.add(new Student("3411", "전서휘"));
        studentList.add(new Student("3412", "전영준"));
        studentList.add(new Student("3413", "채희성"));
        studentList.add(new Student("3414", "최성현"));
        studentList.add(new Student("3415", "최소연"));
        studentList.add(new Student("3416", "최유빈"));
        studentList.add(new Student("3417", "최희"));
        studentList.add(new Student("3418", "하혜령"));
        studentList.add(new Student("3419", "홍아연"));

        studentRepository.saveAll(studentList);

    }
}