package asdasdawe.example.asdasdawe;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.asdasdawe.R;

import asdasdawe.example.asdasdawe.data.model.RestaurantModel;
import asdasdawe.example.asdasdawe.data.presentation.App;
import asdasdawe.example.asdasdawe.data.repository.DatabaseRepository;

public class MainActivity extends AppCompatActivity {

    private DatabaseRepository databaseRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация DatabaseRepository
        databaseRepository = App.getDatabaseRepository();
        if (databaseRepository == null) {
            // Обработка случая, если databaseRepository не инициализирован
            // Можно вывести сообщение об ошибке или выполнить другие действия
        } else {
            // Вызов метода deleteAll() для очистки базы данных
            databaseRepository.deleteAll();
        }
    }


    private void addMockRestaurantsToDB() {
        App.getDatabaseRepository().insertRestaurants(
                new RestaurantModel(
                        1,
                        "LILA",
                        "lila",
                        "Москва, ул. Сретенка, 22/1с1",
                        "09:00–23:00",
                        "Авторская кухня в новом прочтении, с элементами junk food, суши-баром, и использованием интересных техник и сочетаний.\nВ интерьере пространства паназиатского ресторана заложена история о расколе материков. Эта идея отражается в каждом элементе интерьера."
                ),
                new RestaurantModel(
                        2,
                        "J’Pan",
                        "jpan",
                        "Москва, Трубная ул., 21",
                        "10:00–23:00",
                        "Описание ресторана"
                ),
                new RestaurantModel(
                        3,
                        "Хорошая девочка",
                        "good_girl",
                        "Москва, Малая Бронная ул., 10",
                        "09:00–00:00",
                        "Описание ресторана"
                ),
                new RestaurantModel(
                        4,
                        "[KU:]",
                        "ku",
                        " Пресненская наб., 10, стр. 2",
                        "08:00–00:00",
                        "Описание ресторана"
                ),
                new RestaurantModel(
                        5,
                        "White Rabbit",
                        "white_rabbit",
                        "Москва, Смоленская пл., 3",
                        "12:00–00:00",
                        "Описание ресторана"
                )
        );
    }
}
