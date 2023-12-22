/**
 * 
 */
package br.com.matheus.services;

import br.com.matheus.domain.Cliente;
import br.com.matheus.exceptions.DAOException;
import br.com.matheus.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
