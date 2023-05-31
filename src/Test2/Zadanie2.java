package Test2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class Zadanie2 {

    public static Map<DayOfWeek, Integer> countFilesCreationDay(String directory) throws IOException {
        Path startPath = Paths.get(directory);
        FileCreationDayCounter counter = new FileCreationDayCounter();
        Files.walkFileTree(startPath, counter);
        return counter.dayOfWeekCountMap;
    }

    private static class FileCreationDayCounter extends SimpleFileVisitor<Path> {
        private Map<DayOfWeek, Integer> dayOfWeekCountMap = new HashMap<>();

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return dir.getFileName().toString().equals("node_modules") ? FileVisitResult.SKIP_SUBTREE : FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            String fileName = file.toString();
            if (fileName.endsWith(".java") || fileName.endsWith(".ts") || fileName.endsWith(".html") || fileName.endsWith(".css")) {
                DayOfWeek dayOfWeek = getCreationDayOfWeek(file);
                dayOfWeekCountMap.put(dayOfWeek, dayOfWeekCountMap.getOrDefault(dayOfWeek, 0) + 1);
            }
            return FileVisitResult.CONTINUE;
        }

        private DayOfWeek getCreationDayOfWeek(Path file) throws IOException {
            BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
            return LocalDateTime.ofInstant(attrs.creationTime().toInstant(), ZoneId.systemDefault()).getDayOfWeek();
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            return FileVisitResult.CONTINUE;
        }
    }
}
