package org.braga.dao;

import org.braga.domain.Cliente;
import org.braga.domain.Pet;

public interface IPetDAO {

    Integer register (Pet pet);

    Pet consult (Pet pet);

    Integer update (Pet pet);

    Integer delete (Pet pet);
    ;
}
