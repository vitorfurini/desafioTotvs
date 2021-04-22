package br.vitorfurini.service;

import br.vitorfurini.util.Util;

import java.io.File;

/**
 * @author vitor.furini
 */

public class ReaderService {

    //método para ler os arquivos no diretório definido
    public static File[] getFiles() {

        File diretorio = new File(Util.PATH_IN);

        return diretorio.listFiles();

    }
}
