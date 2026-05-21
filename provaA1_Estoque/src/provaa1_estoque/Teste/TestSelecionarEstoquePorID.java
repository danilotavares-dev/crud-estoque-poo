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
public class TestSelecionarEstoquePorID {
    
    public static void main(String[] args) throws Exception {
        
        EstoqueDAL dal = new EstoqueDAL();
        EstoqueDTO estoque = dal.selecionarEstoquePorID(1);
        
        System.out.println("Codigo: " + estoque.getEstID());
        System.out.println("Quantidade: " + estoque.getEstQtd());
        System.out.println("Valor Total em Estoque: " + estoque.getEstValorTotal());
    }
}
