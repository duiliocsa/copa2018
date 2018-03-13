/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bolao.copa.entidade;

/**
 *
 * @author duili
 */
public class Eparticipante {

    private String descNome;
    private Eselecao selecaoFavorita;
    private String descEmail;
    private Boolean flagPg;

    public String getDescNome() {
        return descNome;
    }

    public void setDescNome(String descNome) {
        this.descNome = descNome;
    }

    public Eselecao getSelecaoFavorita() {
        return selecaoFavorita;
    }

    public void setSelecaoFavorita(Eselecao selecaoFavorita) {
        this.selecaoFavorita = selecaoFavorita;
    }

    public String getDescEmail() {
        return descEmail;
    }

    public void setDescEmail(String descEmail) {
        this.descEmail = descEmail;
    }

    public Boolean getFlagPg() {
        return flagPg;
    }

    public void setFlagPg(Boolean flagPg) {
        this.flagPg = flagPg;
    }

}
