package test.itschool.samsung.ru.eco_lavka.cart;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Cart.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CartDao CartDao();
}
