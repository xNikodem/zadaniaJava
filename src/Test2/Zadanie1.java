package Test2;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Zadanie1 {

    public static File findLargestJavaFile(String directory) throws IOException {
        Path startPath = Paths.get(directory);
        LargestJavaFileFinder finder = new LargestJavaFileFinder();
        Files.walkFileTree(startPath, finder);
        return finder.largestJavaFile;
    }

    private static class LargestJavaFileFinder extends SimpleFileVisitor<Path> {
        private File largestJavaFile = null;

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            if (file.toString().endsWith(".java")) {
                if (largestJavaFile == null || file.toFile().length() > largestJavaFile.length()) {
                    largestJavaFile = file.toFile();
                }
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            return FileVisitResult.CONTINUE;
        }
    }
}
