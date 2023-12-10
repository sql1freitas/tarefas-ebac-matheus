/**
 * 
 */
package Main.services;

import Main.exceptions.TipoChaveNaoEncontradaException;
import Main.domain.Cliente;


public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
