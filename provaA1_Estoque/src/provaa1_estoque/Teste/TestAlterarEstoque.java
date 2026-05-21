/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaa1_estoque.Teste;

import provaa1_estoque.DAL.EstoqueDAL;
import provaa1_estoque.DTO.EstoqueDTO;

/**
 *
 * @author danilotavareslima
 */
public class TestAlterarEstoque {

    public static void main(String[] args) throws Exception {

        EstoqueDAL dal = new EstoqueDAL();
        EstoqueDTO estoque = new EstoqueDTO();

        estoque.setEstID(1);
        estoque.setEstQtd(6);
        estoque.setEstValorTotal(250);
        
        dal.alterarEstoque(estoque);
        
        System.out.print("Produto com estoque de " + estoque.getEstQtd() + " unidades foi alterado com sucesso!");
    }
}
