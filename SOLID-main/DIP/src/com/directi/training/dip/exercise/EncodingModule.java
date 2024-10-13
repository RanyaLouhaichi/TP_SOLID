package com.directi.training.dip.exercise;


import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private final ReaderWriter _readerWriter;
    private final DataWriter _dataWriter;
    private final NetworkReader _networkReader;

    public EncodingModule(ReaderWriter readerWriter, DataWriter dataWriter, NetworkReader networkReader) {
        this._readerWriter = readerWriter;
        this._dataWriter = dataWriter;
        this._networkReader = networkReader;
    }

    public void encodeWithFiles() throws IOException {
        String content = _readerWriter.read();
        String encodedContent = Base64.getEncoder().encodeToString(content.getBytes());
        _readerWriter.write(encodedContent);
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        String networkContent = _networkReader.readFromNetwork();
        String encodedContent = Base64.getEncoder().encodeToString(networkContent.getBytes());
        _dataWriter.writeToDatabase(encodedContent);
    }
}

