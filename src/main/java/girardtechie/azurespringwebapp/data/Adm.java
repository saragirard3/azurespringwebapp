package girardtechie.azurespringwebapp.data;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name="ADM")
public class Adm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ADM_ID")
    private long admId;
    @Column(name="DIST_ID")
    private long distId;
    @Column(name="FISCAL_YR")
    private long fiscalYr;
    @Column(name="ADM")
    private long adm;

    public long getAdmId() {
        return admId;
    }

    public long getDistId() {
        return distId;
    }

    public long getFiscalYr() {
        return fiscalYr;
    }

    public long getAdm() {
        return adm;
    }

    @Override
    public String toString() {
        return "Adm{" +
                "admId=" + admId +
                ", distId=" + distId +
                ", fiscalYr=" + fiscalYr +
                ", adm=" + adm +
                '}';
    }
}
