package com.ued.sfgpetclinic.services;

import com.ued.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
