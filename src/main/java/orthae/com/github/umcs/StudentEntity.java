package orthae.com.github.umcs;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "students", schema = "umcs")
@Data
public class StudentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer id;

  @Column
  private String name;

  @Column
  private String surname;

  @Column
  private String pesel;

  public StudentEntity(){}

  public StudentEntity(Integer id, String name, String surname, String pesel) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.pesel = pesel;
  }

  public StudentEntity(String name, String surname, String pesel) {
    this(null, name, surname, pesel);
  }
}
