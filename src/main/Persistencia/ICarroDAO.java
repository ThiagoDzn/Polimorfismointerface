package br.eteczl.persistencia;

 import br.eteczl.model.Carro;

public interface ICarroDAO {
    public void Salvar(Carro c);
    public void Alterar(Carro c, Integer id);
    public void Deletar(Integer id);
    public void Buscar(Integer id);
    public ArrayList<Carro> listar();
      
}
