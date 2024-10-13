package com.directi.training.dip.exercise;

import java.io.IOException;

public interface ReaderWriter {
    String read() throws IOException;
    void write(String data) throws IOException;
}