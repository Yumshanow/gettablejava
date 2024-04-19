package asdasdawe.example.asdasdawe.data.presentation;

import android.app.Application;
import asdasdawe.example.asdasdawe.data.database.GetTableDatabase;
import asdasdawe.example.asdasdawe.data.repository.DatabaseRepository;

public class App extends Application {

    private static GetTableDatabase database;
    private static DatabaseRepository databaseRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        database = GetTableDatabase.getInstance(getApplicationContext());
        databaseRepository = new DatabaseRepository(database);
    }

    public static GetTableDatabase getDatabase() {
        return database;
    }

    public static DatabaseRepository getDatabaseRepository() {
        return databaseRepository;
    }
}
