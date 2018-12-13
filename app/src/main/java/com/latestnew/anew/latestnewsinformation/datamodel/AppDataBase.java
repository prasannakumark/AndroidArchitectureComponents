package com.latestnew.anew.latestnewsinformation.datamodel;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

@Database(entities = {User.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    private static final String DATABASE_NAME = "newinfo";
    public abstract UserDAO getUserDAO();

    private static volatile AppDataBase INSTANCE;

    @NonNull
    static AppDataBase getDataBase(@NonNull final Context context){
        if(INSTANCE == null) {
            synchronized (AppDataBase.class) {
                if(INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDataBase.class,DATABASE_NAME)
                    .addCallback(callback).build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback callback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }
    };
}
