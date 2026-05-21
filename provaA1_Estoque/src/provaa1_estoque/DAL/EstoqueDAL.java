package provaa1_estoque.DAL;

import provaa1_estoque.DTO.EstoqueDTO;
import java.util.ArrayList;
import java.util.List;

public class EstoqueDAL extends ConexaoMySQL {

    public void inserirEstoque(EstoqueDTO estoque) throws Exception {

        abrirBD();
        SQL = "INSERT INTO Estoque (estQtd, estValorTotal) VALUES (?, ?)";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estoque.getEstQtd());
        ps.setDouble(2, estoque.getEstValorTotal());
        ps.execute();
        fecharBD();
    }

    public EstoqueDTO selecionarEstoquePorID(Integer estID) throws Exception {

        abrirBD();
        SQL = "SELECT * FROM Estoque WHERE estID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estID);
        rs = ps.executeQuery();
        EstoqueDTO estoque = new EstoqueDTO();
        if (rs.next()) {
            estoque.setEstID(rs.getInt("estID"));
            estoque.setEstQtd(rs.getInt("estQtd"));
            estoque.setEstValorTotal(rs.getDouble("estValorTotal"));
        }
        fecharBD();
        return estoque;
    }

    public java.util.List selecionarListaEstoque() throws Exception {
        abrirBD();
        SQL = "SELECT * FROM Estoque";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        java.util.List listaEstoque = new java.util.ArrayList();
        while (rs.next()) {
            EstoqueDTO estoque = new EstoqueDTO();
            estoque.setEstID(rs.getInt("estID"));
            estoque.setEstQtd(rs.getInt("estQtd"));
            estoque.setEstValorTotal(rs.getDouble("estValorTotal"));
            listaEstoque.add(estoque);
        }
        fecharBD();
        return listaEstoque;
    }

    public void alterarEstoque(EstoqueDTO estoque) throws Exception {

        abrirBD();
        SQL = "UPDATE Estoque SET estQtd = ?, estValorTotal = ? WHERE estID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estoque.getEstQtd());
        ps.setDouble(2, estoque.getEstValorTotal());
        ps.setInt(3, estoque.getEstID());
        ps.execute();
        fecharBD();
    }

    public void excluirEstoque(Integer estID) throws Exception {

        abrirBD();
        SQL = "DELETE FROM Estoque WHERE estID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estID);
        ps.execute();
        fecharBD();
    }
}
