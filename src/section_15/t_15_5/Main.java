package section_15.t_15_5;

public class Main {
    public static void main(String[] args) {
        FileMatch fileMatch = new FileMatch();
        fileMatch.processFiles(FileUtil.FILE_PATH_OLD_MAST,
                FileUtil.FILE_PATH_TRANS,
                FileUtil.FILE_PATH_NEW_MAST,
                FileUtil.FILE_PATH_ERROR_LOG);
    }
}
