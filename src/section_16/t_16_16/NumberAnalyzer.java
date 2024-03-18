package section_16.t_16_16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberAnalyzer {

    public Set<Integer> getFactors(Integer number){

        List<Integer> factories = new ArrayList<>();

        int tempNumber = number;
        int k=2;
        while(tempNumber>1){
            while(tempNumber%k==0){
                factories.add(k);
                tempNumber=tempNumber/k;
            }
            k++;
        }

        return new HashSet<>(factories);
    }
}
