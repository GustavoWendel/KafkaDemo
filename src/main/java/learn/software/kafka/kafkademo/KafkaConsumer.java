package learn.software.kafka.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "meu-topico", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}