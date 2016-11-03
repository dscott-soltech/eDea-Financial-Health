package com.edea.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by dscott on 11/3/2016.
 */
@Entity
@Table(name = "Asset: Credit Card", schema = "public", catalog = "postgres")
public class AssetCreditCard {
    private int ccid;
    private BigDecimal rewardprogramvalue;
    private Date rewardprogramvaluedate;
    private String rewardprogrambalance;
    private String rewardunit;

    @Id
    @Column(name = "ccid")
    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
    }

    @Basic
    @Column(name = "rewardprogramvalue")
    public BigDecimal getRewardprogramvalue() {
        return rewardprogramvalue;
    }

    public void setRewardprogramvalue(BigDecimal rewardprogramvalue) {
        this.rewardprogramvalue = rewardprogramvalue;
    }

    @Basic
    @Column(name = "rewardprogramvaluedate")
    public Date getRewardprogramvaluedate() {
        return rewardprogramvaluedate;
    }

    public void setRewardprogramvaluedate(Date rewardprogramvaluedate) {
        this.rewardprogramvaluedate = rewardprogramvaluedate;
    }

    @Basic
    @Column(name = "rewardprogrambalance")
    public String getRewardprogrambalance() {
        return rewardprogrambalance;
    }

    public void setRewardprogrambalance(String rewardprogrambalance) {
        this.rewardprogrambalance = rewardprogrambalance;
    }

    @Basic
    @Column(name = "rewardunit")
    public String getRewardunit() {
        return rewardunit;
    }

    public void setRewardunit(String rewardunit) {
        this.rewardunit = rewardunit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AssetCreditCard that = (AssetCreditCard) o;

        if (ccid != that.ccid) {
            return false;
        }
        if (rewardprogramvalue != null ? !rewardprogramvalue.equals(that.rewardprogramvalue) : that
                .rewardprogramvalue != null) {
            return false;
        }
        if (rewardprogramvaluedate != null ? !rewardprogramvaluedate.equals(that.rewardprogramvaluedate) :
                that.rewardprogramvaluedate != null) {
            return false;
        }
        if (rewardprogrambalance != null ? !rewardprogrambalance.equals(that.rewardprogrambalance) : that
                .rewardprogrambalance != null) {
            return false;
        }
        if (rewardunit != null ? !rewardunit.equals(that.rewardunit) : that.rewardunit != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = ccid;
        result = 31 * result + (rewardprogramvalue != null ? rewardprogramvalue.hashCode() : 0);
        result = 31 * result + (rewardprogramvaluedate != null ? rewardprogramvaluedate.hashCode() : 0);
        result = 31 * result + (rewardprogrambalance != null ? rewardprogrambalance.hashCode() : 0);
        result = 31 * result + (rewardunit != null ? rewardunit.hashCode() : 0);
        return result;
    }
}
