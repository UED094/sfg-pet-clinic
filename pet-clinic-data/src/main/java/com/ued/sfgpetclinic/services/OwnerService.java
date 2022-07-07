package com.ued.sfgpetclinic.services;

import com.ued.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
