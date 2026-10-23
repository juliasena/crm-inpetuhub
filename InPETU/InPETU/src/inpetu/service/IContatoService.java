package inpetu.service;

import inpetu.model.Contato;

import java.util.Optional;

public interface IContatoService {
    void gravar(Contato contato);
    void remover(Contato contato);
    Optional<Contato> buscarPorId(int id);
    Optional<Contato> buscarPorNome(String nome);
}
