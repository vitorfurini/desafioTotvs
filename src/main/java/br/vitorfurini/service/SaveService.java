package br.vitorfurini.service;

import br.vitorfurini.entity.Relatorio;
import br.vitorfurini.util.Util;
import br.vitorfurini.validation.Validator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveService {

    public static void save(List<Relatorio> relatorios, String fileName) {

        final String separador = "/";

        try {
            Validator.validator(new File(Util.PATH_OUT));

            File file = new File(Util.PATH_OUT + separador + fileName + ".proc");
            FileWriter fileWriter = new FileWriter(file);

            for (Relatorio report : relatorios) {
                fileWriter.append("Quantidade de Clientes: ").append(report.getQtdClientes()).append("\r\n");
                fileWriter.append("Quantidade de Vendedores: ").append(report.getQtdVendedores()).append("\r\n");
                fileWriter.append("ID da Venda de valor mais alto: ").append(report.getIdVenda()).append("\r\n");
                fileWriter.append("Nome do Vendedor que menos vendeu: ").append(report.getIdVendedor()).append("\r\n\r\n");
            }

            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
