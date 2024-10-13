package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        ReaderWriter fileReaderWriter = new FileReaderWriter(
                "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt",
                "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        MyDatabase database = new MyDatabase();
        DataWriter dataWriter = new DatabaseWriter(database);
        NetworkReader networkReader = new NetworkDataReader();

        EncodingModule encodingModule = new EncodingModule(fileReaderWriter, dataWriter, networkReader);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
