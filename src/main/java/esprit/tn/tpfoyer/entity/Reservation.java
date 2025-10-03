package esprit.tn.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToOne(cascade = CascadeType.ALL)
    private Chambre chambre;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiant; // field name is "etudiant"
}
