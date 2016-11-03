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
@Table(name = "Liquid Asset Expenses", schema = "public", catalog = "postgres")
public class LiquidAssetExpenses {
    private int laid;
    private int laexpid;
    private String expensename;
    private String expenseetype;
    private BigDecimal expenseamount;
    private String expenseperiod;
    private Date expensedate;
    private Boolean fixed;
    private Date expensestartdate;
    private Date expenseenddate;
    private Boolean taxdeductible;

    @Basic
    @Column(name = "laid")
    public int getLaid() {
        return laid;
    }

    public void setLaid(int laid) {
        this.laid = laid;
    }

    @Id
    @Column(name = "laexpid")
    public int getLaexpid() {
        return laexpid;
    }

    public void setLaexpid(int laexpid) {
        this.laexpid = laexpid;
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
    @Column(name = "expenseetype")
    public String getExpenseetype() {
        return expenseetype;
    }

    public void setExpenseetype(String expenseetype) {
        this.expenseetype = expenseetype;
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
    @Column(name = "expenseperiod")
    public String getExpenseperiod() {
        return expenseperiod;
    }

    public void setExpenseperiod(String expenseperiod) {
        this.expenseperiod = expenseperiod;
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
    @Column(name = "taxdeductible")
    public Boolean getTaxdeductible() {
        return taxdeductible;
    }

    public void setTaxdeductible(Boolean taxdeductible) {
        this.taxdeductible = taxdeductible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LiquidAssetExpenses that = (LiquidAssetExpenses) o;

        if (laid != that.laid) {
            return false;
        }
        if (laexpid != that.laexpid) {
            return false;
        }
        if (expensename != null ? !expensename.equals(that.expensename) : that.expensename != null) {
            return false;
        }
        if (expenseetype != null ? !expenseetype.equals(that.expenseetype) : that.expenseetype != null) {
            return false;
        }
        if (expenseamount != null ? !expenseamount.equals(that.expenseamount) : that.expenseamount != null) {
            return false;
        }
        if (expenseperiod != null ? !expenseperiod.equals(that.expenseperiod) : that.expenseperiod != null) {
            return false;
        }
        if (expensedate != null ? !expensedate.equals(that.expensedate) : that.expensedate != null) {
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
        if (taxdeductible != null ? !taxdeductible.equals(that.taxdeductible) : that.taxdeductible != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = laid;
        result = 31 * result + laexpid;
        result = 31 * result + (expensename != null ? expensename.hashCode() : 0);
        result = 31 * result + (expenseetype != null ? expenseetype.hashCode() : 0);
        result = 31 * result + (expenseamount != null ? expenseamount.hashCode() : 0);
        result = 31 * result + (expenseperiod != null ? expenseperiod.hashCode() : 0);
        result = 31 * result + (expensedate != null ? expensedate.hashCode() : 0);
        result = 31 * result + (fixed != null ? fixed.hashCode() : 0);
        result = 31 * result + (expensestartdate != null ? expensestartdate.hashCode() : 0);
        result = 31 * result + (expenseenddate != null ? expenseenddate.hashCode() : 0);
        result = 31 * result + (taxdeductible != null ? taxdeductible.hashCode() : 0);
        return result;
    }
}
