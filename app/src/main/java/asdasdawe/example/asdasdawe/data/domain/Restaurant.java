package asdasdawe.example.asdasdawe.data.domain;

public class Restaurant {

    private final int id;
    private final String name;
    private final String imageUrl;
    private final String address;
    private final String workingTime;
    private final String description;

    public Restaurant(int id, String name, String imageUrl, String address, String workingTime, String description) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.address = address;
        this.workingTime = workingTime;
        this.description = description;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public String getDescription() {
        return description;
    }
}
