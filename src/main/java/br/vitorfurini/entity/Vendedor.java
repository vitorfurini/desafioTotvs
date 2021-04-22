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
public class Vendedor {

    private String idVendedor;
    private String cpf;
    private String nome;
    private Double salario;

    private final List<Vendedor> vendedorList = new ArrayList<>();

    public void getVendedores(String[] dados) {
        vendedorList.add(new Vendedor(dados[0], dados[1], dados[2], Double.parseDouble(dados[3])));
    }

    public String totalVendedores() {
        return String.valueOf(vendedorList.size());
    }

}
