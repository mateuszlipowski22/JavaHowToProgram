package section_15.t_15_8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPoll {

    public void getResponse(String filePath){
        try(Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter(filePath)){

            System.out.println("Wpisz kolejne wyniki ankiety albo 0 aby wyjść");
            StringBuilder output = new StringBuilder();
            while(scanner.hasNextInt()){
                int input = scanner.nextInt();
                if(input==0){
                    break;
                }else {
                    output.append(String.format("%d ", input));
                }
            }

            if(output.length() > 0){
                output.deleteCharAt(output.length() - 1);
            }
            formatter.format(output.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void processData(String outputFile, String inputFile){
        try(Formatter formatter = new Formatter(outputFile);
            Scanner scanner = new Scanner(Paths.get(inputFile))){

            int[] frequency = new int[6];

            while (scanner.hasNextInt()){
                int currentInt=0;
                try{
                    currentInt = scanner.nextInt();
                    ++frequency[currentInt];
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                    System.out.printf(" response: %d%n",currentInt);
                }
            }

            StringBuilder output = new StringBuilder(String.format("%s%10s%n","Ocena","Częstość"));
            for(int rating=1;rating<frequency.length;rating++){
                output.append(String.format("%5d%10d%n",rating, frequency[rating]));
            }

            formatter.format(output.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
