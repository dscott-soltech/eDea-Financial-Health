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
@Table(name = "Asset: Non-liquid", schema = "public", catalog = "postgres")
public class AssetNonLiquid {
    private int nlassetid;
    private int memberid;
    private Float memberownershippct;
    private String assetname;
    private String assettype;
    private BigDecimal marketvalue;
    private Date marketvaluedate;

    @Id
    @Column(name = "nlassetid")
    public int getNlassetid() {
        return nlassetid;
    }

    public void setNlassetid(int nlassetid) {
        this.nlassetid = nlassetid;
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
    @Column(name = "memberownershippct")
    public Float getMemberownershippct() {
        return memberownershippct;
    }

    public void setMemberownershippct(Float memberownershippct) {
        this.memberownershippct = memberownershippct;
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
    @Column(name = "assettype")
    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AssetNonLiquid that = (AssetNonLiquid) o;

        if (nlassetid != that.nlassetid) {
            return false;
        }
        if (memberid != that.memberid) {
            return false;
        }
        if (memberownershippct != null ? !memberownershippct.equals(that.memberownershippct) : that
                .memberownershippct != null) {
            return false;
        }
        if (assetname != null ? !assetname.equals(that.assetname) : that.assetname != null) {
            return false;
        }
        if (assettype != null ? !assettype.equals(that.assettype) : that.assettype != null) {
            return false;
        }
        if (marketvalue != null ? !marketvalue.equals(that.marketvalue) : that.marketvalue != null) {
            return false;
        }
        if (marketvaluedate != null ? !marketvaluedate.equals(that.marketvaluedate) : that.marketvaluedate
                != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = nlassetid;
        result = 31 * result + memberid;
        result = 31 * result + (memberownershippct != null ? memberownershippct.hashCode() : 0);
        result = 31 * result + (assetname != null ? assetname.hashCode() : 0);
        result = 31 * result + (assettype != null ? assettype.hashCode() : 0);
        result = 31 * result + (marketvalue != null ? marketvalue.hashCode() : 0);
        result = 31 * result + (marketvaluedate != null ? marketvaluedate.hashCode() : 0);
        return result;
    }
}
