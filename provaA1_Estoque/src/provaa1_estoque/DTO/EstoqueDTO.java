/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaa1_estoque.DTO;

/**
 *
 * @author danilotavareslima
 */
public class EstoqueDTO {

    private int estID;
    private int estQtd;
    private double estValorTotal;

    public EstoqueDTO() {
    }

    public EstoqueDTO(int estQtd, double estValorTotal) {
        this.estQtd = estQtd;
        this.estValorTotal = estValorTotal;
    }

    public EstoqueDTO(int estID, int estQtd, double estValorTotal) {
        this.estID = estID;
        this.estQtd = estQtd;
        this.estValorTotal = estValorTotal;
    }

    public int getEstID() {
        return estID;
    }

    public void setEstID(int estID) {
        this.estID = estID;
    }

    public int getEstQtd() {
        return estQtd;
    }

    public void setEstQtd(int estQtd) {
        this.estQtd = estQtd;
    }

    public double getEstValorTotal() {
        return estValorTotal;
    }

    public void setEstValorTotal(double estValorTotal) {
        this.estValorTotal = estValorTotal;
    }
}
