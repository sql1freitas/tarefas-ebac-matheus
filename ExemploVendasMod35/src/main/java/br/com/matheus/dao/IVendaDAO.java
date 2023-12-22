/**
 * 
 */
package br.com.matheus.dao;

import br.com.matheus.dao.generic.IGenericDAO;
import br.com.matheus.domain.Venda;
import br.com.matheus.exceptions.DAOException;
import br.com.matheus.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
