package org.braga.dao;

import org.braga.domain.Cliente;

public interface IClienteDAO {

    Integer register (Cliente cliente);

    Integer consult (Cliente cliente);

    Integer update (Cliente cliente);

    Integer delete (Cliente cliente);
    ;
}
