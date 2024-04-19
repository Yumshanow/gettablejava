package asdasdawe.example.asdasdawe.data.repository;

import asdasdawe.example.asdasdawe.data.database.GetTableDatabase;
import asdasdawe.example.asdasdawe.data.model.RestaurantModel;
import asdasdawe.example.asdasdawe.data.domain.Restaurant;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseRepository {

    private final GetTableDatabase database;

    public DatabaseRepository(GetTableDatabase database) {
        this.database = database;
    }

    public List<Restaurant> getAllRestaurants() {
        return database.restaurantDao().getRestaurantAll().stream()
                .map(RestaurantModel::toDomainModel)
                .collect(Collectors.toList());
    }

    public Restaurant getRestaurantById(int id) {
        return database.restaurantDao().getRestaurantById(id).toDomainModel();
    }

    public void insertRestaurants(
            RestaurantModel rest1,
            RestaurantModel rest2,
            RestaurantModel rest3,
            RestaurantModel rest4,
            RestaurantModel rest5) {
        database.restaurantDao().insertAll(rest1, rest2, rest3, rest4, rest5);
    }

    public void deleteAll() {
        database.restaurantDao().deleteAll();
    }
}
