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
@Table(name = "Debt: General", schema = "public", catalog = "postgres")
public class DebtGeneral {
    private int debtid;
    private int memberid;
    private String membertype;
    private String debttype;
    private Date debtopen;
    private Boolean secured;
    private int assetid;
    private BigDecimal openingbalance;
    private BigDecimal currentbalance;
    private Float interestrate;
    private Integer term;
    private String termunit;

    @Id
    @Column(name = "debtid")
    public int getDebtid() {
        return debtid;
    }

    public void setDebtid(int debtid) {
        this.debtid = debtid;
    }

    @Basic
    @Column(name = "memberid")
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    @Basic
    @Column(name = "membertype")
    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    @Basic
    @Column(name = "debttype")
    public String getDebttype() {
        return debttype;
    }

    public void setDebttype(String debttype) {
        this.debttype = debttype;
    }

    @Basic
    @Column(name = "debtopen")
    public Date getDebtopen() {
        return debtopen;
    }

    public void setDebtopen(Date debtopen) {
        this.debtopen = debtopen;
    }

    @Basic
    @Column(name = "secured")
    public Boolean getSecured() {
        return secured;
    }

    public void setSecured(Boolean secured) {
        this.secured = secured;
    }

    @Basic
    @Column(name = "assetid")
    public int getAssetid() {
        return assetid;
    }

    public void setAssetid(int assetid) {
        this.assetid = assetid;
    }

    @Basic
    @Column(name = "openingbalance")
    public BigDecimal getOpeningbalance() {
        return openingbalance;
    }

    public void setOpeningbalance(BigDecimal openingbalance) {
        this.openingbalance = openingbalance;
    }

    @Basic
    @Column(name = "currentbalance")
    public BigDecimal getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(BigDecimal currentbalance) {
        this.currentbalance = currentbalance;
    }

    @Basic
    @Column(name = "interestrate")
    public Float getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(Float interestrate) {
        this.interestrate = interestrate;
    }

    @Basic
    @Column(name = "term")
    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    @Basic
    @Column(name = "termunit")
    public String getTermunit() {
        return termunit;
    }

    public void setTermunit(String termunit) {
        this.termunit = termunit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DebtGeneral that = (DebtGeneral) o;

        if (debtid != that.debtid) {
            return false;
        }
        if (memberid != that.memberid) {
            return false;
        }
        if (assetid != that.assetid) {
            return false;
        }
        if (membertype != null ? !membertype.equals(that.membertype) : that.membertype != null) {
            return false;
        }
        if (debttype != null ? !debttype.equals(that.debttype) : that.debttype != null) {
            return false;
        }
        if (debtopen != null ? !debtopen.equals(that.debtopen) : that.debtopen != null) {
            return false;
        }
        if (secured != null ? !secured.equals(that.secured) : that.secured != null) {
            return false;
        }
        if (openingbalance != null ? !openingbalance.equals(that.openingbalance) : that.openingbalance !=
                null) {
            return false;
        }
        if (currentbalance != null ? !currentbalance.equals(that.currentbalance) : that.currentbalance !=
                null) {
            return false;
        }
        if (interestrate != null ? !interestrate.equals(that.interestrate) : that.interestrate != null) {
            return false;
        }
        if (term != null ? !term.equals(that.term) : that.term != null) {
            return false;
        }
        if (termunit != null ? !termunit.equals(that.termunit) : that.termunit != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = debtid;
        result = 31 * result + memberid;
        result = 31 * result + (membertype != null ? membertype.hashCode() : 0);
        result = 31 * result + (debttype != null ? debttype.hashCode() : 0);
        result = 31 * result + (debtopen != null ? debtopen.hashCode() : 0);
        result = 31 * result + (secured != null ? secured.hashCode() : 0);
        result = 31 * result + assetid;
        result = 31 * result + (openingbalance != null ? openingbalance.hashCode() : 0);
        result = 31 * result + (currentbalance != null ? currentbalance.hashCode() : 0);
        result = 31 * result + (interestrate != null ? interestrate.hashCode() : 0);
        result = 31 * result + (term != null ? term.hashCode() : 0);
        result = 31 * result + (termunit != null ? termunit.hashCode() : 0);
        return result;
    }
}
