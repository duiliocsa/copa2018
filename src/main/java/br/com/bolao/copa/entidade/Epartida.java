/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bolao.copa.entidade;

import java.util.Date;

/**
 *
 * @author duili
 */
public class Epartida {

    private Date dataPartida;
    private Integer numrFase;

    private Eselecao eselecao1;
    private Integer numrScore1;
    private Integer numrScoreExtra1;
    private Integer numrScorePenaltis1;

    private Eselecao eselecao2;
    private Integer numrScore2;
    private Integer numrScoreExtra2;
    private Integer numrScorePenaltis2;

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Integer getNumrFase() {
        return numrFase;
    }

    public void setNumrFase(Integer numrFase) {
        this.numrFase = numrFase;
    }

    public Eselecao getEselecao1() {
        return eselecao1;
    }

    public void setEselecao1(Eselecao eselecao1) {
        this.eselecao1 = eselecao1;
    }

    public Integer getNumrScore1() {
        return numrScore1;
    }

    public void setNumrScore1(Integer numrScore1) {
        this.numrScore1 = numrScore1;
    }

    public Integer getNumrScoreExtra1() {
        return numrScoreExtra1;
    }

    public void setNumrScoreExtra1(Integer numrScoreExtra1) {
        this.numrScoreExtra1 = numrScoreExtra1;
    }

    public Integer getNumrScorePenaltis1() {
        return numrScorePenaltis1;
    }

    public void setNumrScorePenaltis1(Integer numrScorePenaltis1) {
        this.numrScorePenaltis1 = numrScorePenaltis1;
    }

    public Eselecao getEselecao2() {
        return eselecao2;
    }

    public void setEselecao2(Eselecao eselecao2) {
        this.eselecao2 = eselecao2;
    }

    public Integer getNumrScore2() {
        return numrScore2;
    }

    public void setNumrScore2(Integer numrScore2) {
        this.numrScore2 = numrScore2;
    }

    public Integer getNumrScoreExtra2() {
        return numrScoreExtra2;
    }

    public void setNumrScoreExtra2(Integer numrScoreExtra2) {
        this.numrScoreExtra2 = numrScoreExtra2;
    }

    public Integer getNumrScorePenaltis2() {
        return numrScorePenaltis2;
    }

    public void setNumrScorePenaltis2(Integer numrScorePenaltis2) {
        this.numrScorePenaltis2 = numrScorePenaltis2;
    }

}
