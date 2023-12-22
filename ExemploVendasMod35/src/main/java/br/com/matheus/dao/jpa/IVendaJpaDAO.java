/**
 * 
 */
package br.com.matheus.dao.jpa;

import br.com.matheus.dao.generic.jpa.IGenericJapDAO;
import br.com.matheus.domain.jpa.VendaJpa;
import br.com.matheus.exceptions.DAOException;
import br.com.matheus.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	/**
	 * 
	 * @see VendaJpa produtos
	 * 
	 * @param id
	 * @return
	 */
	public VendaJpa consultarComCollection(Long id);
}
