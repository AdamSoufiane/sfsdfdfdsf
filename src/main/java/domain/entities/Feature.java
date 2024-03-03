package domain.entities;

public class Feature {

    private Long id;
    private String name;
    private String description;
    private boolean isActive;

    public Feature(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isActive = false; // Default to inactive
    }

    public void activate() {
        this.isActive = true;
    }

    public void deactivate() {
        this.isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}