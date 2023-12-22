/**
 * 
 */
package br.com.matheus.dao.jpa;

import br.com.matheus.dao.generic.jpa.GenericJpaDAO;
import br.com.matheus.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
