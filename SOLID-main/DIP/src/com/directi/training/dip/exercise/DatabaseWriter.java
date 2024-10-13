package com.directi.training.dip.exercise;

public class DatabaseWriter implements DataWriter {
    private final MyDatabase _database;

    public DatabaseWriter(MyDatabase database) {
        _database = database;
    }

    @Override
    public void writeToDatabase(String data) {
        _database.write(data);
    }
}

