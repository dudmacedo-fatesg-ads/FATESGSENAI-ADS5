package br.eti.eduardomacedo.mobile.os2.model;

import java.util.ArrayList;
import java.util.List;

public class Base {
    private static List<Rota> rotas;

    private static List<RegistroAtendimento> ras;
    private static List<Servico> servicos;
    private static List<Conta> contas;
    private static List<Operador> operadores;

    static {
        rotas = new ArrayList<>();
        rotas.add(new Rota());

    }
}
