package med.voll.api.doctor;
import med.voll.api.direction.DirectionData;

public record MedicalRecordData(String name, String email, String document, Specialy specialy, DirectionData directionData) {

}
