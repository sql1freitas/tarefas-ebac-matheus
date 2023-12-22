/**
 * 
 */
package br.com.matheus.services;

import br.com.matheus.dao.IProdutoDAO;
import br.com.matheus.domain.Produto;
import br.com.matheus.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
