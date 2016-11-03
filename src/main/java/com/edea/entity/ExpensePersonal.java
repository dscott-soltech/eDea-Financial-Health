package com.edea.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by dscott on 11/3/2016.
 */
@Entity
@Table(name = "Expense: Personal", schema = "public", catalog = "postgres")
public class ExpensePersonal {
    private int memberid;
    private int expid;
    private String expensename;
    private String expensetype;
    private Boolean fixed;
    private Date expensestartdate;
    private Date expenseenddate;
    private Integer paymentsourceid;
    private String expensecategory;

    @Basic
    @Column(name = "memberid")
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
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
    @Column(name = "expensename")
    public String getExpensename() {
        return expensename;
    }

    public void setExpensename(String expensename) {
        this.expensename = expensename;
    }

    @Basic
    @Column(name = "expensetype")
    public String getExpensetype() {
        return expensetype;
    }

    public void setExpensetype(String expensetype) {
        this.expensetype = expensetype;
    }

    @Basic
    @Column(name = "fixed")
    public Boolean getFixed() {
        return fixed;
    }

    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    @Basic
    @Column(name = "expensestartdate")
    public Date getExpensestartdate() {
        return expensestartdate;
    }

    public void setExpensestartdate(Date expensestartdate) {
        this.expensestartdate = expensestartdate;
    }

    @Basic
    @Column(name = "expenseenddate")
    public Date getExpenseenddate() {
        return expenseenddate;
    }

    public void setExpenseenddate(Date expenseenddate) {
        this.expenseenddate = expenseenddate;
    }

    @Basic
    @Column(name = "paymentsourceid")
    public Integer getPaymentsourceid() {
        return paymentsourceid;
    }

    public void setPaymentsourceid(Integer paymentsourceid) {
        this.paymentsourceid = paymentsourceid;
    }

    @Basic
    @Column(name = "expensecategory")
    public String getExpensecategory() {
        return expensecategory;
    }

    public void setExpensecategory(String expensecategory) {
        this.expensecategory = expensecategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ExpensePersonal that = (ExpensePersonal) o;

        if (memberid != that.memberid) {
            return false;
        }
        if (expid != that.expid) {
            return false;
        }
        if (expensename != null ? !expensename.equals(that.expensename) : that.expensename != null) {
            return false;
        }
        if (expensetype != null ? !expensetype.equals(that.expensetype) : that.expensetype != null) {
            return false;
        }
        if (fixed != null ? !fixed.equals(that.fixed) : that.fixed != null) {
            return false;
        }
        if (expensestartdate != null ? !expensestartdate.equals(that.expensestartdate) : that
                .expensestartdate != null) {
            return false;
        }
        if (expenseenddate != null ? !expenseenddate.equals(that.expenseenddate) : that.expenseenddate !=
                null) {
            return false;
        }
        if (paymentsourceid != null ? !paymentsourceid.equals(that.paymentsourceid) : that.paymentsourceid
                != null) {
            return false;
        }
        if (expensecategory != null ? !expensecategory.equals(that.expensecategory) : that.expensecategory
                != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = memberid;
        result = 31 * result + expid;
        result = 31 * result + (expensename != null ? expensename.hashCode() : 0);
        result = 31 * result + (expensetype != null ? expensetype.hashCode() : 0);
        result = 31 * result + (fixed != null ? fixed.hashCode() : 0);
        result = 31 * result + (expensestartdate != null ? expensestartdate.hashCode() : 0);
        result = 31 * result + (expenseenddate != null ? expenseenddate.hashCode() : 0);
        result = 31 * result + (paymentsourceid != null ? paymentsourceid.hashCode() : 0);
        result = 31 * result + (expensecategory != null ? expensecategory.hashCode() : 0);
        return result;
    }
}
