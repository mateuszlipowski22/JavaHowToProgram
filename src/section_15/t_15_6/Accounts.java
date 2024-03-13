package section_15.t_15_6;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Accounts {
   private List<Account> accounts = new ArrayList<>();

   public List<Account> getAccounts() {return accounts;}
}
