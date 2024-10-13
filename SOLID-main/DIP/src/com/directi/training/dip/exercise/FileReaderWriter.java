package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter implements ReaderWriter {
    private final String _inputFilePath;
    private final String _outputFilePath;

    public FileReaderWriter(String inputFilePath, String outputFilePath) {
        _inputFilePath = inputFilePath;
        _outputFilePath = outputFilePath;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(_inputFilePath));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();
        return content.toString();
    }

    @Override
    public void write(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_outputFilePath));
        writer.write(data);
        writer.close();
    }
}

