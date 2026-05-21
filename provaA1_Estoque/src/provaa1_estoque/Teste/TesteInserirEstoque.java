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
public class TesteInserirEstoque {

    public static void main(String[] args) throws Exception {
        
        EstoqueDTO estoque = new EstoqueDTO();
        estoque.setEstQtd(10);
        estoque.setEstValorTotal(400.00);
        
        EstoqueDAL dal = new EstoqueDAL();
        dal.inserirEstoque(estoque);
        System.out.print("Produto com " + estoque.getEstQtd() + " unidades no estoque!");
    }
}
