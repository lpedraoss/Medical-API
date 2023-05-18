package med.voll.api.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direction.Direction;

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

    public Doctor(MedicalRecordData medicalRecordData) {
        this.name = medicalRecordData.name();
        this.email = medicalRecordData.email();
        this.document = medicalRecordData.document();
        this.specialy = medicalRecordData.specialy();
        this.direction = new Direction(medicalRecordData.directionData());

    }
}
