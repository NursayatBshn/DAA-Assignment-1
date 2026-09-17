package daa.bench;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvWriter {

    public static void write(Path outputPath, List<Result> results) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            writer.write("algorithm,input,n,time_ms,comparisons,max_depth");
            writer.newLine();

            for (Result result : results) {
                writer.write(result.toCsvRow());
                writer.newLine();
            }
        }
    }
}