package com.example.countying.core.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "countying.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE users (id TEXT PRIMARY KEY, name TEXT, email TEXT, password TEXT)");
        db.execSQL("CREATE TABLE business (id TEXT PRIMARY KEY, name TEXT, description TEXT, location TEXT)");
        db.execSQL("CREATE TABLE inventory (id TEXT PRIMARY KEY, itemName TEXT, quantity INTEGER)");
        db.execSQL("CREATE TABLE finance (id TEXT PRIMARY KEY, type TEXT, amount REAL, description TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        db.execSQL("DROP TABLE IF EXISTS business");
        db.execSQL("DROP TABLE IF EXISTS inventory");
        db.execSQL("DROP TABLE IF EXISTS finance");
        onCreate(db);
    }
}
