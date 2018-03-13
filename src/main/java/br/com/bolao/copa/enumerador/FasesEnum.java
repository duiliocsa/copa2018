/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bolao.copa.enumerador;

public enum FasesEnum {

    FASE_DE_GRUPOS(1, "Fase de Grupos", 1), OITAVAS(2, "Oitavas de Final", 2), QUARTAS(2, "Quartas de Final", 2), SEMIFINAIS(2, "Semifinal", 2), FINAL(2, "Final", 4);

    private Integer id;
    private String descricao;
    private Integer peso;

    private FasesEnum(int id, String descricao, int peso) {
        this.id = id;
        this.descricao = descricao;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public static FasesEnum get(Integer id) {
        for (FasesEnum enums : FasesEnum.values()) {
            if (enums.getId().equals(id)) {
                return enums;
            }
        }
        return null;
    }
}
