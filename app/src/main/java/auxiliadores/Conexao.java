package auxiliadores;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Conexao {
  public InputStream obterRespostaHTTP(String end){
    try {
      URL url = new URL(end);
      HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
      conexao.setRequestMethod("GET");
      return new BufferedInputStream(conexao.getInputStream());
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
