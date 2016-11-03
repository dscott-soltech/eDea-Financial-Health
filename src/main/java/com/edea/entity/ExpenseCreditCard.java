package com.edea.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by dscott on 11/3/2016.
 */
@Entity
@Table(name = "Expense: Credit Card", schema = "public", catalog = "postgres")
public class ExpenseCreditCard {
    private int ccid;
    private int expid;
    private BigDecimal servicefee;
    private String servicefeeperiod;
    private BigDecimal latepaymentfee;

    @Basic
    @Column(name = "ccid")
    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
    }

    @Id
    @Column(name = "expid")
    public int getExpid() {
        return expid;
    }

    public void setExpid(int expid) {
        this.expid = expid;
    }

    @Basic
    @Column(name = "servicefee")
    public BigDecimal getServicefee() {
        return servicefee;
    }

    public void setServicefee(BigDecimal servicefee) {
        this.servicefee = servicefee;
    }

    @Basic
    @Column(name = "servicefeeperiod")
    public String getServicefeeperiod() {
        return servicefeeperiod;
    }

    public void setServicefeeperiod(String servicefeeperiod) {
        this.servicefeeperiod = servicefeeperiod;
    }

    @Basic
    @Column(name = "latepaymentfee")
    public BigDecimal getLatepaymentfee() {
        return latepaymentfee;
    }

    public void setLatepaymentfee(BigDecimal latepaymentfee) {
        this.latepaymentfee = latepaymentfee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ExpenseCreditCard that = (ExpenseCreditCard) o;

        if (ccid != that.ccid) {
            return false;
        }
        if (expid != that.expid) {
            return false;
        }
        if (servicefee != null ? !servicefee.equals(that.servicefee) : that.servicefee != null) {
            return false;
        }
        if (servicefeeperiod != null ? !servicefeeperiod.equals(that.servicefeeperiod) : that
                .servicefeeperiod != null) {
            return false;
        }
        if (latepaymentfee != null ? !latepaymentfee.equals(that.latepaymentfee) : that.latepaymentfee !=
                null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = ccid;
        result = 31 * result + expid;
        result = 31 * result + (servicefee != null ? servicefee.hashCode() : 0);
        result = 31 * result + (servicefeeperiod != null ? servicefeeperiod.hashCode() : 0);
        result = 31 * result + (latepaymentfee != null ? latepaymentfee.hashCode() : 0);
        return result;
    }
}
