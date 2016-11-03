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
@Table(name = "Expense: Vehicle", schema = "public", catalog = "postgres")
public class ExpenseVehicle {
    private int vehid;
    private int expid;
    private Boolean fixedexpense;
    private String expensecategory;
    private Date expensedate;
    private Integer expenseperiod;
    private Date expensestartdate;
    private Date expenseenddate;

    @Basic
    @Column(name = "vehid")
    public int getVehid() {
        return vehid;
    }

    public void setVehid(int vehid) {
        this.vehid = vehid;
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
    @Column(name = "fixedexpense")
    public Boolean getFixedexpense() {
        return fixedexpense;
    }

    public void setFixedexpense(Boolean fixedexpense) {
        this.fixedexpense = fixedexpense;
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

        ExpenseVehicle that = (ExpenseVehicle) o;

        if (vehid != that.vehid) {
            return false;
        }
        if (expid != that.expid) {
            return false;
        }
        if (fixedexpense != null ? !fixedexpense.equals(that.fixedexpense) : that.fixedexpense != null) {
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
        int result = vehid;
        result = 31 * result + expid;
        result = 31 * result + (fixedexpense != null ? fixedexpense.hashCode() : 0);
        result = 31 * result + (expensecategory != null ? expensecategory.hashCode() : 0);
        result = 31 * result + (expensedate != null ? expensedate.hashCode() : 0);
        result = 31 * result + (expenseperiod != null ? expenseperiod.hashCode() : 0);
        result = 31 * result + (expensestartdate != null ? expensestartdate.hashCode() : 0);
        result = 31 * result + (expenseenddate != null ? expenseenddate.hashCode() : 0);
        return result;
    }
}
