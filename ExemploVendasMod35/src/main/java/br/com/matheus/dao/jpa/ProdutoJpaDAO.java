/**
 * 
 */
package br.com.matheus.dao.jpa;

import br.com.matheus.dao.generic.jpa.GenericJpaDAO;
import br.com.matheus.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
