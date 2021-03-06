package br.vitorfurini.service;

import br.vitorfurini.util.Util;
import br.vitorfurini.validation.Validator;

import java.io.File;

/**
 * @author vitor.furini
 */

public class ReaderService {

    //método para ler os arquivos no diretório definido
    public static File[] getFiles() {

        File diretorio = new File(Util.PATH_IN);

        Validator.validator(diretorio);

        return diretorio.listFiles();

    }
}
