#!/usr/bin/env bash

source config.sh

cd ${KAFKA_BIN_DIR} && ./kafka-console-producer.sh --broker-list localhost:9092 --topic test-topic
