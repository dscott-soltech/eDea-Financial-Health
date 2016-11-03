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
@Table(name = "Asset: Liquid", schema = "public", catalog = "postgres")
public class AssetLiquid {
    private int lassetid;
    private String assetname;
    private String accountnumber;
    private String accounttype;
    private Integer memberid;
    private Float memberpct;
    private Date assetopendate;
    private BigDecimal assetopenamount;
    private String fundssource;
    private Integer fundssourceid;
    private BigDecimal marketvalue;
    private Date marketvaluedate;
    private Float interestrate;
    private BigDecimal fee;
    private String feeperiod;
    private String accountstatus;
    private String penaltyamount;
    private Boolean retirementaccount;
    private Boolean taxdeferred;
    private Boolean taxexempt;
    private String currency;
    private String institution;
    private String accountcountry;

    @Id
    @Column(name = "lassetid")
    public int getLassetid() {
        return lassetid;
    }

    public void setLassetid(int lassetid) {
        this.lassetid = lassetid;
    }

    @Basic
    @Column(name = "assetname")
    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    @Basic
    @Column(name = "accountnumber")
    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Basic
    @Column(name = "accounttype")
    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    @Basic
    @Column(name = "memberid")
    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    @Basic
    @Column(name = "memberpct")
    public Float getMemberpct() {
        return memberpct;
    }

    public void setMemberpct(Float memberpct) {
        this.memberpct = memberpct;
    }

    @Basic
    @Column(name = "assetopendate")
    public Date getAssetopendate() {
        return assetopendate;
    }

    public void setAssetopendate(Date assetopendate) {
        this.assetopendate = assetopendate;
    }

    @Basic
    @Column(name = "assetopenamount")
    public BigDecimal getAssetopenamount() {
        return assetopenamount;
    }

    public void setAssetopenamount(BigDecimal assetopenamount) {
        this.assetopenamount = assetopenamount;
    }

    @Basic
    @Column(name = "fundssource")
    public String getFundssource() {
        return fundssource;
    }

    public void setFundssource(String fundssource) {
        this.fundssource = fundssource;
    }

    @Basic
    @Column(name = "fundssourceid")
    public Integer getFundssourceid() {
        return fundssourceid;
    }

    public void setFundssourceid(Integer fundssourceid) {
        this.fundssourceid = fundssourceid;
    }

    @Basic
    @Column(name = "marketvalue")
    public BigDecimal getMarketvalue() {
        return marketvalue;
    }

    public void setMarketvalue(BigDecimal marketvalue) {
        this.marketvalue = marketvalue;
    }

    @Basic
    @Column(name = "marketvaluedate")
    public Date getMarketvaluedate() {
        return marketvaluedate;
    }

    public void setMarketvaluedate(Date marketvaluedate) {
        this.marketvaluedate = marketvaluedate;
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
    @Column(name = "fee")
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Basic
    @Column(name = "feeperiod")
    public String getFeeperiod() {
        return feeperiod;
    }

    public void setFeeperiod(String feeperiod) {
        this.feeperiod = feeperiod;
    }

    @Basic
    @Column(name = "accountstatus")
    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    @Basic
    @Column(name = "penaltyamount")
    public String getPenaltyamount() {
        return penaltyamount;
    }

    public void setPenaltyamount(String penaltyamount) {
        this.penaltyamount = penaltyamount;
    }

    @Basic
    @Column(name = "retirementaccount")
    public Boolean getRetirementaccount() {
        return retirementaccount;
    }

    public void setRetirementaccount(Boolean retirementaccount) {
        this.retirementaccount = retirementaccount;
    }

    @Basic
    @Column(name = "taxdeferred")
    public Boolean getTaxdeferred() {
        return taxdeferred;
    }

    public void setTaxdeferred(Boolean taxdeferred) {
        this.taxdeferred = taxdeferred;
    }

    @Basic
    @Column(name = "taxexempt")
    public Boolean getTaxexempt() {
        return taxexempt;
    }

    public void setTaxexempt(Boolean taxexempt) {
        this.taxexempt = taxexempt;
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
    @Column(name = "institution")
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Basic
    @Column(name = "accountcountry")
    public String getAccountcountry() {
        return accountcountry;
    }

    public void setAccountcountry(String accountcountry) {
        this.accountcountry = accountcountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AssetLiquid that = (AssetLiquid) o;

        if (lassetid != that.lassetid) {
            return false;
        }
        if (assetname != null ? !assetname.equals(that.assetname) : that.assetname != null) {
            return false;
        }
        if (accountnumber != null ? !accountnumber.equals(that.accountnumber) : that.accountnumber != null) {
            return false;
        }
        if (accounttype != null ? !accounttype.equals(that.accounttype) : that.accounttype != null) {
            return false;
        }
        if (memberid != null ? !memberid.equals(that.memberid) : that.memberid != null) {
            return false;
        }
        if (memberpct != null ? !memberpct.equals(that.memberpct) : that.memberpct != null) {
            return false;
        }
        if (assetopendate != null ? !assetopendate.equals(that.assetopendate) : that.assetopendate != null) {
            return false;
        }
        if (assetopenamount != null ? !assetopenamount.equals(that.assetopenamount) : that.assetopenamount
                != null) {
            return false;
        }
        if (fundssource != null ? !fundssource.equals(that.fundssource) : that.fundssource != null) {
            return false;
        }
        if (fundssourceid != null ? !fundssourceid.equals(that.fundssourceid) : that.fundssourceid != null) {
            return false;
        }
        if (marketvalue != null ? !marketvalue.equals(that.marketvalue) : that.marketvalue != null) {
            return false;
        }
        if (marketvaluedate != null ? !marketvaluedate.equals(that.marketvaluedate) : that.marketvaluedate
                != null) {
            return false;
        }
        if (interestrate != null ? !interestrate.equals(that.interestrate) : that.interestrate != null) {
            return false;
        }
        if (fee != null ? !fee.equals(that.fee) : that.fee != null) {
            return false;
        }
        if (feeperiod != null ? !feeperiod.equals(that.feeperiod) : that.feeperiod != null) {
            return false;
        }
        if (accountstatus != null ? !accountstatus.equals(that.accountstatus) : that.accountstatus != null) {
            return false;
        }
        if (penaltyamount != null ? !penaltyamount.equals(that.penaltyamount) : that.penaltyamount != null) {
            return false;
        }
        if (retirementaccount != null ? !retirementaccount.equals(that.retirementaccount) : that
                .retirementaccount != null) {
            return false;
        }
        if (taxdeferred != null ? !taxdeferred.equals(that.taxdeferred) : that.taxdeferred != null) {
            return false;
        }
        if (taxexempt != null ? !taxexempt.equals(that.taxexempt) : that.taxexempt != null) {
            return false;
        }
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) {
            return false;
        }
        if (institution != null ? !institution.equals(that.institution) : that.institution != null) {
            return false;
        }
        if (accountcountry != null ? !accountcountry.equals(that.accountcountry) : that.accountcountry !=
                null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = lassetid;
        result = 31 * result + (assetname != null ? assetname.hashCode() : 0);
        result = 31 * result + (accountnumber != null ? accountnumber.hashCode() : 0);
        result = 31 * result + (accounttype != null ? accounttype.hashCode() : 0);
        result = 31 * result + (memberid != null ? memberid.hashCode() : 0);
        result = 31 * result + (memberpct != null ? memberpct.hashCode() : 0);
        result = 31 * result + (assetopendate != null ? assetopendate.hashCode() : 0);
        result = 31 * result + (assetopenamount != null ? assetopenamount.hashCode() : 0);
        result = 31 * result + (fundssource != null ? fundssource.hashCode() : 0);
        result = 31 * result + (fundssourceid != null ? fundssourceid.hashCode() : 0);
        result = 31 * result + (marketvalue != null ? marketvalue.hashCode() : 0);
        result = 31 * result + (marketvaluedate != null ? marketvaluedate.hashCode() : 0);
        result = 31 * result + (interestrate != null ? interestrate.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        result = 31 * result + (feeperiod != null ? feeperiod.hashCode() : 0);
        result = 31 * result + (accountstatus != null ? accountstatus.hashCode() : 0);
        result = 31 * result + (penaltyamount != null ? penaltyamount.hashCode() : 0);
        result = 31 * result + (retirementaccount != null ? retirementaccount.hashCode() : 0);
        result = 31 * result + (taxdeferred != null ? taxdeferred.hashCode() : 0);
        result = 31 * result + (taxexempt != null ? taxexempt.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (institution != null ? institution.hashCode() : 0);
        result = 31 * result + (accountcountry != null ? accountcountry.hashCode() : 0);
        return result;
    }
}
