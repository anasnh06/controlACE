package ma.graphql.control.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EtudiantDTO {

    private String nom;
    private String email;
    private Date dateNaissance;
}
