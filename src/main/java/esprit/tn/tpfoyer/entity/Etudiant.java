package esprit.tn.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private Set<Reservation> reservation;
}
