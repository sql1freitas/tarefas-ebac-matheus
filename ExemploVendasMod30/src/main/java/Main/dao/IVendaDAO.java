/**
 * 
 */
package Main.dao;

import Main.dao.generic.IGenericDAO;
import Main.domain.Venda;
import Main.exceptions.DAOException;
import Main.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
