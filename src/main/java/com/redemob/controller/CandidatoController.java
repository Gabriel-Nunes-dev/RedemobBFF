package com.redemob.controller;

import com.redemob.model.Candidato;
import com.redemob.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/candidatos")
@CrossOrigin(origins = "*")
public class CandidatoController {

    private final CandidatoService candidatoService;

    @Autowired
    public CandidatoController(CandidatoService candidatoService) {
        this.candidatoService = candidatoService;
    }


    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Candidato cadastrarCandidato(@RequestParam("name") String name,
                                        @RequestParam("birthDate") String birthDate,
                                        @RequestParam("cpf") String cpf,
                                        @RequestParam("motherName") String motherName,
                                        @RequestParam("facePhoto") MultipartFile facePhoto,
                                        @RequestParam("idDocumentFront") MultipartFile idDocumentFront,
                                        @RequestParam("idDocumentBack") MultipartFile idDocumentBack,
                                        @RequestParam("addressDocumentFront") MultipartFile addressDocumentFront,
                                        @RequestParam("addressDocumentBack") MultipartFile addressDocumentBack) throws IOException {
        Candidato candidato = new Candidato();
        candidato.setName(name);
        candidato.setBirthDate(new Date(birthDate));
        candidato.setCpf(cpf);
        candidato.setMotherName(motherName);
        candidato.setFacePhoto(facePhoto.getBytes());
        candidato.setIdDocumentFront(idDocumentFront.getBytes());
        candidato.setIdDocumentBack(idDocumentBack.getBytes());
        candidato.setAddressDocumentFront(addressDocumentFront.getBytes());
        candidato.setAddressDocumentBack(addressDocumentBack.getBytes());

        return candidatoService.cadastrarCandidato(candidato);
    }




}
