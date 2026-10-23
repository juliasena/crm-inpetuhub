package inpetu.service;

import inpetu.model.Contato;
import inpetu.repository.IContatoRepository;

import java.util.Optional;

public class ContatoService implements IContatoService {

    private IContatoRepository repository;

    public ContatoService(IContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void gravar(Contato contato) {
        this.repository.gravar(contato);
    }

    @Override
    public void remover(Contato contato) {
        this.repository.remover(contato);
    }

    @Override
    public Optional<Contato> buscarPorId(int id) {
        return this.repository.buscarPorId(id);
    }

    @Override
    public Optional<Contato> buscarPorNome(String nome) {
        return this.repository.buscarPorNome(nome);
    }
}
