package br.vitorfurini.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vitor.furini
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private String cnpj;
    private String nome;
    private String atividade;

    private final List<Cliente> clientes = new ArrayList<>();
}
