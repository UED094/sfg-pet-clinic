package com.ued.sfgpetclinic.services;

import com.ued.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
