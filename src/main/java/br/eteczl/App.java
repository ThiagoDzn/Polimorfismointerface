package br.eteczl;

import java.util.ArrayList;

import br.eteczl.model.Automovel;
import br.eteczl.model.Caminhao;
import br.eteczl.model.Carro;

/**
 * Hello world!
 *
 */
public class App 
{
private ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
    
    public static void main( String[] args )
    {
      App app = new App();
      Automovel carrAuto = new Carro();

      app.automoveis.add(new Carro());
      app.automoveis.add(new Caminhao());


    }
}
