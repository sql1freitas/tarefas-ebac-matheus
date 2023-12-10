/**
 * 
 */
package Main.dao;

import Main.dao.generic.IGenericDAO;
import Main.domain.Venda;
import Main.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
