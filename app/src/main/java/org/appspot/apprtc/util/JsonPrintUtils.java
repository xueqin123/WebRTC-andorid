package org.appspot.apprtc.util;

import org.appspot.apprtc.RTCApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonPrintUtils {

    public static void LogJson(String info, String jsonStr) {
        FileWriter writer;
        try {
            String path = RTCApp.appContext.getCacheDir().getAbsolutePath();
            writer = new FileWriter(path + File.separator + "jsonLog");
            writer.write(info + "/n");
            writer.write(jsonStr);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
