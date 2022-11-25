package br.com.ada.bankcode.consumer;

import br.com.ada.bankcode.model.Chave;
import br.com.ada.bankcode.service.ChaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChaveConsumer {

    private final ChaveService chaveService;

    @KafkaListener(topics = "TOPIC_CADASTRO_CHAVE", groupId = "group_id")
    public void consomeMensagem(Chave chave) {
        if (chave.getChave() == null || chave.getTipo() == null ||
                chaveService.buscarPorChaveETipo(chave.getChave(), chave.getTipo()).isPresent()) {
            throw new RuntimeException("Chave já inválida ou já existente!");
        }

        System.out.println("Exibindo mensagens do kafka...");
        chaveService.salvar(chave);
        System.out.println(chave);

    }
}
