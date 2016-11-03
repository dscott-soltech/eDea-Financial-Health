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
@Table(name = "Employment Income History", schema = "public", catalog = "postgres")
public class EmploymentIncomeHistory {
    private int incid;
    private int pymtid;
    private BigDecimal pymtdate;
    private String pymtamount;
    private String pymtaccount;
    private String pymtaccountid;
    private String pymtunits;
    private BigDecimal totalperiodunits;

    @Basic
    @Column(name = "incid")
    public int getIncid() {
        return incid;
    }

    public void setIncid(int incid) {
        this.incid = incid;
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
    public BigDecimal getPymtdate() {
        return pymtdate;
    }

    public void setPymtdate(BigDecimal pymtdate) {
        this.pymtdate = pymtdate;
    }

    @Basic
    @Column(name = "pymtamount")
    public String getPymtamount() {
        return pymtamount;
    }

    public void setPymtamount(String pymtamount) {
        this.pymtamount = pymtamount;
    }

    @Basic
    @Column(name = "pymtaccount")
    public String getPymtaccount() {
        return pymtaccount;
    }

    public void setPymtaccount(String pymtaccount) {
        this.pymtaccount = pymtaccount;
    }

    @Basic
    @Column(name = "pymtaccountid")
    public String getPymtaccountid() {
        return pymtaccountid;
    }

    public void setPymtaccountid(String pymtaccountid) {
        this.pymtaccountid = pymtaccountid;
    }

    @Basic
    @Column(name = "pymtunits")
    public String getPymtunits() {
        return pymtunits;
    }

    public void setPymtunits(String pymtunits) {
        this.pymtunits = pymtunits;
    }

    @Basic
    @Column(name = "totalperiodunits")
    public BigDecimal getTotalperiodunits() {
        return totalperiodunits;
    }

    public void setTotalperiodunits(BigDecimal totalperiodunits) {
        this.totalperiodunits = totalperiodunits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EmploymentIncomeHistory that = (EmploymentIncomeHistory) o;

        if (incid != that.incid) {
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
        if (pymtaccount != null ? !pymtaccount.equals(that.pymtaccount) : that.pymtaccount != null) {
            return false;
        }
        if (pymtaccountid != null ? !pymtaccountid.equals(that.pymtaccountid) : that.pymtaccountid != null) {
            return false;
        }
        if (pymtunits != null ? !pymtunits.equals(that.pymtunits) : that.pymtunits != null) {
            return false;
        }
        if (totalperiodunits != null ? !totalperiodunits.equals(that.totalperiodunits) : that
                .totalperiodunits != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = incid;
        result = 31 * result + pymtid;
        result = 31 * result + (pymtdate != null ? pymtdate.hashCode() : 0);
        result = 31 * result + (pymtamount != null ? pymtamount.hashCode() : 0);
        result = 31 * result + (pymtaccount != null ? pymtaccount.hashCode() : 0);
        result = 31 * result + (pymtaccountid != null ? pymtaccountid.hashCode() : 0);
        result = 31 * result + (pymtunits != null ? pymtunits.hashCode() : 0);
        result = 31 * result + (totalperiodunits != null ? totalperiodunits.hashCode() : 0);
        return result;
    }
}
