package fr.dawan.guessthatmovie.common;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
// annotation qui ne génère pas de table en BD - mais qui permet aux classes de récupérer tous les attributs de cette classe
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Gestion de l'accès conccurrentiel à une ressource partagée: vérrouillage
    @Version
    private int version;

}
