package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca realizada com sucesso";
    }

    @Override
    public String excluir() {
        return "Contrato excluído";
    }

    @Override
    public String atualizar() {
        return "Contrato atualizado";
    }
}
