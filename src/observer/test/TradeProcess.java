package observer.test;

import observer.subject.Accountant;
import observer.subject.FundManager;
import observer.subject.InvestmentCommittee;
import observer.subject.InvestmentDepartment;
import observer.subject.ResearchDepartment;
import observer.subject.RiskCommittee;
import observer.subject.StockExchange;
import observer.subject.TradeDepartment;

/**
 * This test uses observer model of JDK.
 * 
 * @author Dreamingodd
 *
 */
public class TradeProcess {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ResearchDepartment rd = new ResearchDepartment();
        InvestmentCommittee ic = new InvestmentCommittee(rd);
        InvestmentDepartment id = new InvestmentDepartment(ic);
        FundManager fm = new FundManager(id);
        TradeDepartment td = new TradeDepartment(fm);
        StockExchange se = new StockExchange(td);
        Accountant ac = new Accountant(td);

        RiskCommittee rc1 = new RiskCommittee(ac);
        RiskCommittee rc2 = new RiskCommittee(fm);

        rd.update();
    }
}
