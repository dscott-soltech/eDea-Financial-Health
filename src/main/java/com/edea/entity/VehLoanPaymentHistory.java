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
@Table(name = "VehLoan Payment History", schema = "public", catalog = "postgres")
public class VehLoanPaymentHistory {
    private int debtid;
    private int pymtid;
    private Date pymtdate;
    private BigDecimal pymtamount;
    private Integer pymtperiod;
    private BigDecimal periodendbalance;
    private Date paymentduedate;
    private String paymentstatus;
    private String paymentsource;
    private Integer paymentsourceid;

    @Basic
    @Column(name = "debtid")
    public int getDebtid() {
        return debtid;
    }

    public void setDebtid(int debtid) {
        this.debtid = debtid;
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
    @Column(name = "paymentduedate")
    public Date getPaymentduedate() {
        return paymentduedate;
    }

    public void setPaymentduedate(Date paymentduedate) {
        this.paymentduedate = paymentduedate;
    }

    @Basic
    @Column(name = "paymentstatus")
    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    @Basic
    @Column(name = "paymentsource")
    public String getPaymentsource() {
        return paymentsource;
    }

    public void setPaymentsource(String paymentsource) {
        this.paymentsource = paymentsource;
    }

    @Basic
    @Column(name = "paymentsourceid")
    public Integer getPaymentsourceid() {
        return paymentsourceid;
    }

    public void setPaymentsourceid(Integer paymentsourceid) {
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

        VehLoanPaymentHistory that = (VehLoanPaymentHistory) o;

        if (debtid != that.debtid) {
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
        if (paymentsource != null ? !paymentsource.equals(that.paymentsource) : that.paymentsource != null) {
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
        int result = debtid;
        result = 31 * result + pymtid;
        result = 31 * result + (pymtdate != null ? pymtdate.hashCode() : 0);
        result = 31 * result + (pymtamount != null ? pymtamount.hashCode() : 0);
        result = 31 * result + (pymtperiod != null ? pymtperiod.hashCode() : 0);
        result = 31 * result + (periodendbalance != null ? periodendbalance.hashCode() : 0);
        result = 31 * result + (paymentduedate != null ? paymentduedate.hashCode() : 0);
        result = 31 * result + (paymentstatus != null ? paymentstatus.hashCode() : 0);
        result = 31 * result + (paymentsource != null ? paymentsource.hashCode() : 0);
        result = 31 * result + (paymentsourceid != null ? paymentsourceid.hashCode() : 0);
        return result;
    }
}
