package asdasdawe.example.asdasdawe.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import asdasdawe.example.asdasdawe.data.domain.Restaurant;

@Entity(tableName = "restaurants")
public class RestaurantModel {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "image_url")
    private String imageUrl;

    @ColumnInfo(name = "address")
    private String address;

    @ColumnInfo(name = "working_time")
    private String workingTime;

    @ColumnInfo(name = "description")
    private String description;

    public RestaurantModel(int id, String name, String imageUrl, String address, String workingTime, String description) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.address = address;
        this.workingTime = workingTime;
        this.description = description;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to convert to domain model
    public Restaurant toDomainModel() {
        return new Restaurant(id, name, imageUrl, address, workingTime, description);
    }
}
