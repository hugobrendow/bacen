package br.com.ada.bankcode.service;

import br.com.ada.bankcode.model.Chave;
import br.com.ada.bankcode.model.TipoChave;
import br.com.ada.bankcode.repository.ChaveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ChaveService {
    private final ChaveRepository chaveRepository;

    public Chave salvar(Chave chave) {
        return chaveRepository.save(chave);
    }

    public Optional<Chave> buscarPorChaveETipo(String chave, TipoChave tipo) {
        return chaveRepository.findByChaveAndTipo(chave, tipo);
    }
}
