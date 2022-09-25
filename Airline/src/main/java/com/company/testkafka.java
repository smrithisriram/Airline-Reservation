package main.java.com.company;
import org.apache.kafka.clients.producer.*;

import java.util.Properties;
public class testkafka {
    public static void main(String[] args) throws Exception {
        String topicName = "airline_ticket";
        Producer<String, String> producer = sendtokafka(topicName, "Airline Ticket Generation");
        System.out.println("Data sent to Kafka");
        producer.close();
    }

    public static Producer<String, String> sendtokafka(String topicName, String event) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<String, String>(props);

        producer.send(new ProducerRecord<String, String>(topicName, event));
        return producer;
    }

    public static Producer<String, String> sendtokafka(String topicName, String event, String key) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092,localhost:9093,localhost:9094");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<String, String>(props);

        producer.send(new ProducerRecord<String, String>(topicName, event, key));
        return producer;
    }
}


