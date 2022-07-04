package girardtechie.azurespringwebapp.data;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@EntityScan
@Table(name="DISTRICTS")
public class Districts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="D_ID")
    private long dId;
    @Column(name="DIST_ID")
    private long distId;
    @Column(name="DIST_NAME")
    private String distName;
    @Column(name="METRO48")
    private boolean metro48;
    @Column(name="MREA")
    private boolean mrea;
    @Column(name="SEE")
    private boolean see;
    @Column(name="AMSD")
    private boolean amsd;
    @Column(name="NONPUB")
    private boolean nonPub;

    public long getdId() {
        return dId;
    }

    public long getDistId() {
        return distId;
    }

    public String getDistName() {
        return distName;
    }

    public boolean isMetro48() {
        return metro48;
    }

    public boolean isMrea() {
        return mrea;
    }

    public boolean isSee() {
        return see;
    }

    public boolean isAmsd() {
        return amsd;
    }

    public boolean isNonPub() {
        return nonPub;
    }

    @Override
    public String toString() {
        return "Districts{" +
                "dId=" + dId +
                ", distId=" + distId +
                ", distName='" + distName + '\'' +
                ", metro48=" + metro48 +
                ", mrea=" + mrea +
                ", see=" + see +
                ", amsd=" + amsd +
                ", nonPub=" + nonPub +
                '}';
    }
}
