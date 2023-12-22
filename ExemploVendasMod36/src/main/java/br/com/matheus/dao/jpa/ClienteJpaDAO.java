/**
 * 
 */
package br.com.matheus.dao.jpa;

import br.com.matheus.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.matheus.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
