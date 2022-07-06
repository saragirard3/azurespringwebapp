package girardtechie.azurespringwebapp.data;

import javax.persistence.*;

@Entity
@Table(name="EXPENSE")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EXP_ID")
    private long expId;
    @Column(name="DIST_ID")
    private long distId;
    @Column(name="FISCAL_YEAR")
    private long fiscalYear;
    @Column(name="DIST_LEV_ADM")
    private long distLevAdm;
    @Column(name="SCH_LEV_ADM")
    private long schLevAdm;
    @Column(name="REG_INST")
    private long regInst;
    @Column(name="CTE")
    private long cte;
    @Column(name="SPED")
    private long sped;
    @Column(name="SA")
    private long sa;
    @Column(name="INST_SUP_SVC")
    private long instSupSvc;
    @Column(name="PUP_SUP_SVC")
    private long pupSupSvc;
    @Column(name="OP_MAINT")
    private long opMaint;
    @Column(name="TRANS")
    private long trans;
    @Column(name="SUB_GF_OP")
    private long subGfOp;
    @Column(name="EQUIPMENT")
    private long equipment;
    @Column(name="LAND_BLD")
    private long landBld;
    @Column(name="SUB_CAP_EXP")
    private long subCapExp;
    @Column(name="TOT_GF_EXP")
    private long totalGfExp;
    @Column(name="FOOD_SVC")
    private long foodSvc;
    @Column(name="COMM_SVC")
    private long commSvc;
    @Column(name="BLD_CONST")
    private long bldConst;
    @Column(name="DEBT_SVC")
    private long debtSvc;
    @Column(name="OPEB_SVC")
    private long opebSvc;

    public long getExpId() {
        return expId;
    }

    public long getDistId() {
        return distId;
    }

    public long getFiscalYear() {
        return fiscalYear;
    }

    public long getDistLevAdm() {
        return distLevAdm;
    }

    public long getSchLevAdm() {
        return schLevAdm;
    }

    public long getRegInst() {
        return regInst;
    }

    public long getCte() {
        return cte;
    }

    public long getSped() {
        return sped;
    }

    public long getSa() {
        return sa;
    }

    public long getInstSupSvc() {
        return instSupSvc;
    }

    public long getPupSupSvc() {
        return pupSupSvc;
    }

    public long getOpMaint() {
        return opMaint;
    }

    public long getTrans() {
        return trans;
    }

    public long getSubGfOp() {
        return subGfOp;
    }

    public long getEquipment() {
        return equipment;
    }

    public long getLandBld() {
        return landBld;
    }

    public long getSubCapExp() {
        return subCapExp;
    }

    public long getTotalGfExp() {
        return totalGfExp;
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

    public long getDebtSvc() {
        return debtSvc;
    }

    public long getOpebSvc() {
        return opebSvc;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expId=" + expId +
                ", distId=" + distId +
                ", fiscalYear=" + fiscalYear +
                ", distLevAdm=" + distLevAdm +
                ", schLevAdm=" + schLevAdm +
                ", regInst=" + regInst +
                ", cte=" + cte +
                ", sped=" + sped +
                ", sa=" + sa +
                ", instSupSvc=" + instSupSvc +
                ", pupSupSvc=" + pupSupSvc +
                ", opMaint=" + opMaint +
                ", trans=" + trans +
                ", subGfOp=" + subGfOp +
                ", equipment=" + equipment +
                ", landBld=" + landBld +
                ", subCapExp=" + subCapExp +
                ", totalGfExp=" + totalGfExp +
                ", foodSvc=" + foodSvc +
                ", commSvc=" + commSvc +
                ", bldConst=" + bldConst +
                ", debtSvc=" + debtSvc +
                ", opebSvc=" + opebSvc +
                '}';
    }
}
