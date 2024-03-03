package infrastructure.adapters;

import application.ports.out.FeatureResultPort;
import domain.entities.FeatureResult;

public class FeatureResultAdapter implements FeatureResultPort {

    @Override
    public void sendFeatureResult(FeatureResult featureResult) {
        // Implement the logic to send the feature result to external systems or clients.
        // This could involve using messaging systems, web services, or other communication protocols.
    }
}