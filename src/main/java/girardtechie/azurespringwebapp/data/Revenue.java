package girardtechie.azurespringwebapp.data;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name="REVENUE")
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="REV_ID")
    private long revId;
    @Column(name="DIST_ID")
    private long distId;
    @Column(name="FISCAL_YR")
    private long fiscalYr;
    @Column(name="GF_LOC_PROPTAX")
    private long gfLocPropTax;
    @Column(name="GF_LOC_PROPTAXSHIFT")
    private long gfLocPropTaxShift;
    @Column(name="GF_LOC_OTHER")
    private long gfLocOther;
    @Column(name="GF_LOC_TOTAL")
    private long gfLocTotal;
    @Column(name="GF_STATE_GENED")
    private long gfStateGenEd;
    @Column(name="GF_STATE_SPED")
    private long gfStateSpEd;
    @Column(name="GF_STATE_OTHER")
    private long gfStateOther;
    @Column(name="GF_STATE_AIDADJ")
    private long gfStateAidAdj;
    @Column(name="GF_STATE_TOTAL")
    private long gfStateTotal;
    @Column(name="GF_FED_TOTAL")
    private long gfFedTotal;
    @Column(name="FOODSVC")
    private long foodSvc;
    @Column(name="COMMSVC")
    private long commSvc;
    @Column(name="BLDCONST")
    private long bldConst;
    @Column(name="OPEB")
    private long opeb;
    @Column(name="TOTAL_REV")
    private long totalRev;
    @Column(name="TOTAL_LOC_PROPTAX")
    private long totalLocalPropTax;
    @Column(name="TOTAL_LOC_PROPTAXSHIFT")
    private long totalLocalPropTaxShift;
    @Column(name="TOTAL_LOC_OTHER")
    private long totalLocOther;
    @Column(name="TOTAL_STATE")
    private long totalState;
    @Column(name="TOTAL_STATE_AIDADJ")
    private long totalStateAidAdj;
    @Column(name="TOTAL_FED")
    private long totalFed;

    public long getRevId() {
        return revId;
    }

    public long getDistId() {
        return distId;
    }

    public long getFiscalYr() {
        return fiscalYr;
    }

    public long getGfLocPropTax() {
        return gfLocPropTax;
    }

    public long getGfLocPropTaxShift() {
        return gfLocPropTaxShift;
    }

    public long getGfLocOther() {
        return gfLocOther;
    }

    public long getGfLocTotal() {
        return gfLocTotal;
    }

    public long getGfStateGenEd() {
        return gfStateGenEd;
    }

    public long getGfStateSpEd() {
        return gfStateSpEd;
    }

    public long getGfStateOther() {
        return gfStateOther;
    }

    public long getGfStateAidAdj() {
        return gfStateAidAdj;
    }

    public long getGfStateTotal() {
        return gfStateTotal;
    }

    public long getGfFedTotal() {
        return gfFedTotal;
    }

    public long getFoodSvc() {
        return foodSvc;
    }

    public long getCommSvc() {
        return commSvc;
    }

    public long getBldConst() {
        return bldConst;
    }

    public long getOpeb() {
        return opeb;
    }

    public long getTotalRev() {
        return totalRev;
    }

    public long getTotalLocalPropTax() {
        return totalLocalPropTax;
    }

    public long getTotalLocalPropTaxShift() {
        return totalLocalPropTaxShift;
    }

    public long getTotalLocOther() {
        return totalLocOther;
    }

    public long getTotalState() {
        return totalState;
    }

    public long getTotalStateAidAdj() {
        return totalStateAidAdj;
    }

    public long getTotalFed() {
        return totalFed;
    }

    @Override
    public String toString() {
        return "Revenue{" +
                "revId=" + revId +
                ", distId=" + distId +
                ", fiscalYr=" + fiscalYr +
                ", gfLocPropTax=" + gfLocPropTax +
                ", gfLocPropTaxShift=" + gfLocPropTaxShift +
                ", gfLocOther=" + gfLocOther +
                ", gfLocTotal=" + gfLocTotal +
                ", gfStateGenEd=" + gfStateGenEd +
                ", gfStateSpEd=" + gfStateSpEd +
                ", gfStateOther=" + gfStateOther +
                ", gfStateAidAdj=" + gfStateAidAdj +
                ", gfStateTotal=" + gfStateTotal +
                ", gfFedTotal=" + gfFedTotal +
                ", foodSvc=" + foodSvc +
                ", commSvc=" + commSvc +
                ", bldConst=" + bldConst +
                ", opeb=" + opeb +
                ", totalRev=" + totalRev +
                ", totalLocalPropTax=" + totalLocalPropTax +
                ", totalLocalPropTaxShift=" + totalLocalPropTaxShift +
                ", totalLocOther=" + totalLocOther +
                ", totalState=" + totalState +
                ", totalStateAidAdj=" + totalStateAidAdj +
                ", totalFed=" + totalFed +
                '}';
    }
}
