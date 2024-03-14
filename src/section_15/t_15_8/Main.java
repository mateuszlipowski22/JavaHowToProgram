package section_15.t_15_8;

public class Main {
    public static void main(String[] args) {
        int[] response = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        StudentPoll studentPoll = new StudentPoll();
        studentPoll.getResponse(FileUtil.FILE_PATH_NUMBERS);
        studentPoll.processData(FileUtil.FILE_PATH_OUTPUT, FileUtil.FILE_PATH_NUMBERS);

    }
}
