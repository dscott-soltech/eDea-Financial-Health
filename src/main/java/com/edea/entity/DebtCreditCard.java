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
@Table(name = "Debt: Credit Card", schema = "public", catalog = "postgres")
public class DebtCreditCard {
    private int memberid;
    private int ccid;
    private String providername;
    private String cardtype;
    private String acctnumber;
    private String cardclass;
    private BigDecimal creditlimit;
    private Date dateopen;
    private String acctstatus;
    private Date dateclosed;
    private Integer als;
    private String subscribertype;
    private Date promostartdate;
    private Date promoenddate;
    private Float promoapr;
    private Float standardapr;
    private String onlineurl;
    private String userid;
    private String password;
    private BigDecimal currency;
    private Boolean rewardprogram;
    private String rewardtype;
    private BigDecimal rewardvalue;

    @Basic
    @Column(name = "memberid")
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    @Id
    @Column(name = "ccid")
    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
    }

    @Basic
    @Column(name = "providername")
    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    @Basic
    @Column(name = "cardtype")
    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
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
    @Column(name = "cardclass")
    public String getCardclass() {
        return cardclass;
    }

    public void setCardclass(String cardclass) {
        this.cardclass = cardclass;
    }

    @Basic
    @Column(name = "creditlimit")
    public BigDecimal getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(BigDecimal creditlimit) {
        this.creditlimit = creditlimit;
    }

    @Basic
    @Column(name = "dateopen")
    public Date getDateopen() {
        return dateopen;
    }

    public void setDateopen(Date dateopen) {
        this.dateopen = dateopen;
    }

    @Basic
    @Column(name = "acctstatus")
    public String getAcctstatus() {
        return acctstatus;
    }

    public void setAcctstatus(String acctstatus) {
        this.acctstatus = acctstatus;
    }

    @Basic
    @Column(name = "dateclosed")
    public Date getDateclosed() {
        return dateclosed;
    }

    public void setDateclosed(Date dateclosed) {
        this.dateclosed = dateclosed;
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
    @Column(name = "subscribertype")
    public String getSubscribertype() {
        return subscribertype;
    }

    public void setSubscribertype(String subscribertype) {
        this.subscribertype = subscribertype;
    }

    @Basic
    @Column(name = "promostartdate")
    public Date getPromostartdate() {
        return promostartdate;
    }

    public void setPromostartdate(Date promostartdate) {
        this.promostartdate = promostartdate;
    }

    @Basic
    @Column(name = "promoenddate")
    public Date getPromoenddate() {
        return promoenddate;
    }

    public void setPromoenddate(Date promoenddate) {
        this.promoenddate = promoenddate;
    }

    @Basic
    @Column(name = "promoapr")
    public Float getPromoapr() {
        return promoapr;
    }

    public void setPromoapr(Float promoapr) {
        this.promoapr = promoapr;
    }

    @Basic
    @Column(name = "standardapr")
    public Float getStandardapr() {
        return standardapr;
    }

    public void setStandardapr(Float standardapr) {
        this.standardapr = standardapr;
    }

    @Basic
    @Column(name = "onlineurl")
    public String getOnlineurl() {
        return onlineurl;
    }

    public void setOnlineurl(String onlineurl) {
        this.onlineurl = onlineurl;
    }

    @Basic
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "currency")
    public BigDecimal getCurrency() {
        return currency;
    }

    public void setCurrency(BigDecimal currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "rewardprogram")
    public Boolean getRewardprogram() {
        return rewardprogram;
    }

    public void setRewardprogram(Boolean rewardprogram) {
        this.rewardprogram = rewardprogram;
    }

    @Basic
    @Column(name = "rewardtype")
    public String getRewardtype() {
        return rewardtype;
    }

    public void setRewardtype(String rewardtype) {
        this.rewardtype = rewardtype;
    }

    @Basic
    @Column(name = "rewardvalue")
    public BigDecimal getRewardvalue() {
        return rewardvalue;
    }

    public void setRewardvalue(BigDecimal rewardvalue) {
        this.rewardvalue = rewardvalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DebtCreditCard that = (DebtCreditCard) o;

        if (memberid != that.memberid) {
            return false;
        }
        if (ccid != that.ccid) {
            return false;
        }
        if (providername != null ? !providername.equals(that.providername) : that.providername != null) {
            return false;
        }
        if (cardtype != null ? !cardtype.equals(that.cardtype) : that.cardtype != null) {
            return false;
        }
        if (acctnumber != null ? !acctnumber.equals(that.acctnumber) : that.acctnumber != null) {
            return false;
        }
        if (cardclass != null ? !cardclass.equals(that.cardclass) : that.cardclass != null) {
            return false;
        }
        if (creditlimit != null ? !creditlimit.equals(that.creditlimit) : that.creditlimit != null) {
            return false;
        }
        if (dateopen != null ? !dateopen.equals(that.dateopen) : that.dateopen != null) {
            return false;
        }
        if (acctstatus != null ? !acctstatus.equals(that.acctstatus) : that.acctstatus != null) {
            return false;
        }
        if (dateclosed != null ? !dateclosed.equals(that.dateclosed) : that.dateclosed != null) {
            return false;
        }
        if (als != null ? !als.equals(that.als) : that.als != null) {
            return false;
        }
        if (subscribertype != null ? !subscribertype.equals(that.subscribertype) : that.subscribertype !=
                null) {
            return false;
        }
        if (promostartdate != null ? !promostartdate.equals(that.promostartdate) : that.promostartdate !=
                null) {
            return false;
        }
        if (promoenddate != null ? !promoenddate.equals(that.promoenddate) : that.promoenddate != null) {
            return false;
        }
        if (promoapr != null ? !promoapr.equals(that.promoapr) : that.promoapr != null) {
            return false;
        }
        if (standardapr != null ? !standardapr.equals(that.standardapr) : that.standardapr != null) {
            return false;
        }
        if (onlineurl != null ? !onlineurl.equals(that.onlineurl) : that.onlineurl != null) {
            return false;
        }
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) {
            return false;
        }
        if (password != null ? !password.equals(that.password) : that.password != null) {
            return false;
        }
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) {
            return false;
        }
        if (rewardprogram != null ? !rewardprogram.equals(that.rewardprogram) : that.rewardprogram != null) {
            return false;
        }
        if (rewardtype != null ? !rewardtype.equals(that.rewardtype) : that.rewardtype != null) {
            return false;
        }
        if (rewardvalue != null ? !rewardvalue.equals(that.rewardvalue) : that.rewardvalue != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = memberid;
        result = 31 * result + ccid;
        result = 31 * result + (providername != null ? providername.hashCode() : 0);
        result = 31 * result + (cardtype != null ? cardtype.hashCode() : 0);
        result = 31 * result + (acctnumber != null ? acctnumber.hashCode() : 0);
        result = 31 * result + (cardclass != null ? cardclass.hashCode() : 0);
        result = 31 * result + (creditlimit != null ? creditlimit.hashCode() : 0);
        result = 31 * result + (dateopen != null ? dateopen.hashCode() : 0);
        result = 31 * result + (acctstatus != null ? acctstatus.hashCode() : 0);
        result = 31 * result + (dateclosed != null ? dateclosed.hashCode() : 0);
        result = 31 * result + (als != null ? als.hashCode() : 0);
        result = 31 * result + (subscribertype != null ? subscribertype.hashCode() : 0);
        result = 31 * result + (promostartdate != null ? promostartdate.hashCode() : 0);
        result = 31 * result + (promoenddate != null ? promoenddate.hashCode() : 0);
        result = 31 * result + (promoapr != null ? promoapr.hashCode() : 0);
        result = 31 * result + (standardapr != null ? standardapr.hashCode() : 0);
        result = 31 * result + (onlineurl != null ? onlineurl.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (rewardprogram != null ? rewardprogram.hashCode() : 0);
        result = 31 * result + (rewardtype != null ? rewardtype.hashCode() : 0);
        result = 31 * result + (rewardvalue != null ? rewardvalue.hashCode() : 0);
        return result;
    }
}
