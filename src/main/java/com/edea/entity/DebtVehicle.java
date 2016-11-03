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
@Table(name = "Debt: Vehicle", schema = "public", catalog = "postgres")
public class DebtVehicle {
    private int vehid;
    private Integer debtid;
    private String debtor;
    private String acctnumber;
    private Date debtstartdate;
    private String loanterm;
    private String loantermperiod;
    private Float loaninterestrate;
    private BigDecimal latepaymentfee;
    private BigDecimal paymentamount;
    private String paymentperiod;
    private BigDecimal balance;
    private Date balancedate;
    private Integer als;
    private String debttype;

    @Column(name = "vehid")
    public int getVehid() {
        return vehid;
    }

    public void setVehid(int vehid) {
        this.vehid = vehid;
    }

    @Id
    @Column(name = "debtid")
    public Integer getDebtid() {
        return debtid;
    }

    public void setDebtid(Integer debtid) {
        this.debtid = debtid;
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
    @Column(name = "acctnumber")
    public String getAcctnumber() {
        return acctnumber;
    }

    public void setAcctnumber(String acctnumber) {
        this.acctnumber = acctnumber;
    }

    @Basic
    @Column(name = "debtstartdate")
    public Date getDebtstartdate() {
        return debtstartdate;
    }

    public void setDebtstartdate(Date debtstartdate) {
        this.debtstartdate = debtstartdate;
    }

    @Basic
    @Column(name = "loanterm")
    public String getLoanterm() {
        return loanterm;
    }

    public void setLoanterm(String loanterm) {
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
    @Column(name = "loaninterestrate")
    public Float getLoaninterestrate() {
        return loaninterestrate;
    }

    public void setLoaninterestrate(Float loaninterestrate) {
        this.loaninterestrate = loaninterestrate;
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
    @Column(name = "paymentamount")
    public BigDecimal getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(BigDecimal paymentamount) {
        this.paymentamount = paymentamount;
    }

    @Basic
    @Column(name = "paymentperiod")
    public String getPaymentperiod() {
        return paymentperiod;
    }

    public void setPaymentperiod(String paymentperiod) {
        this.paymentperiod = paymentperiod;
    }

    @Basic
    @Column(name = "balance")
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "balancedate")
    public Date getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
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

        DebtVehicle that = (DebtVehicle) o;

        if (vehid != that.vehid) {
            return false;
        }
        if (debtid != null ? !debtid.equals(that.debtid) : that.debtid != null) {
            return false;
        }
        if (debtor != null ? !debtor.equals(that.debtor) : that.debtor != null) {
            return false;
        }
        if (acctnumber != null ? !acctnumber.equals(that.acctnumber) : that.acctnumber != null) {
            return false;
        }
        if (debtstartdate != null ? !debtstartdate.equals(that.debtstartdate) : that.debtstartdate != null) {
            return false;
        }
        if (loanterm != null ? !loanterm.equals(that.loanterm) : that.loanterm != null) {
            return false;
        }
        if (loantermperiod != null ? !loantermperiod.equals(that.loantermperiod) : that.loantermperiod !=
                null) {
            return false;
        }
        if (loaninterestrate != null ? !loaninterestrate.equals(that.loaninterestrate) : that
                .loaninterestrate != null) {
            return false;
        }
        if (latepaymentfee != null ? !latepaymentfee.equals(that.latepaymentfee) : that.latepaymentfee !=
                null) {
            return false;
        }
        if (paymentamount != null ? !paymentamount.equals(that.paymentamount) : that.paymentamount != null) {
            return false;
        }
        if (paymentperiod != null ? !paymentperiod.equals(that.paymentperiod) : that.paymentperiod != null) {
            return false;
        }
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) {
            return false;
        }
        if (balancedate != null ? !balancedate.equals(that.balancedate) : that.balancedate != null) {
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
        int result = vehid;
        result = 31 * result + (debtid != null ? debtid.hashCode() : 0);
        result = 31 * result + (debtor != null ? debtor.hashCode() : 0);
        result = 31 * result + (acctnumber != null ? acctnumber.hashCode() : 0);
        result = 31 * result + (debtstartdate != null ? debtstartdate.hashCode() : 0);
        result = 31 * result + (loanterm != null ? loanterm.hashCode() : 0);
        result = 31 * result + (loantermperiod != null ? loantermperiod.hashCode() : 0);
        result = 31 * result + (loaninterestrate != null ? loaninterestrate.hashCode() : 0);
        result = 31 * result + (latepaymentfee != null ? latepaymentfee.hashCode() : 0);
        result = 31 * result + (paymentamount != null ? paymentamount.hashCode() : 0);
        result = 31 * result + (paymentperiod != null ? paymentperiod.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (balancedate != null ? balancedate.hashCode() : 0);
        result = 31 * result + (als != null ? als.hashCode() : 0);
        result = 31 * result + (debttype != null ? debttype.hashCode() : 0);
        return result;
    }
}
