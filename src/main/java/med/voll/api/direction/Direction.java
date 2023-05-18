package med.voll.api.direction;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direction.DirectionData;

@Embeddable
@Getter //se usa lombok para generar automaticamente los getter para estos atributos una vez compile
@NoArgsConstructor
@AllArgsConstructor
public class Direction {
    private String street,  district, city,complement;
    private  Integer number;

    public Direction(DirectionData directionData) {
            this.street = directionData.street();
            this.district = directionData.district();
            this.city = directionData.city();
            this.complement = directionData.complement();
            this.number = directionData.number();
    }
}
