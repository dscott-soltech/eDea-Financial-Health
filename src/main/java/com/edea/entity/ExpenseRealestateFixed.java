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
@Table(name = "Expense: Realestate Fixed", schema = "public", catalog = "postgres")
public class ExpenseRealestateFixed {
    private int reassetid;
    private int reexpid;
    private Boolean fixedexpense;
    private String expensepayee;
    private String expensecategory;
    private Date expensedate;
    private Integer expenseperiod;
    private Boolean taxdeductable;
    private BigDecimal expenseamount;
    private Date expensestartdate;
    private Date expenseenddate;

    @Basic
    @Column(name = "reassetid")
    public int getReassetid() {
        return reassetid;
    }

    public void setReassetid(int reassetid) {
        this.reassetid = reassetid;
    }

    @Id
    @Column(name = "reexpid")
    public int getReexpid() {
        return reexpid;
    }

    public void setReexpid(int reexpid) {
        this.reexpid = reexpid;
    }

    @Basic
    @Column(name = "fixedexpense")
    public Boolean getFixedexpense() {
        return fixedexpense;
    }

    public void setFixedexpense(Boolean fixedexpense) {
        this.fixedexpense = fixedexpense;
    }

    @Basic
    @Column(name = "expensepayee")
    public String getExpensepayee() {
        return expensepayee;
    }

    public void setExpensepayee(String expensepayee) {
        this.expensepayee = expensepayee;
    }

    @Basic
    @Column(name = "expensecategory")
    public String getExpensecategory() {
        return expensecategory;
    }

    public void setExpensecategory(String expensecategory) {
        this.expensecategory = expensecategory;
    }

    @Basic
    @Column(name = "expensedate")
    public Date getExpensedate() {
        return expensedate;
    }

    public void setExpensedate(Date expensedate) {
        this.expensedate = expensedate;
    }

    @Basic
    @Column(name = "expenseperiod")
    public Integer getExpenseperiod() {
        return expenseperiod;
    }

    public void setExpenseperiod(Integer expenseperiod) {
        this.expenseperiod = expenseperiod;
    }

    @Basic
    @Column(name = "taxdeductable")
    public Boolean getTaxdeductable() {
        return taxdeductable;
    }

    public void setTaxdeductable(Boolean taxdeductable) {
        this.taxdeductable = taxdeductable;
    }

    @Basic
    @Column(name = "expenseamount")
    public BigDecimal getExpenseamount() {
        return expenseamount;
    }

    public void setExpenseamount(BigDecimal expenseamount) {
        this.expenseamount = expenseamount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ExpenseRealestateFixed that = (ExpenseRealestateFixed) o;

        if (reassetid != that.reassetid) {
            return false;
        }
        if (reexpid != that.reexpid) {
            return false;
        }
        if (fixedexpense != null ? !fixedexpense.equals(that.fixedexpense) : that.fixedexpense != null) {
            return false;
        }
        if (expensepayee != null ? !expensepayee.equals(that.expensepayee) : that.expensepayee != null) {
            return false;
        }
        if (expensecategory != null ? !expensecategory.equals(that.expensecategory) : that.expensecategory
                != null) {
            return false;
        }
        if (expensedate != null ? !expensedate.equals(that.expensedate) : that.expensedate != null) {
            return false;
        }
        if (expenseperiod != null ? !expenseperiod.equals(that.expenseperiod) : that.expenseperiod != null) {
            return false;
        }
        if (taxdeductable != null ? !taxdeductable.equals(that.taxdeductable) : that.taxdeductable != null) {
            return false;
        }
        if (expenseamount != null ? !expenseamount.equals(that.expenseamount) : that.expenseamount != null) {
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = reassetid;
        result = 31 * result + reexpid;
        result = 31 * result + (fixedexpense != null ? fixedexpense.hashCode() : 0);
        result = 31 * result + (expensepayee != null ? expensepayee.hashCode() : 0);
        result = 31 * result + (expensecategory != null ? expensecategory.hashCode() : 0);
        result = 31 * result + (expensedate != null ? expensedate.hashCode() : 0);
        result = 31 * result + (expenseperiod != null ? expenseperiod.hashCode() : 0);
        result = 31 * result + (taxdeductable != null ? taxdeductable.hashCode() : 0);
        result = 31 * result + (expenseamount != null ? expenseamount.hashCode() : 0);
        result = 31 * result + (expensestartdate != null ? expensestartdate.hashCode() : 0);
        result = 31 * result + (expenseenddate != null ? expenseenddate.hashCode() : 0);
        return result;
    }
}
