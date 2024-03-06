package section_14.t_14_19;

import java.util.HashMap;
import java.util.Map;

public class DataFormatter {
    Map<String,String> months;
    public DataFormatter() {
        months= new HashMap<>();
        months.put("01","styczen");
        months.put("02","luty");
        months.put("03","marzec");
        months.put("04","kwiecien");
        months.put("05","maj");
        months.put("06","czerwiec");
        months.put("07","lipiec");
        months.put("08","sierpien");
        months.put("09","wrzesien");
        months.put("10","pazdziernik");
        months.put("11","listopad");
        months.put("12","grudzien");
    }

    public String convertData(String data){
        String[] splitDate = data.split("-");
        String outputDate;
        if(months.containsKey(splitDate[1])){
            outputDate = String.format("%s %s %s",splitDate[0], months.get(splitDate[1]), splitDate[2]);
        }else {
            throw new IllegalArgumentException("Niepoprawny miesiac");
        }
        return outputDate;
    }
}
