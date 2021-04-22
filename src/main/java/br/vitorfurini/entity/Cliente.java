package br.vitorfurini.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vitor.furini
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private String idCliente;
    private String cnpj;
    private String nome;
    private String atividade;

    private final List<Cliente> clientes = new ArrayList<>();

    public void getClientes(String[] cliente) {
        clientes.add(new Cliente(cliente[0], cliente[1], cliente[2], cliente[3]));
    }

    public String totalClientes() {
        return String.valueOf(clientes.size());
    }

}
