package inpetu;

import inpetu.model.Contato;
import inpetu.repository.IContatoRepository;
import inpetu.repository.memory.ContatoMemoryRepository;
import inpetu.service.ContatoService;
import inpetu.service.IContatoService;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Contato c1 = new Contato("Juarez");
        Contato c2 = new Contato("Maria");
        Contato c3 = new Contato("Hugo");

        IContatoRepository contatoRepository = new ContatoMemoryRepository();
        contatoRepository.gravar(c1);
        contatoRepository.gravar(c2);
        contatoRepository.gravar(c3);

        IContatoService contatoService = new ContatoService(contatoRepository);

        Optional<Contato> recuperarC2 = contatoService.buscarPorId(2);
        if (recuperarC2.isPresent()) {
            System.out.println(recuperarC2.get());
        } else {
            System.out.println("Contato ID 2 nao encontrado.");
        }

        Optional<Contato> recuperarC99 = contatoService.buscarPorId(99);
        if (recuperarC99.isPresent()) {
            System.out.println(recuperarC99.get());
        } else {
            System.out.println("Contato ID 99 nao encontrado.");
        }
    }
}