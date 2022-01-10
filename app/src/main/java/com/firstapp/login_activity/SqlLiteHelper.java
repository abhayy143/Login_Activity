package com.firstapp.login_activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqlLiteHelper extends SQLiteOpenHelper {
    public SqlLiteHelper(Context context,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
