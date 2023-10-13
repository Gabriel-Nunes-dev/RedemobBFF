package com.redemob.service;

import com.redemob.model.Candidato;
import com.redemob.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {
    private final CandidatoRepository candidatoRepository;

    @Autowired
    public CandidatoService(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    public Candidato cadastrarCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }


}
