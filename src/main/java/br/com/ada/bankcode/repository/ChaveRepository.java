package br.com.ada.bankcode.repository;

import br.com.ada.bankcode.model.Chave;
import br.com.ada.bankcode.model.TipoChave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChaveRepository extends JpaRepository<Chave, Long> {
    Optional<Chave> findByChaveAndTipo(String chave, TipoChave tipoChave);
}
