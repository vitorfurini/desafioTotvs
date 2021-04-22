package br.vitorfurini.validation;

import java.io.File;

public class Validator {

    public static void validator(File diretorio) {
        if (!diretorio.isDirectory()) {
            System.err.println("Diretório '" + diretorio.getPath() + "' inexistente.");
            System.exit(0);
        }
    }

}
