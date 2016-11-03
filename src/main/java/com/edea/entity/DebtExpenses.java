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
@Table(name = "Debt: Expenses", schema = "public", catalog = "postgres")
public class DebtExpenses {
    private int debtexpid;
    private int debtid;
    private String expensename;
    private String expensetype;
    private BigDecimal expenseamount;
    private String expensefrequency;
    private Date expensedate;
    private Boolean recurring;
    private Boolean taxdeductible;
    private Integer expenseperiod;
    private Date expensestartdate;
    private Date expenseenddate;

    @Id
    @Column(name = "debtexpid")
    public int getDebtexpid() {
        return debtexpid;
    }

    public void setDebtexpid(int debtexpid) {
        this.debtexpid = debtexpid;
    }

    @Basic
    @Column(name = "debtid")
    public int getDebtid() {
        return debtid;
    }

    public void setDebtid(int debtid) {
        this.debtid = debtid;
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
    @Column(name = "expensefrequency")
    public String getExpensefrequency() {
        return expensefrequency;
    }

    public void setExpensefrequency(String expensefrequency) {
        this.expensefrequency = expensefrequency;
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
    @Column(name = "recurring")
    public Boolean getRecurring() {
        return recurring;
    }

    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
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
    @Column(name = "expenseperiod")
    public Integer getExpenseperiod() {
        return expenseperiod;
    }

    public void setExpenseperiod(Integer expenseperiod) {
        this.expenseperiod = expenseperiod;
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

        DebtExpenses that = (DebtExpenses) o;

        if (debtexpid != that.debtexpid) {
            return false;
        }
        if (debtid != that.debtid) {
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
        if (expensefrequency != null ? !expensefrequency.equals(that.expensefrequency) : that
                .expensefrequency != null) {
            return false;
        }
        if (expensedate != null ? !expensedate.equals(that.expensedate) : that.expensedate != null) {
            return false;
        }
        if (recurring != null ? !recurring.equals(that.recurring) : that.recurring != null) {
            return false;
        }
        if (taxdeductible != null ? !taxdeductible.equals(that.taxdeductible) : that.taxdeductible != null) {
            return false;
        }
        if (expenseperiod != null ? !expenseperiod.equals(that.expenseperiod) : that.expenseperiod != null) {
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
        int result = debtexpid;
        result = 31 * result + debtid;
        result = 31 * result + (expensename != null ? expensename.hashCode() : 0);
        result = 31 * result + (expensetype != null ? expensetype.hashCode() : 0);
        result = 31 * result + (expenseamount != null ? expenseamount.hashCode() : 0);
        result = 31 * result + (expensefrequency != null ? expensefrequency.hashCode() : 0);
        result = 31 * result + (expensedate != null ? expensedate.hashCode() : 0);
        result = 31 * result + (recurring != null ? recurring.hashCode() : 0);
        result = 31 * result + (taxdeductible != null ? taxdeductible.hashCode() : 0);
        result = 31 * result + (expenseperiod != null ? expenseperiod.hashCode() : 0);
        result = 31 * result + (expensestartdate != null ? expensestartdate.hashCode() : 0);
        result = 31 * result + (expenseenddate != null ? expenseenddate.hashCode() : 0);
        return result;
    }
}
