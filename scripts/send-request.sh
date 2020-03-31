#!/usr/bin/env bash

KAFKA_BIN_DIR="/Users/lpatmore/Documents/kafka/bin"

cd ${KAFKA_BIN_DIR} && ./kafka-console-producer.sh --broker-list localhost:9092 --topic test-topic
