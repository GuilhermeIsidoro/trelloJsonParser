package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.CardsEntry;
import model.TrelloJson;

/**
 * @author  Guilherme Isidoro
 * @Date    8 de mar de 2019
 * @Company Cabal Brasil
 *
 */

public class Controller {

	public Controller(String caminho) {
		parseJson(caminho);
	}
	
	private void parseJson(String caminho) {
		TrelloJson trello = new TrelloJson();
		
		try {
			Gson gson = new Gson();
			
			JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(caminho), "UTF-8"));
			trello = gson.fromJson(reader, trello.getClass());			

			StringBuilder sb = new StringBuilder();
			
			for (CardsEntry cartao : trello.getCards()) {
				sb.append("Nome cartão: " + cartao.getName());
				sb.append(System.getProperty("line.separator"));
				sb.append("Desc cartão: " + cartao.getDesc());
				sb.append(System.getProperty("line.separator"));
				sb.append("--------------------------------");
				sb.append(System.getProperty("line.separator"));
			}
			
			JFileChooser f = new JFileChooser();
			f.setDialogTitle("Escolha o destino do arquivo de saída");
	        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
	        f.showSaveDialog(null);

			FileWriter fw = new FileWriter(f.getSelectedFile().getAbsolutePath() + "\\cartoes.txt");
			
			fw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
