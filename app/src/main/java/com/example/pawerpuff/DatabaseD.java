package com.example.pawerpuff;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseD extends SQLiteOpenHelper {

    public static final String DONATE = "DONATE";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_EMAIL = "EMAIL";
    public static final String COLUMN_NUMBER = "NUMBER";

    public DatabaseD(@Nullable Context context) {
        super(context, "pawerpuff3.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase2) {
        String createTableStatement = "CREATE TABLE " + DONATE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME + " TEXT, " + COLUMN_EMAIL + " TEXT, " + COLUMN_NUMBER + " TEXT)";
        sqLiteDatabase2.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase2, int i, int i1) {

    }

    public boolean AddOne(ConstructorsD donate) {
        SQLiteDatabase db2 = this.getWritableDatabase();
        ContentValues cv2 = new ContentValues();

        cv2.put(COLUMN_NAME,donate.getName());
        cv2.put(COLUMN_EMAIL, donate.getEmail());
        cv2.put(COLUMN_NUMBER, donate.getNumber());

        long insert = db2.insert(DONATE, null, cv2);
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }
}
