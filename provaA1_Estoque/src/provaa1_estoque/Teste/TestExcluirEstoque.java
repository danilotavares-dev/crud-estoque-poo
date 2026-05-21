/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaa1_estoque.Teste;

import provaa1_estoque.DAL.EstoqueDAL;

/**
 *
 * @author danilotavareslima
 */
public class TestExcluirEstoque {
    
    public static void main(String[] args) throws Exception {
        
        EstoqueDAL dal = new EstoqueDAL();
        dal.excluirEstoque(1);
        
        System.out.print("Produto excluido com suscesso!");
    }
}
