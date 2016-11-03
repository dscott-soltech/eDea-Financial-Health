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
@Table(name = "Liquid Asset Transaction History", schema = "public", catalog = "postgres")
public class LiquidAssetTransactionHistory {
    private String transactionsource;
    private int transactionsourceid;
    private int transactionid;
    private String transactiontype;
    private BigDecimal transactionamount;
    private Date transactiondate;
    private String transactioncategory;

    @Basic
    @Column(name = "transactionsource")
    public String getTransactionsource() {
        return transactionsource;
    }

    public void setTransactionsource(String transactionsource) {
        this.transactionsource = transactionsource;
    }

    @Basic
    @Column(name = "transactionsourceid")
    public int getTransactionsourceid() {
        return transactionsourceid;
    }

    public void setTransactionsourceid(int transactionsourceid) {
        this.transactionsourceid = transactionsourceid;
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
    @Column(name = "transactiontype")
    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
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
    @Column(name = "transactiondate")
    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    @Basic
    @Column(name = "transactioncategory")
    public String getTransactioncategory() {
        return transactioncategory;
    }

    public void setTransactioncategory(String transactioncategory) {
        this.transactioncategory = transactioncategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LiquidAssetTransactionHistory that = (LiquidAssetTransactionHistory) o;

        if (transactionsourceid != that.transactionsourceid) {
            return false;
        }
        if (transactionid != that.transactionid) {
            return false;
        }
        if (transactionsource != null ? !transactionsource.equals(that.transactionsource) : that
                .transactionsource != null) {
            return false;
        }
        if (transactiontype != null ? !transactiontype.equals(that.transactiontype) : that.transactiontype
                != null) {
            return false;
        }
        if (transactionamount != null ? !transactionamount.equals(that.transactionamount) : that
                .transactionamount != null) {
            return false;
        }
        if (transactiondate != null ? !transactiondate.equals(that.transactiondate) : that.transactiondate
                != null) {
            return false;
        }
        if (transactioncategory != null ? !transactioncategory.equals(that.transactioncategory) : that
                .transactioncategory != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = transactionsource != null ? transactionsource.hashCode() : 0;
        result = 31 * result + transactionsourceid;
        result = 31 * result + transactionid;
        result = 31 * result + (transactiontype != null ? transactiontype.hashCode() : 0);
        result = 31 * result + (transactionamount != null ? transactionamount.hashCode() : 0);
        result = 31 * result + (transactiondate != null ? transactiondate.hashCode() : 0);
        result = 31 * result + (transactioncategory != null ? transactioncategory.hashCode() : 0);
        return result;
    }
}
