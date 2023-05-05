package med.voll.api.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doctors")
@Entity
@Getter //se usa lombok para generar automaticamente los getter para estos atributos una vez compile
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, email, document;
    @Enumerated(EnumType.STRING)
    private Specialy specialy;
    @Embedded
    private Direction direction;
}
