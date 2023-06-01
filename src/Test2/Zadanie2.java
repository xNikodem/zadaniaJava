package Test2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class Zadanie2 {

    private Map<DayOfWeek, Integer> dayOfWeekCountMap = new HashMap<>();

    public Map<DayOfWeek, Integer> countFilesCreationDay(String directory) throws IOException {
        File dir = new File(directory);
        countFilesCreationDay(dir);
        return dayOfWeekCountMap;
    }

    private void countFilesCreationDay(File directory) throws IOException {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory() && !file.getName().equals("node_modules")) {
                    countFilesCreationDay(file);
                } else if (file.getName().endsWith(".java") || file.getName().endsWith(".ts") ||
                        file.getName().endsWith(".html") || file.getName().endsWith(".css")) {
                    BasicFileAttributes attrs = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                    DayOfWeek dayOfWeek = LocalDateTime.ofInstant(attrs.creationTime().toInstant(), ZoneId.systemDefault()).getDayOfWeek();
                    dayOfWeekCountMap.put(dayOfWeek, dayOfWeekCountMap.getOrDefault(dayOfWeek, 0) + 1);
                }
            }
        }
    }
}

