package section_15.t_15_6;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class TransactionRecords {
   private List<TransactionRecord> transactionRecords = new ArrayList<>();

   public List<TransactionRecord> getTransactionRecords() {
      return transactionRecords;
   }
}
