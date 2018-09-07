package com.sachin.spring.databases.fiddler.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	public static final String QUEUE_BOOKS = "books-queue";
	public static final String EXCHANGE_BOOKS = "books-exchange";

	@Bean
	Queue ordersQueue() {
		return QueueBuilder.durable(QUEUE_BOOKS).build();
	}

	@Bean
	Exchange ordersExchange() {
		return ExchangeBuilder.topicExchange(EXCHANGE_BOOKS).build();
	}

	@Bean
	Binding binding(Queue ordersQueue, TopicExchange ordersExchange) {
		return BindingBuilder.bind(ordersQueue).to(ordersExchange).with(QUEUE_BOOKS);
	}
}
