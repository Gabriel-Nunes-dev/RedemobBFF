package com.redemob.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity(name = "Candidato")
@Table(name = "candidatos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "mother_name")
    private String motherName;

    @Lob @Basic(fetch= FetchType.EAGER)
    private byte[] facePhoto;

    @Lob @Basic(fetch= FetchType.EAGER)
    private byte[] idDocumentFront;

    @Lob @Basic(fetch= FetchType.EAGER)
    private byte[] idDocumentBack;

    @Lob @Basic(fetch= FetchType.EAGER)
    private byte[] addressDocumentFront;

    @Lob @Basic(fetch= FetchType.EAGER)
    private byte[] addressDocumentBack;


}
