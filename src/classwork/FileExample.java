package classwork;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {
        String directoryPath = "src/classwork/fileExample/fileExample/ioExamples/serialization/poxos.txt";
        String path = "src/classwork/fileExample/fileExample/ioExamples/serialization/poxos.txt";
        File file = new File(path);
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("isFile: " + file.isFile());
        System.out.println("file size: " + file.length());
        File directory = new File(directoryPath);
        String[] list = directory.list();
        for (String s : list) {
            System.out.println(s);
        }

     /*  if (file.exists()) {
            System.out.println("file exists");
        } else {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("File created");
            } else {
                System.out.println("File not created");
            } */
    }
}