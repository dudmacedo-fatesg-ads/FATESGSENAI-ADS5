package br.eti.eduardomacedo.mobile.os2.model;

public class Rota {
    private Integer codigo;
    private Integer cidade;
    private Integer grupo;

    public Integer getCodigo() {
        return codigo;
    }

    public Rota setCodigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    public Integer getCidade() {
        return cidade;
    }

    public Rota setCidade(Integer cidade) {
        this.cidade = cidade;
        return this;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public Rota setGrupo(Integer grupo) {
        this.grupo = grupo;
        return this;
    }
}
