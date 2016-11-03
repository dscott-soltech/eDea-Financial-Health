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
@Table(name = "Expense: Employment", schema = "public", catalog = "postgres")
public class ExpenseEmployment {
    private int incomeid;
    private int expenseid;
    private String expensename;
    private String expensetype;
    private BigDecimal expenseamount;
    private String expensecategory;
    private Boolean preTaxExpense;
    private Boolean taxdeductible;
    private Date expensedate;
    private Boolean fixed;
    private String expenseperiod;

    @Basic
    @Column(name = "incomeid")
    public int getIncomeid() {
        return incomeid;
    }

    public void setIncomeid(int incomeid) {
        this.incomeid = incomeid;
    }

    @Id
    @Column(name = "expenseid")
    public int getExpenseid() {
        return expenseid;
    }

    public void setExpenseid(int expenseid) {
        this.expenseid = expenseid;
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
    @Column(name = "expenseamount")
    public BigDecimal getExpenseamount() {
        return expenseamount;
    }

    public void setExpenseamount(BigDecimal expenseamount) {
        this.expenseamount = expenseamount;
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
    @Column(name = "Pre-TaxExpense")
    public Boolean getPreTaxExpense() {
        return preTaxExpense;
    }

    public void setPreTaxExpense(Boolean preTaxExpense) {
        this.preTaxExpense = preTaxExpense;
    }

    @Basic
    @Column(name = "taxdeductible")
    public Boolean getTaxdeductible() {
        return taxdeductible;
    }

    public void setTaxdeductible(Boolean taxdeductible) {
        this.taxdeductible = taxdeductible;
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
    @Column(name = "fixed")
    public Boolean getFixed() {
        return fixed;
    }

    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    @Basic
    @Column(name = "expenseperiod")
    public String getExpenseperiod() {
        return expenseperiod;
    }

    public void setExpenseperiod(String expenseperiod) {
        this.expenseperiod = expenseperiod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ExpenseEmployment that = (ExpenseEmployment) o;

        if (incomeid != that.incomeid) {
            return false;
        }
        if (expenseid != that.expenseid) {
            return false;
        }
        if (expensename != null ? !expensename.equals(that.expensename) : that.expensename != null) {
            return false;
        }
        if (expensetype != null ? !expensetype.equals(that.expensetype) : that.expensetype != null) {
            return false;
        }
        if (expenseamount != null ? !expenseamount.equals(that.expenseamount) : that.expenseamount != null) {
            return false;
        }
        if (expensecategory != null ? !expensecategory.equals(that.expensecategory) : that.expensecategory
                != null) {
            return false;
        }
        if (preTaxExpense != null ? !preTaxExpense.equals(that.preTaxExpense) : that.preTaxExpense != null) {
            return false;
        }
        if (taxdeductible != null ? !taxdeductible.equals(that.taxdeductible) : that.taxdeductible != null) {
            return false;
        }
        if (expensedate != null ? !expensedate.equals(that.expensedate) : that.expensedate != null) {
            return false;
        }
        if (fixed != null ? !fixed.equals(that.fixed) : that.fixed != null) {
            return false;
        }
        if (expenseperiod != null ? !expenseperiod.equals(that.expenseperiod) : that.expenseperiod != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = incomeid;
        result = 31 * result + expenseid;
        result = 31 * result + (expensename != null ? expensename.hashCode() : 0);
        result = 31 * result + (expensetype != null ? expensetype.hashCode() : 0);
        result = 31 * result + (expenseamount != null ? expenseamount.hashCode() : 0);
        result = 31 * result + (expensecategory != null ? expensecategory.hashCode() : 0);
        result = 31 * result + (preTaxExpense != null ? preTaxExpense.hashCode() : 0);
        result = 31 * result + (taxdeductible != null ? taxdeductible.hashCode() : 0);
        result = 31 * result + (expensedate != null ? expensedate.hashCode() : 0);
        result = 31 * result + (fixed != null ? fixed.hashCode() : 0);
        result = 31 * result + (expenseperiod != null ? expenseperiod.hashCode() : 0);
        return result;
    }
}
