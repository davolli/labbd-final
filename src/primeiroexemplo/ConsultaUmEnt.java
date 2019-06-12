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
public class ConsultaUmEnt {

    
    String nome_museu;
    String nome_tipologia;
    String esfera;
    String ano_criacao;
    String qtd_acc;
    String qtd_seg;
    
    ConsultaUmEnt(String nome_museu,String nome_tipologia, String esfera, String ano_criacao, String qtd_acc, String qtd_seg) {
        this.nome_museu = nome_museu;
        this.nome_tipologia = nome_tipologia;
        this.esfera = esfera;
        this.ano_criacao = ano_criacao;
        this. qtd_acc = qtd_acc;
        this.qtd_seg = qtd_seg;
    }
    
    public String getNome_museu() {
        return nome_museu;
    }
    public String getNome_tipologia() {
        return nome_tipologia;
    }

    public String getEsfera() {
        return esfera;
    }

    public String getAno_criacao() {
        return ano_criacao;
    }

    public String getQtd_acc() {
        return qtd_acc;
    }

    public String getQtd_seg() {
        return qtd_seg;
    }
}
