# Kafka Reactive Test App

## Scripts

### Configuration

Configure your Kafka bin path in `scripts/config.sh`.

### Send Custom Test Messages

To send custom test messages, run `cd scripts && bash send-request.sh`.

### Performance Test

To run a performance test of many messages, run `cd scripts && bash send-many-requests.sh`.

## Testing

### Failover

The library is designed to fail over when an application crashes. Lets test this:
1) Ensure `process` method in `ExampleProcessor` has the following ```return Mono.delay(Duration.ofSeconds(40)).thenReturn(exampleContext);```.

2) Start the application.

3) Send a test message [Ref](#send-custom-test-messages). 

4) Kill/stop the application before 40 seconds is up.

5) Restart the application.

6) See that the message is reprocessed.
