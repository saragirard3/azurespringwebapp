package girardtechie.azurespringwebapp.data;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


@EntityScan
@Table(name="dataEXP")
public class Expense {
    @Id
    @Column(name="DIST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long distId;
    @Column(name="DIST_NAME")
    private String distName;
    @Column(name="FISCAL_YEAR")
    private long fiscalYear;
    @Column(name="ADM")
    private long adm;
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

    public long getDistId() {
        return distId;
    }

    public void setDistId(long distId) {
        this.distId = distId;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    public long getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(long fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public long getAdm() {
        return adm;
    }

    public void setAdm(long adm) {
        this.adm = adm;
    }

    public long getDistLevAdm() {
        return distLevAdm;
    }

    public void setDistLevAdm(long distLevAdm) {
        this.distLevAdm = distLevAdm;
    }

    public long getSchLevAdm() {
        return schLevAdm;
    }

    public void setSchLevAdm(long schLevAdm) {
        this.schLevAdm = schLevAdm;
    }

    public long getRegInst() {
        return regInst;
    }

    public void setRegInst(long regInst) {
        this.regInst = regInst;
    }

    public long getCte() {
        return cte;
    }

    public void setCte(long cte) {
        this.cte = cte;
    }

    public long getSped() {
        return sped;
    }

    public void setSped(long sped) {
        this.sped = sped;
    }

    public long getSa() {
        return sa;
    }

    public void setSa(long sa) {
        this.sa = sa;
    }

    public long getInstSupSvc() {
        return instSupSvc;
    }

    public void setInstSupSvc(long instSupSvc) {
        this.instSupSvc = instSupSvc;
    }

    public long getPupSupSvc() {
        return pupSupSvc;
    }

    public void setPupSupSvc(long pupSupSvc) {
        this.pupSupSvc = pupSupSvc;
    }

    public long getOpMaint() {
        return opMaint;
    }

    public void setOpMaint(long opMaint) {
        this.opMaint = opMaint;
    }

    public long getTrans() {
        return trans;
    }

    public void setTrans(long trans) {
        this.trans = trans;
    }

    public long getSubGfOp() {
        return subGfOp;
    }

    public void setSubGfOp(long subGfOp) {
        this.subGfOp = subGfOp;
    }

    public long getEquipment() {
        return equipment;
    }

    public void setEquipment(long equipment) {
        this.equipment = equipment;
    }

    public long getLandBld() {
        return landBld;
    }

    public void setLandBld(long landBld) {
        this.landBld = landBld;
    }

    public long getSubCapExp() {
        return subCapExp;
    }

    public void setSubCapExp(long subCapExp) {
        this.subCapExp = subCapExp;
    }

    public long getTotalGfExp() {
        return totalGfExp;
    }

    public void setTotalGfExp(long totalGfExp) {
        this.totalGfExp = totalGfExp;
    }

    public long getFoodSvc() {
        return foodSvc;
    }

    public void setFoodSvc(long foodSvc) {
        this.foodSvc = foodSvc;
    }

    public long getCommSvc() {
        return commSvc;
    }

    public void setCommSvc(long commSvc) {
        this.commSvc = commSvc;
    }

    public long getBldConst() {
        return bldConst;
    }

    public void setBldConst(long bldConst) {
        this.bldConst = bldConst;
    }

    public long getDebtSvc() {
        return debtSvc;
    }

    public void setDebtSvc(long debtSvc) {
        this.debtSvc = debtSvc;
    }

    public long getOpebSvc() {
        return opebSvc;
    }

    public void setOpebSvc(long opebSvc) {
        this.opebSvc = opebSvc;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "distId=" + distId +
                ", distName='" + distName + '\'' +
                ", fiscalYear=" + fiscalYear +
                ", adm=" + adm +
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
