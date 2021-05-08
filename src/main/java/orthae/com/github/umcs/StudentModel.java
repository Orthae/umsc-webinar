package orthae.com.github.umcs;

import lombok.Data;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.validation.constraints.NotBlank;

@Data
public class StudentModel {
  @NotBlank
  private String name;

  @NotBlank
  private String surname;

  @PESEL
  private String pesel;
}
