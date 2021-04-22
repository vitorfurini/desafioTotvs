package br.vitorfurini.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author vitor.furini
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Venda {

    private String id;
    private String idVenda;
    private String idItem;
    private String qtdItem;
    private Double precoItem;
    private String vendedor;

    private final List<Venda> vendas = new ArrayList<>();

    public void getVendas(String[] venda) {
        this.vendas.add(new Venda(venda[0], venda[1], venda[2], venda[3], Double.parseDouble(venda[4]), venda[5]));
    }

    public String getPiorVenda() {
        vendas.sort(Comparator.comparing(Venda::getPrecoItem));
        return vendas.get(0).vendedor;
    }

    public String getIdMelhorVenda() {
        vendas.sort(Comparator.comparing(Venda::getPrecoItem).reversed());
        return vendas.get(1).getIdVenda();
    }

}
