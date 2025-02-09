package edu.sandbox.springbootkafka.producer.utils;

import edu.sandbox.springbootkafka.producer.model.Message;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.LongStream;

import static java.lang.String.format;

@UtilityClass
public class MessageGenerator {

    public static List<Message> generate(long amount) {
        return LongStream.range(1, amount + 1)
                .mapToObj(index -> new Message(index, format("message with id = %d", index)))
                .toList();
    }

    public static Message generateWithId(long id) {
        return new Message(id, format("message with id = %d", id));
    }
}
