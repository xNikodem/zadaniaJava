package Test2;

import java.io.File;

public class Zadanie1 {

    public static File findLargestJavaFile(String directory) {
        File dir = new File(directory);
        return findLargestJavaFile(dir);
    }

    private static File findLargestJavaFile(File directory) {
        File largestJavaFile = null;
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                File largestInSubtree = file;

                if (file.isDirectory()) {
                    //dodałem tutaj rekurencje ale przez to program wykonuje sie trochę wolniej
                    largestInSubtree = findLargestJavaFile(file);
                }

                if (largestInSubtree != null && largestInSubtree.getName().endsWith(".java")) {
                    if (largestJavaFile == null || largestInSubtree.length() > largestJavaFile.length()) {
                        largestJavaFile = largestInSubtree;
                    }
                }
            }
        }

        return largestJavaFile;
    }
}

