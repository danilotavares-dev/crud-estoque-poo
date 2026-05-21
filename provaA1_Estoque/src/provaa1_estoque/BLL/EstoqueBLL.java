package provaa1_estoque.BLL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import provaa1_estoque.DAL.EstoqueDAL;
import provaa1_estoque.DTO.EstoqueDTO;

/**
 *
 * @author danilotavareslima
 */
public class EstoqueBLL {

    EstoqueDAL dal = new EstoqueDAL();

    public void inserirEstoque(EstoqueDTO estoque) throws Exception {

        if (estoque.getEstQtd() < 0) {
            throw new Exception("Quantidade não pode ser negativa.");
        }
        if (estoque.getEstValorTotal() < 0) {
            throw new Exception("Valor total não pode ser negativo.");
        }
        dal.inserirEstoque(estoque);
    }

    public EstoqueDTO selecionarEstoquePorID(Integer estID) throws Exception {
        return dal.selecionarEstoquePorID(estID);
    }

    public java.util.List selecionarListaEstoque() throws Exception {
        return dal.selecionarListaEstoque();
    }

    public void alterarEstoque(EstoqueDTO estoque) throws Exception {

        if (estoque.getEstQtd() < 0) {
            throw new Exception("Quantidade não pode ser negativa.");
        }
        if (estoque.getEstValorTotal() < 0) {
            throw new Exception("Valor total não pode ser negativo.");
        }
        dal.alterarEstoque(estoque);
    }

    public void excluirEstoque(Integer estID) throws Exception {
        dal.excluirEstoque(estID);
    }
}
