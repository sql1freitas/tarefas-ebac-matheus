/**
 * 
 */
package Main.services;

import Main.dao.IProdutoDAO;
import Main.domain.Produto;
import Main.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
