package med.voll.api.doctor;

public record DataListDoctor(
        String name,
        String specialy,
        String document,
        String email) {
    public DataListDoctor(Doctor doctor) {
        this(doctor.getName(),doctor.getSpecialy().toString(), doctor.getDocument(), doctor.getEmail());
    }
}
