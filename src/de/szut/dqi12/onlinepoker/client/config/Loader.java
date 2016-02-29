package de.szut.dqi12.onlinepoker.client.config;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Kevin on 22.02.2016.
 */
public class Loader {
    private static Charset default_charset = StandardCharsets.UTF_8;

    public static String load(String file_path) throws IOException{
        return readFile(file_path, default_charset);
    }

    private static String readFile(String path, Charset encoding) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
