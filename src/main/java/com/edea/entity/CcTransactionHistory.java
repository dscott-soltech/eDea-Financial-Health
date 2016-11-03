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
@Table(name = "CC Transaction History", schema = "public", catalog = "postgres")
public class CcTransactionHistory {
    private int ccid;
    private int transactionid;
    private Date transactiondate;
    private BigDecimal transactionamount;
    private String transactionpayee;
    private String transactioncategory;
    private Boolean splittransaction;

    @Basic
    @Column(name = "ccid")
    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
    }

    @Id
    @Column(name = "transactionid")
    public int getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }

    @Basic
    @Column(name = "transactiondate")
    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    @Basic
    @Column(name = "transactionamount")
    public BigDecimal getTransactionamount() {
        return transactionamount;
    }

    public void setTransactionamount(BigDecimal transactionamount) {
        this.transactionamount = transactionamount;
    }

    @Basic
    @Column(name = "transactionpayee")
    public String getTransactionpayee() {
        return transactionpayee;
    }

    public void setTransactionpayee(String transactionpayee) {
        this.transactionpayee = transactionpayee;
    }

    @Basic
    @Column(name = "transactioncategory")
    public String getTransactioncategory() {
        return transactioncategory;
    }

    public void setTransactioncategory(String transactioncategory) {
        this.transactioncategory = transactioncategory;
    }

    @Basic
    @Column(name = "splittransaction")
    public Boolean getSplittransaction() {
        return splittransaction;
    }

    public void setSplittransaction(Boolean splittransaction) {
        this.splittransaction = splittransaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CcTransactionHistory that = (CcTransactionHistory) o;

        if (ccid != that.ccid) {
            return false;
        }
        if (transactionid != that.transactionid) {
            return false;
        }
        if (transactiondate != null ? !transactiondate.equals(that.transactiondate) : that.transactiondate
                != null) {
            return false;
        }
        if (transactionamount != null ? !transactionamount.equals(that.transactionamount) : that
                .transactionamount != null) {
            return false;
        }
        if (transactionpayee != null ? !transactionpayee.equals(that.transactionpayee) : that
                .transactionpayee != null) {
            return false;
        }
        if (transactioncategory != null ? !transactioncategory.equals(that.transactioncategory) : that
                .transactioncategory != null) {
            return false;
        }
        if (splittransaction != null ? !splittransaction.equals(that.splittransaction) : that
                .splittransaction != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = ccid;
        result = 31 * result + transactionid;
        result = 31 * result + (transactiondate != null ? transactiondate.hashCode() : 0);
        result = 31 * result + (transactionamount != null ? transactionamount.hashCode() : 0);
        result = 31 * result + (transactionpayee != null ? transactionpayee.hashCode() : 0);
        result = 31 * result + (transactioncategory != null ? transactioncategory.hashCode() : 0);
        result = 31 * result + (splittransaction != null ? splittransaction.hashCode() : 0);
        return result;
    }
}
