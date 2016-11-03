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
@Table(name = "CC Payment History", schema = "public", catalog = "postgres")
public class CcPaymentHistory {
    private int ccid;
    private int pymtid;
    private Date pymtdate;
    private BigDecimal pymtamount;
    private String pymttype;
    private Date pymtperiod;
    private BigDecimal periodendbalance;
    private Date paymentduedate;
    private Boolean paymentstatus;
    private String paymentsourcetype;
    private String paymentsourceid;

    @Basic
    @Column(name = "ccid")
    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
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
    @Column(name = "pymtdate")
    public Date getPymtdate() {
        return pymtdate;
    }

    public void setPymtdate(Date pymtdate) {
        this.pymtdate = pymtdate;
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
    @Column(name = "pymttype")
    public String getPymttype() {
        return pymttype;
    }

    public void setPymttype(String pymttype) {
        this.pymttype = pymttype;
    }

    @Basic
    @Column(name = "pymtperiod")
    public Date getPymtperiod() {
        return pymtperiod;
    }

    public void setPymtperiod(Date pymtperiod) {
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
    @Column(name = "paymentduedate")
    public Date getPaymentduedate() {
        return paymentduedate;
    }

    public void setPaymentduedate(Date paymentduedate) {
        this.paymentduedate = paymentduedate;
    }

    @Basic
    @Column(name = "paymentstatus")
    public Boolean getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(Boolean paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    @Basic
    @Column(name = "paymentsourcetype")
    public String getPaymentsourcetype() {
        return paymentsourcetype;
    }

    public void setPaymentsourcetype(String paymentsourcetype) {
        this.paymentsourcetype = paymentsourcetype;
    }

    @Basic
    @Column(name = "paymentsourceid")
    public String getPaymentsourceid() {
        return paymentsourceid;
    }

    public void setPaymentsourceid(String paymentsourceid) {
        this.paymentsourceid = paymentsourceid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CcPaymentHistory that = (CcPaymentHistory) o;

        if (ccid != that.ccid) {
            return false;
        }
        if (pymtid != that.pymtid) {
            return false;
        }
        if (pymtdate != null ? !pymtdate.equals(that.pymtdate) : that.pymtdate != null) {
            return false;
        }
        if (pymtamount != null ? !pymtamount.equals(that.pymtamount) : that.pymtamount != null) {
            return false;
        }
        if (pymttype != null ? !pymttype.equals(that.pymttype) : that.pymttype != null) {
            return false;
        }
        if (pymtperiod != null ? !pymtperiod.equals(that.pymtperiod) : that.pymtperiod != null) {
            return false;
        }
        if (periodendbalance != null ? !periodendbalance.equals(that.periodendbalance) : that
                .periodendbalance != null) {
            return false;
        }
        if (paymentduedate != null ? !paymentduedate.equals(that.paymentduedate) : that.paymentduedate !=
                null) {
            return false;
        }
        if (paymentstatus != null ? !paymentstatus.equals(that.paymentstatus) : that.paymentstatus != null) {
            return false;
        }
        if (paymentsourcetype != null ? !paymentsourcetype.equals(that.paymentsourcetype) : that
                .paymentsourcetype != null) {
            return false;
        }
        if (paymentsourceid != null ? !paymentsourceid.equals(that.paymentsourceid) : that.paymentsourceid
                != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = ccid;
        result = 31 * result + pymtid;
        result = 31 * result + (pymtdate != null ? pymtdate.hashCode() : 0);
        result = 31 * result + (pymtamount != null ? pymtamount.hashCode() : 0);
        result = 31 * result + (pymttype != null ? pymttype.hashCode() : 0);
        result = 31 * result + (pymtperiod != null ? pymtperiod.hashCode() : 0);
        result = 31 * result + (periodendbalance != null ? periodendbalance.hashCode() : 0);
        result = 31 * result + (paymentduedate != null ? paymentduedate.hashCode() : 0);
        result = 31 * result + (paymentstatus != null ? paymentstatus.hashCode() : 0);
        result = 31 * result + (paymentsourcetype != null ? paymentsourcetype.hashCode() : 0);
        result = 31 * result + (paymentsourceid != null ? paymentsourceid.hashCode() : 0);
        return result;
    }
}
