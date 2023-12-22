/**
 * 
 */
package br.com.matheus.dao.jpa;

import br.com.matheus.dao.generic.jpa.IGenericJapDAO;
import br.com.matheus.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
