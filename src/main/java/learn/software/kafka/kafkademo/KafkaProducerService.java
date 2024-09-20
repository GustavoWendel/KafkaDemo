package learn.software.kafka.kafkademo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC = "nome-do-topico";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}

@Component
class bla {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostConstruct
    public void send() {
        String message = "Mensagem padrão ao inicializar";
        kafkaProducerService.sendMessage(message);
    }

}
