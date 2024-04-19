package asdasdawe.example.asdasdawe.data.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import asdasdawe.example.asdasdawe.data.model.RestaurantModel;
import java.util.List;

@Dao
public interface RestaurantDao {

    @Query("SELECT * FROM restaurants")
    List<RestaurantModel> getRestaurantAll();

    @Query("SELECT * FROM restaurants WHERE id LIKE :restaurantId")
    RestaurantModel getRestaurantById(int restaurantId);

    @Insert
    void insertAll(RestaurantModel... restaurants);

    @Delete
    void delete(RestaurantModel user);

    @Query("DELETE FROM restaurants")
    void deleteAll();
}
