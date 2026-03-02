package com.example.kamilzhanovjahongir.Controller;

import com.example.kamilzhanovjahongir.entity.Course;
import com.example.kamilzhanovjahongir.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    public Course create(@RequestBody Course course) {
        return service.save(course);
    }

    @GetMapping
    public List<Course> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Course getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable Long id, @RequestBody Course course) {
        course.setId(id);
        return service.save(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
