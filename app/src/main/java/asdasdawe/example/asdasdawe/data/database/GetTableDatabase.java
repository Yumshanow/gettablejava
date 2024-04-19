package asdasdawe.example.asdasdawe.data.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import asdasdawe.example.asdasdawe.data.model.RestaurantModel;

@Database(entities = {RestaurantModel.class}, version = 1)
public abstract class GetTableDatabase extends RoomDatabase {

    public abstract RestaurantDao restaurantDao();

    private static volatile GetTableDatabase instance;

    public static synchronized GetTableDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (GetTableDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                                    context.getApplicationContext(),
                                    GetTableDatabase.class,
                                    "get-table-database")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return instance;
    }
}
