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
public class Venda {

    private String idVenda;
    private String idItem;
    private String qtdItem;
    private Double precoItem;
    private String vendedor;

    private final List<Venda> vendas = new ArrayList<>();

}
