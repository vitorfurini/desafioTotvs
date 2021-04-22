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
public class Vendedor {

    private String cpf;
    private String nome;
    private Double salario;

    private final List<Vendedor> vendedorList = new ArrayList<>();

}
