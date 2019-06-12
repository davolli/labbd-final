/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroexemplo;

/**
 *
 * @author davol
 */
public class ConsultaDoisEnt {
    private String nome_museu;
    private String estado;
    private String esfera;
    private String qtd_acc;
    private String qtd_seg;
    
    ConsultaDoisEnt(String nome_museu,String estado, String esfera, String qtd_acc, String qtd_seg) {
        this.nome_museu = nome_museu;
        this.estado = estado;
        this.esfera = esfera;
        this.qtd_acc = qtd_acc;
        this.qtd_seg = qtd_seg;
    }
    
    public String getNome() {
        return this.nome_museu;
    }
    public String getEstado() {
        return this.estado;
    }
    public String getEsfera() {
        return this.esfera;
    }
    public String getQtdAcc() {
        return this.qtd_acc;
    }
    public String getQtdSeg() {
        return this.qtd_seg;
    }
}
