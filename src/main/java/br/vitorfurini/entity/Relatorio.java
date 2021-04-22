package br.vitorfurini.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vitor.furini
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Relatorio {

    private String qtdClientes;
    private String qtdVendedores;
    private String idVenda;
    private String idVendedor;

}
