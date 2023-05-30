package com.example.pawerpuff;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseV extends SQLiteOpenHelper {

    public static final String PAWER_PUFF2 = "PAWER_PUFF2";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_EMAIL = "EMAIL";
    public static final String COLUMN_ADDRESS = "ADDRESS";
    public static final String COLUMN_NUMBER = "NUMBER";
    public static final String COLUMN_DOGS = "DOGS";

    public DatabaseV(@Nullable Context context) {
        super(context, "pawerpuff2.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTableStatement = "CREATE TABLE " + PAWER_PUFF2 + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME + " TEXT, " + COLUMN_EMAIL + " TEXT, " + COLUMN_ADDRESS + " TEXT, " + COLUMN_NUMBER + " TEXT, " + COLUMN_DOGS + " BOOL)";
        sqLiteDatabase.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean AddOne(ConstructorsV virtually) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NAME,virtually.getName());
        cv.put(COLUMN_EMAIL, virtually.getEmail());
        cv.put(COLUMN_ADDRESS, virtually.getAddress());
        cv.put(COLUMN_NUMBER, virtually.getNumber());
        cv.put(COLUMN_DOGS, virtually.isDogs());

        long insert = db.insert(PAWER_PUFF2, null, cv);
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }
}
