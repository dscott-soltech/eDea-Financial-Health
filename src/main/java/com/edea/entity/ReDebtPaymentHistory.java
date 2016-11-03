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
@Table(name = "REDebt Payment History", schema = "public", catalog = "postgres")
public class ReDebtPaymentHistory {
    private int redebtid;
    private int pymtid;
    private Integer pymtsourceid;
    private BigDecimal pymtamount;
    private Date pymtdate;
    private Integer pymtperiod;
    private BigDecimal periodendbalance;
    private String pymtstatus;
    private Date paymentduedate;

    @Basic
    @Column(name = "redebtid")
    public int getRedebtid() {
        return redebtid;
    }

    public void setRedebtid(int redebtid) {
        this.redebtid = redebtid;
    }

    @Id
    @Column(name = "pymtid")
    public int getPymtid() {
        return pymtid;
    }

    public void setPymtid(int pymtid) {
        this.pymtid = pymtid;
    }

    @Basic
    @Column(name = "pymtsourceid")
    public Integer getPymtsourceid() {
        return pymtsourceid;
    }

    public void setPymtsourceid(Integer pymtsourceid) {
        this.pymtsourceid = pymtsourceid;
    }

    @Basic
    @Column(name = "pymtamount")
    public BigDecimal getPymtamount() {
        return pymtamount;
    }

    public void setPymtamount(BigDecimal pymtamount) {
        this.pymtamount = pymtamount;
    }

    @Basic
    @Column(name = "pymtdate")
    public Date getPymtdate() {
        return pymtdate;
    }

    public void setPymtdate(Date pymtdate) {
        this.pymtdate = pymtdate;
    }

    @Basic
    @Column(name = "pymtperiod")
    public Integer getPymtperiod() {
        return pymtperiod;
    }

    public void setPymtperiod(Integer pymtperiod) {
        this.pymtperiod = pymtperiod;
    }

    @Basic
    @Column(name = "periodendbalance")
    public BigDecimal getPeriodendbalance() {
        return periodendbalance;
    }

    public void setPeriodendbalance(BigDecimal periodendbalance) {
        this.periodendbalance = periodendbalance;
    }

    @Basic
    @Column(name = "pymtstatus")
    public String getPymtstatus() {
        return pymtstatus;
    }

    public void setPymtstatus(String pymtstatus) {
        this.pymtstatus = pymtstatus;
    }

    @Basic
    @Column(name = "paymentduedate")
    public Date getPaymentduedate() {
        return paymentduedate;
    }

    public void setPaymentduedate(Date paymentduedate) {
        this.paymentduedate = paymentduedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReDebtPaymentHistory that = (ReDebtPaymentHistory) o;

        if (redebtid != that.redebtid) {
            return false;
        }
        if (pymtid != that.pymtid) {
            return false;
        }
        if (pymtsourceid != null ? !pymtsourceid.equals(that.pymtsourceid) : that.pymtsourceid != null) {
            return false;
        }
        if (pymtamount != null ? !pymtamount.equals(that.pymtamount) : that.pymtamount != null) {
            return false;
        }
        if (pymtdate != null ? !pymtdate.equals(that.pymtdate) : that.pymtdate != null) {
            return false;
        }
        if (pymtperiod != null ? !pymtperiod.equals(that.pymtperiod) : that.pymtperiod != null) {
            return false;
        }
        if (periodendbalance != null ? !periodendbalance.equals(that.periodendbalance) : that
                .periodendbalance != null) {
            return false;
        }
        if (pymtstatus != null ? !pymtstatus.equals(that.pymtstatus) : that.pymtstatus != null) {
            return false;
        }
        if (paymentduedate != null ? !paymentduedate.equals(that.paymentduedate) : that.paymentduedate !=
                null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = redebtid;
        result = 31 * result + pymtid;
        result = 31 * result + (pymtsourceid != null ? pymtsourceid.hashCode() : 0);
        result = 31 * result + (pymtamount != null ? pymtamount.hashCode() : 0);
        result = 31 * result + (pymtdate != null ? pymtdate.hashCode() : 0);
        result = 31 * result + (pymtperiod != null ? pymtperiod.hashCode() : 0);
        result = 31 * result + (periodendbalance != null ? periodendbalance.hashCode() : 0);
        result = 31 * result + (pymtstatus != null ? pymtstatus.hashCode() : 0);
        result = 31 * result + (paymentduedate != null ? paymentduedate.hashCode() : 0);
        return result;
    }
}
