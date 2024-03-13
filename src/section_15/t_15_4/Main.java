package section_15.t_15_4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileMatch fileMatch = new FileMatch();
        fileMatch.processFiles(FileUtil.FILE_PATH_OLD_MAST,
                FileUtil.FILE_PATH_TRANS,
                FileUtil.FILE_PATH_NEW_MAST,
                FileUtil.FILE_PATH_ERROR_LOG);
    }
}
