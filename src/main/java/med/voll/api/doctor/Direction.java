package med.voll.api.doctor;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter //se usa lombok para generar automaticamente los getter para estos atributos una vez compile
@NoArgsConstructor
@AllArgsConstructor
public class Direction {
    private String street,  district, city,complement;
    private  Integer number;
}
