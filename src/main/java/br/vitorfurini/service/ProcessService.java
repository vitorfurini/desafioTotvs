package br.vitorfurini.service;

import br.vitorfurini.entity.Cliente;
import br.vitorfurini.entity.Relatorio;
import br.vitorfurini.entity.Venda;
import br.vitorfurini.entity.Vendedor;
import br.vitorfurini.util.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vitor.furini
 */

public class ProcessService {

    private static String fileName;
    private static List<Relatorio> report = new ArrayList<>();

    public static void initialize() {
        try {
            File[] files = ReaderService.getFiles();

            //loop para percorrer o diretorio em busca de arquivos
            for (File value : files) {

                Vendedor vendedor = new Vendedor();
                Cliente cliente = new Cliente();
                Venda venda = new Venda();

                File file = value;
                fileName = file.getName();
                report = new ArrayList<>();

                System.out.println("Lendo o arquivo '" + fileName + "'.");

                //LOOP para percorrer o arquivo
                if (file.length() != 0) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        String[] dados = line.split(Util.SEPARADOR);

                        if (line.startsWith("001")) {
                            vendedor.getVendedores(dados);
                        } else if (line.startsWith("002")) {
                            cliente.getClientes(dados);
                        } else if (line.startsWith("003")) {
                            venda.getVendas(dados);
                        }
                    }

                    //adicionando os dados no relatorio
                    report.add(new Relatorio(cliente.totalClientes(), vendedor.totalVendedores(),
                            venda.getIdMelhorVenda(),
                            venda.getPiorVenda()));

                    //salvando o relatorio
                    SaveService.save(report, fileName);
                    System.out.println("Arquivo '" + fileName + ".proc' processado com sucesso!");
                    bufferedReader.close();
                } else {
                    System.out.println("Nenhum dado encontrado");
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: %n" + e.getMessage());
        }
    }
}
