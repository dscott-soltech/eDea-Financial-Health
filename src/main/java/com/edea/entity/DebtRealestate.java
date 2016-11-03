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
@Table(name = "Debt: Realestate", schema = "public", catalog = "postgres")
public class DebtRealestate {
    private int reassetid;
    private Integer memberid;
    private int redebtid;
    private String debtor;
    private String redebttype;
    private Date debtopendate;
    private String debtstatus;
    private String currency;
    private BigDecimal openloanamount;
    private String loantype;
    private Float currentinterestrate;
    private Integer loanterm;
    private String loantermperiod;
    private Date debtcloseddate;
    private String adjustablerateindex;
    private Float initialinterestrate;
    private String interestadjustperiod;
    private Float interestadjmax;
    private Date fixedinterestenddate;
    private Float interestrateperiodcap;
    private Boolean conversion;
    private BigDecimal loanoriginationfees;
    private Boolean prepaymentpenalty;
    private Float maxinterestrate;
    private Float mininterestrate;
    private String negativeamortization;
    private BigDecimal latepaymentfee;
    private Integer als;
    private String debttype;

    @Basic
    @Column(name = "reassetid")
    public int getReassetid() {
        return reassetid;
    }

    public void setReassetid(int reassetid) {
        this.reassetid = reassetid;
    }

    @Basic
    @Column(name = "memberid")
    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    @Id
    @Column(name = "redebtid")
    public int getRedebtid() {
        return redebtid;
    }

    public void setRedebtid(int redebtid) {
        this.redebtid = redebtid;
    }

    @Basic
    @Column(name = "debtor")
    public String getDebtor() {
        return debtor;
    }

    public void setDebtor(String debtor) {
        this.debtor = debtor;
    }

    @Basic
    @Column(name = "redebttype")
    public String getRedebttype() {
        return redebttype;
    }

    public void setRedebttype(String redebttype) {
        this.redebttype = redebttype;
    }

    @Basic
    @Column(name = "debtopendate")
    public Date getDebtopendate() {
        return debtopendate;
    }

    public void setDebtopendate(Date debtopendate) {
        this.debtopendate = debtopendate;
    }

    @Basic
    @Column(name = "debtstatus")
    public String getDebtstatus() {
        return debtstatus;
    }

    public void setDebtstatus(String debtstatus) {
        this.debtstatus = debtstatus;
    }

    @Basic
    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "openloanamount")
    public BigDecimal getOpenloanamount() {
        return openloanamount;
    }

    public void setOpenloanamount(BigDecimal openloanamount) {
        this.openloanamount = openloanamount;
    }

    @Basic
    @Column(name = "loantype")
    public String getLoantype() {
        return loantype;
    }

    public void setLoantype(String loantype) {
        this.loantype = loantype;
    }

    @Basic
    @Column(name = "currentinterestrate")
    public Float getCurrentinterestrate() {
        return currentinterestrate;
    }

    public void setCurrentinterestrate(Float currentinterestrate) {
        this.currentinterestrate = currentinterestrate;
    }

    @Basic
    @Column(name = "loanterm")
    public Integer getLoanterm() {
        return loanterm;
    }

    public void setLoanterm(Integer loanterm) {
        this.loanterm = loanterm;
    }

    @Basic
    @Column(name = "loantermperiod")
    public String getLoantermperiod() {
        return loantermperiod;
    }

    public void setLoantermperiod(String loantermperiod) {
        this.loantermperiod = loantermperiod;
    }

    @Basic
    @Column(name = "debtcloseddate")
    public Date getDebtcloseddate() {
        return debtcloseddate;
    }

    public void setDebtcloseddate(Date debtcloseddate) {
        this.debtcloseddate = debtcloseddate;
    }

    @Basic
    @Column(name = "adjustablerateindex")
    public String getAdjustablerateindex() {
        return adjustablerateindex;
    }

    public void setAdjustablerateindex(String adjustablerateindex) {
        this.adjustablerateindex = adjustablerateindex;
    }

    @Basic
    @Column(name = "initialinterestrate")
    public Float getInitialinterestrate() {
        return initialinterestrate;
    }

    public void setInitialinterestrate(Float initialinterestrate) {
        this.initialinterestrate = initialinterestrate;
    }

    @Basic
    @Column(name = "interestadjustperiod")
    public String getInterestadjustperiod() {
        return interestadjustperiod;
    }

    public void setInterestadjustperiod(String interestadjustperiod) {
        this.interestadjustperiod = interestadjustperiod;
    }

    @Basic
    @Column(name = "interestadjmax")
    public Float getInterestadjmax() {
        return interestadjmax;
    }

    public void setInterestadjmax(Float interestadjmax) {
        this.interestadjmax = interestadjmax;
    }

    @Basic
    @Column(name = "fixedinterestenddate")
    public Date getFixedinterestenddate() {
        return fixedinterestenddate;
    }

    public void setFixedinterestenddate(Date fixedinterestenddate) {
        this.fixedinterestenddate = fixedinterestenddate;
    }

    @Basic
    @Column(name = "interestrateperiodcap")
    public Float getInterestrateperiodcap() {
        return interestrateperiodcap;
    }

    public void setInterestrateperiodcap(Float interestrateperiodcap) {
        this.interestrateperiodcap = interestrateperiodcap;
    }

    @Basic
    @Column(name = "conversion")
    public Boolean getConversion() {
        return conversion;
    }

    public void setConversion(Boolean conversion) {
        this.conversion = conversion;
    }

    @Basic
    @Column(name = "loanoriginationfees")
    public BigDecimal getLoanoriginationfees() {
        return loanoriginationfees;
    }

    public void setLoanoriginationfees(BigDecimal loanoriginationfees) {
        this.loanoriginationfees = loanoriginationfees;
    }

    @Basic
    @Column(name = "prepaymentpenalty")
    public Boolean getPrepaymentpenalty() {
        return prepaymentpenalty;
    }

    public void setPrepaymentpenalty(Boolean prepaymentpenalty) {
        this.prepaymentpenalty = prepaymentpenalty;
    }

    @Basic
    @Column(name = "maxinterestrate")
    public Float getMaxinterestrate() {
        return maxinterestrate;
    }

    public void setMaxinterestrate(Float maxinterestrate) {
        this.maxinterestrate = maxinterestrate;
    }

    @Basic
    @Column(name = "mininterestrate")
    public Float getMininterestrate() {
        return mininterestrate;
    }

    public void setMininterestrate(Float mininterestrate) {
        this.mininterestrate = mininterestrate;
    }

    @Basic
    @Column(name = "negativeamortization")
    public String getNegativeamortization() {
        return negativeamortization;
    }

    public void setNegativeamortization(String negativeamortization) {
        this.negativeamortization = negativeamortization;
    }

    @Basic
    @Column(name = "latepaymentfee")
    public BigDecimal getLatepaymentfee() {
        return latepaymentfee;
    }

    public void setLatepaymentfee(BigDecimal latepaymentfee) {
        this.latepaymentfee = latepaymentfee;
    }

    @Basic
    @Column(name = "als")
    public Integer getAls() {
        return als;
    }

    public void setAls(Integer als) {
        this.als = als;
    }

    @Basic
    @Column(name = "debttype")
    public String getDebttype() {
        return debttype;
    }

    public void setDebttype(String debttype) {
        this.debttype = debttype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DebtRealestate that = (DebtRealestate) o;

        if (reassetid != that.reassetid) {
            return false;
        }
        if (redebtid != that.redebtid) {
            return false;
        }
        if (memberid != null ? !memberid.equals(that.memberid) : that.memberid != null) {
            return false;
        }
        if (debtor != null ? !debtor.equals(that.debtor) : that.debtor != null) {
            return false;
        }
        if (redebttype != null ? !redebttype.equals(that.redebttype) : that.redebttype != null) {
            return false;
        }
        if (debtopendate != null ? !debtopendate.equals(that.debtopendate) : that.debtopendate != null) {
            return false;
        }
        if (debtstatus != null ? !debtstatus.equals(that.debtstatus) : that.debtstatus != null) {
            return false;
        }
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) {
            return false;
        }
        if (openloanamount != null ? !openloanamount.equals(that.openloanamount) : that.openloanamount !=
                null) {
            return false;
        }
        if (loantype != null ? !loantype.equals(that.loantype) : that.loantype != null) {
            return false;
        }
        if (currentinterestrate != null ? !currentinterestrate.equals(that.currentinterestrate) : that
                .currentinterestrate != null) {
            return false;
        }
        if (loanterm != null ? !loanterm.equals(that.loanterm) : that.loanterm != null) {
            return false;
        }
        if (loantermperiod != null ? !loantermperiod.equals(that.loantermperiod) : that.loantermperiod !=
                null) {
            return false;
        }
        if (debtcloseddate != null ? !debtcloseddate.equals(that.debtcloseddate) : that.debtcloseddate !=
                null) {
            return false;
        }
        if (adjustablerateindex != null ? !adjustablerateindex.equals(that.adjustablerateindex) : that
                .adjustablerateindex != null) {
            return false;
        }
        if (initialinterestrate != null ? !initialinterestrate.equals(that.initialinterestrate) : that
                .initialinterestrate != null) {
            return false;
        }
        if (interestadjustperiod != null ? !interestadjustperiod.equals(that.interestadjustperiod) : that
                .interestadjustperiod != null) {
            return false;
        }
        if (interestadjmax != null ? !interestadjmax.equals(that.interestadjmax) : that.interestadjmax !=
                null) {
            return false;
        }
        if (fixedinterestenddate != null ? !fixedinterestenddate.equals(that.fixedinterestenddate) : that
                .fixedinterestenddate != null) {
            return false;
        }
        if (interestrateperiodcap != null ? !interestrateperiodcap.equals(that.interestrateperiodcap) :
                that.interestrateperiodcap != null) {
            return false;
        }
        if (conversion != null ? !conversion.equals(that.conversion) : that.conversion != null) {
            return false;
        }
        if (loanoriginationfees != null ? !loanoriginationfees.equals(that.loanoriginationfees) : that
                .loanoriginationfees != null) {
            return false;
        }
        if (prepaymentpenalty != null ? !prepaymentpenalty.equals(that.prepaymentpenalty) : that
                .prepaymentpenalty != null) {
            return false;
        }
        if (maxinterestrate != null ? !maxinterestrate.equals(that.maxinterestrate) : that.maxinterestrate
                != null) {
            return false;
        }
        if (mininterestrate != null ? !mininterestrate.equals(that.mininterestrate) : that.mininterestrate
                != null) {
            return false;
        }
        if (negativeamortization != null ? !negativeamortization.equals(that.negativeamortization) : that
                .negativeamortization != null) {
            return false;
        }
        if (latepaymentfee != null ? !latepaymentfee.equals(that.latepaymentfee) : that.latepaymentfee !=
                null) {
            return false;
        }
        if (als != null ? !als.equals(that.als) : that.als != null) {
            return false;
        }
        if (debttype != null ? !debttype.equals(that.debttype) : that.debttype != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = reassetid;
        result = 31 * result + (memberid != null ? memberid.hashCode() : 0);
        result = 31 * result + redebtid;
        result = 31 * result + (debtor != null ? debtor.hashCode() : 0);
        result = 31 * result + (redebttype != null ? redebttype.hashCode() : 0);
        result = 31 * result + (debtopendate != null ? debtopendate.hashCode() : 0);
        result = 31 * result + (debtstatus != null ? debtstatus.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (openloanamount != null ? openloanamount.hashCode() : 0);
        result = 31 * result + (loantype != null ? loantype.hashCode() : 0);
        result = 31 * result + (currentinterestrate != null ? currentinterestrate.hashCode() : 0);
        result = 31 * result + (loanterm != null ? loanterm.hashCode() : 0);
        result = 31 * result + (loantermperiod != null ? loantermperiod.hashCode() : 0);
        result = 31 * result + (debtcloseddate != null ? debtcloseddate.hashCode() : 0);
        result = 31 * result + (adjustablerateindex != null ? adjustablerateindex.hashCode() : 0);
        result = 31 * result + (initialinterestrate != null ? initialinterestrate.hashCode() : 0);
        result = 31 * result + (interestadjustperiod != null ? interestadjustperiod.hashCode() : 0);
        result = 31 * result + (interestadjmax != null ? interestadjmax.hashCode() : 0);
        result = 31 * result + (fixedinterestenddate != null ? fixedinterestenddate.hashCode() : 0);
        result = 31 * result + (interestrateperiodcap != null ? interestrateperiodcap.hashCode() : 0);
        result = 31 * result + (conversion != null ? conversion.hashCode() : 0);
        result = 31 * result + (loanoriginationfees != null ? loanoriginationfees.hashCode() : 0);
        result = 31 * result + (prepaymentpenalty != null ? prepaymentpenalty.hashCode() : 0);
        result = 31 * result + (maxinterestrate != null ? maxinterestrate.hashCode() : 0);
        result = 31 * result + (mininterestrate != null ? mininterestrate.hashCode() : 0);
        result = 31 * result + (negativeamortization != null ? negativeamortization.hashCode() : 0);
        result = 31 * result + (latepaymentfee != null ? latepaymentfee.hashCode() : 0);
        result = 31 * result + (als != null ? als.hashCode() : 0);
        result = 31 * result + (debttype != null ? debttype.hashCode() : 0);
        return result;
    }
}
