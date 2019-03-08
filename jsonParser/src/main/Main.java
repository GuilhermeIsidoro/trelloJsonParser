/**
 * 
 */
package main;

import java.io.File;

import javax.swing.JFileChooser;

import control.Controller;

/**
 * @author  Guilherme Isidoro
 * @Date    8 de mar de 2019
 * @Company Cabal Brasil
 *
 */

public class Main {

	public static void main(String[] args) {
		
		JFileChooser arquivo = new JFileChooser();
		
		arquivo.setDialogTitle("Selecione o arquivo a ser lido");
		
		int ret = arquivo.showOpenDialog(null);
		
		if (ret == JFileChooser.APPROVE_OPTION) {
            File file = arquivo.getSelectedFile();
            new Controller(file.getAbsolutePath());
        } else {
            System.exit(0);
        }
	}
}
