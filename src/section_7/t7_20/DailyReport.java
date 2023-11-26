package section_7.t7_20;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class DailyReport {
    private Date date;
    private Map<SalesPerson, DailySale> report;

    public DailyReport(Date date) {
        this.date=date;
        this.report = new HashMap<>();
    }

    public void addReport(DailySale dailySale){
        report.put(dailySale.getSalesPerson(),dailySale);
    }

    public Map<SalesPerson, DailySale> getReport() {
        return report;
    }

    public Date getDate() {
        return date;
    }
}
