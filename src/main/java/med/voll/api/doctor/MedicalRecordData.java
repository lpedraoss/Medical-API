package med.voll.api.doctor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.direction.DirectionData;
import jakarta.validation.constraints.NotBlank;

public record MedicalRecordData(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String phone,
        @NotBlank
        @Pattern(regexp = "\\d{4,12}")
        String document,
        @NotNull
        Specialy specialy,
        @NotNull
        @Valid
        DirectionData directionData) {

}
