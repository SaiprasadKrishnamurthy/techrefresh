import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by saikris on 08/11/2015.
 */
public class FileGrep {

    public static void main(String[] args) {
        Predicate<File> filesOnly = f -> f.canRead();
        File rootDir = Paths.get(System.getProperty("user.dir"), "src", "test", "resources").toFile();

        System.out.println(findFilesIn(rootDir, filesOnly));

    }

    public static List<File> findFilesIn(File rootDir, Predicate<File> predicate) {
        ArrayList<File> collected = new ArrayList<>();
        walk(rootDir, predicate, collected);
        return collected;
    }

    private static void walk(File dir, Predicate<File> filterFunction, List<File> collected) {
        Stream.of(listOnlyWhenDirectory(dir))
                .forEach(file -> walk(file, filterFunction, addAndReturn(collected, file, filterFunction)));
    }

    private static File[] listOnlyWhenDirectory(File dir) {
        return dir.isDirectory() ? dir.listFiles() : new File[]{};
    }

    private static List<File> addAndReturn(List<File> files, File toAdd, Predicate<File> filterFunction) {
        if (filterFunction.test(toAdd)) {
            files.add(toAdd);
        }
        return files;
    }
}
