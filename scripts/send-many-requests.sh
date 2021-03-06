#!/usr/bin/env bash

source config.sh

cd ${KAFKA_BIN_DIR} && ./kafka-producer-perf-test.sh --num-records 10000000 \
--topic test-topic --record-size 1000 --throughput 10000 --producer-props bootstrap.servers=localhost:9092 acks=all
