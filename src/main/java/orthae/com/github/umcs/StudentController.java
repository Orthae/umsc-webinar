package orthae.com.github.umcs;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentController {
  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("students")
  public Iterable<StudentEntity> getStudents() {
    return studentService.getStudents();
  }

  @PostMapping("students")
  public StudentEntity addStudent(@Valid @RequestBody StudentModel request) {
    return studentService.addStudent(request);
  }

  @PutMapping("students/{studentId}")
  public StudentEntity updateStudent(@PathVariable int studentId,
                                     @Valid @RequestBody StudentModel request) {
    return studentService.updateStudent(studentId, request);
  }

  @DeleteMapping("students/{studentId}")
  public void deleteStudent(@PathVariable int studentId) {
    studentService.deleteStudent(studentId);
  }
}
