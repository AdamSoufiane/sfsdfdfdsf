package application.services;

import application.ports.in.FeatureServicePort;
import application.ports.out.FeatureResultPort;

public class FeatureService {

    private final FeatureServicePort featureServicePort;
    private final FeatureResultPort featureResultPort;

    public FeatureService(FeatureServicePort featureServicePort, FeatureResultPort featureResultPort) {
        this.featureServicePort = featureServicePort;
        this.featureResultPort = featureResultPort;
    }

    public void processFeature() {
        // Coordinates the flow of data between ports and triggers business logic in the domain layer.
        // This method should be implemented with the actual logic to process the feature,
        // interacting with the domain layer through the featureServicePort
        // and sending out results through the featureResultPort.
    }
}
