package com.amadeus.middleware.odyssey.reactive.messaging.kafka.connector.provider;

import java.util.List;

import com.amadeus.middleware.odyssey.reactive.messaging.core.MessageScoped;
import com.amadeus.middleware.odyssey.reactive.messaging.core.MutableMetadata;

import io.vertx.reactivex.kafka.client.producer.KafkaHeader;

/**
 * Defines how Kafka will be targeted by the sink connector. The instance is initialized with the KafkaHeaders coming
 * from KafkaIncoming.
 */
@MessageScoped
public interface KafkaTarget extends MutableMetadata {
  String META_KEY = "MY_KAFKATARGET";
  String META_MERGE_KEY = META_KEY;

  String topic();

  void topic(String topic);

  Object key();

  void key(Object key);

  List<KafkaHeader> headers();
}
