// path: course-service/src/main/java/vn/edu/crs/course_service/controller/CourseController.java
// purpose: controller mockup (gia dinh du lieu) buoi 1, tra du lieu gia de test Postman truoc khi noi DB that

package vn.edu.crs.course_service.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping
    public List<Map<String, Object>> getMockCourses() {
        return List.of(
            Map.of(
                "id", 1,
                "tenMonHoc", "Lap trinh Java co ban",
                "soTinChi", 3,
                "soChoToiDa", 40,
                "soChoConLai", 12
            ),
            Map.of(
                "id", 2,
                "tenMonHoc", "Co so du lieu",
                "soTinChi", 4,
                "soChoToiDa", 35,
                "soChoConLai", 0
            )
        );
    }
}
