package sk.itsovy.dolinsky.files;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();

//        rf.printFile("/Users/martindolinsky/Downloads/FileRead/src/joke");
//        System.out.println();
//        rf.printFileInfo();
//        try {
//            rf.writeTo();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        rf.copyFile("/Users/martindolinsky/Downloads/FileRead/vstup");
//        rf.printFile("/Users/martindolinsky/Downloads/FileRead/vstup_copy");

        System.out.println(rf.diktat("/Users/martindolinsky/Downloads/FileRead/vstup","/Users/martindolinsky/Downloads/FileRead/vstup_copy"));
        System.out.println();
        rf.readNumbers("/Users/martindolinsky/Downloads/FileRead/numbers","/Users/martindolinsky/Downloads/FileRead/numbers_copy");
        System.out.println();
        rf.readNumbersSeparated("/Users/martindolinsky/Downloads/FileRead/numbers_comma","/Users/martindolinsky/Downloads/FileRead/numbers_comma_copy");
        System.out.println();
        rf.sortNumbers("/Users/martindolinsky/Downloads/FileRead/numbers","/Users/martindolinsky/Downloads/FileRead/numbers_copy");
        System.out.println();



    }
}
