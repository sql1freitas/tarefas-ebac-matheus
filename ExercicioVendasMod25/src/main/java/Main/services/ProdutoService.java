/**
 * 
 */
package Main.services;

import Main.services.generic.GenericService;
import Main.dao.IProdutoDAO;
import Main.domain.Produto;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
