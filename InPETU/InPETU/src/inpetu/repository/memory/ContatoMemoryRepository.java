package inpetu.repository.memory;

import inpetu.model.Contato;
import inpetu.repository.IContatoRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ContatoMemoryRepository implements
        IContatoRepository {

    private final Map<Integer, Contato> armazenamento;
    private int proximoId = 1;

    public ContatoMemoryRepository() {
        this.armazenamento = new LinkedHashMap<>();
    }

    @Override
    public Optional<Contato> buscarPorId(int id) {
        return Optional.ofNullable(this.armazenamento.get(id));
    }

    @Override
    public Optional<Contato> buscarPorNome(String nome) {
        throw new RuntimeException("TODO: Implementar");
    }

    @Override
    public void gravar(Contato contato) {
        if (contato.getId() == 0) {
            contato.setId(this.proximoId++);
        }
        this.armazenamento.put(contato.getId(), contato);
    }

    @Override
    public void remover(Contato contato) {
        throw new RuntimeException("TODO: Implementar");
    }
}
