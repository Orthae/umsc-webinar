package orthae.com.github.umcs;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
  boolean existsByPesel(String pesel);
  boolean existsByPeselAndIdIsNot(String pesel, Integer id);
}

