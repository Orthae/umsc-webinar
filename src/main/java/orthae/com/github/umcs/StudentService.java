package orthae.com.github.umcs;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public Iterable<StudentEntity> getStudents() {
    return studentRepository.findAll();
  }

  public StudentEntity updateStudent(int studentId, StudentModel request) {
    if (!studentRepository.existsById(studentId)) {
      throw new StudentNotFoundException();
    }

    if(studentRepository.existsByPeselAndIdIsNot(request.getPesel(), studentId)){
      throw new PeselNotUniqueException();
    }

    final var student =
        new StudentEntity(studentId, request.getName(), request.getSurname(), request.getPesel());
    return studentRepository.save(student);
  }

  public StudentEntity addStudent(StudentModel request) {
    if(studentRepository.existsByPesel(request.getPesel())){
      throw new PeselNotUniqueException();
    }

    final var student =
        new StudentEntity(request.getName(), request.getSurname(), request.getPesel());
    return studentRepository.save(student);
  }

  public void deleteStudent(int studentId) {
    studentRepository.deleteById(studentId);
  }
}
