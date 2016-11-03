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
@Table(name = "Asset: Realestate", schema = "public", catalog = "postgres")
public class AssetRealestate {
    private int memberid;
    private int reassetid;
    private String ownershiptype;
    private Date acquireddate;
    private BigDecimal purchaseamount;
    private String ownershippercent;
    private String propertytype;
    private String streetaddress;
    private String city;
    private String stateprovince;
    private String country;
    private String currency;
    private BigDecimal marketvalue;
    private Date marketvaluedate;
    private String assetname;
    private Float historicalgrowthrate;
    private Float projectedgrowthrate;
    private Boolean principalresidence;

    @Basic
    @Column(name = "memberid")
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    @Id
    @Column(name = "reassetid")
    public int getReassetid() {
        return reassetid;
    }

    public void setReassetid(int reassetid) {
        this.reassetid = reassetid;
    }

    @Basic
    @Column(name = "ownershiptype")
    public String getOwnershiptype() {
        return ownershiptype;
    }

    public void setOwnershiptype(String ownershiptype) {
        this.ownershiptype = ownershiptype;
    }

    @Basic
    @Column(name = "acquireddate")
    public Date getAcquireddate() {
        return acquireddate;
    }

    public void setAcquireddate(Date acquireddate) {
        this.acquireddate = acquireddate;
    }

    @Basic
    @Column(name = "purchaseamount")
    public BigDecimal getPurchaseamount() {
        return purchaseamount;
    }

    public void setPurchaseamount(BigDecimal purchaseamount) {
        this.purchaseamount = purchaseamount;
    }

    @Basic
    @Column(name = "ownershippercent")
    public String getOwnershippercent() {
        return ownershippercent;
    }

    public void setOwnershippercent(String ownershippercent) {
        this.ownershippercent = ownershippercent;
    }

    @Basic
    @Column(name = "propertytype")
    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    @Basic
    @Column(name = "streetaddress")
    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "stateprovince")
    public String getStateprovince() {
        return stateprovince;
    }

    public void setStateprovince(String stateprovince) {
        this.stateprovince = stateprovince;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    @Column(name = "assetname")
    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    @Basic
    @Column(name = "historicalgrowthrate")
    public Float getHistoricalgrowthrate() {
        return historicalgrowthrate;
    }

    public void setHistoricalgrowthrate(Float historicalgrowthrate) {
        this.historicalgrowthrate = historicalgrowthrate;
    }

    @Basic
    @Column(name = "projectedgrowthrate")
    public Float getProjectedgrowthrate() {
        return projectedgrowthrate;
    }

    public void setProjectedgrowthrate(Float projectedgrowthrate) {
        this.projectedgrowthrate = projectedgrowthrate;
    }

    @Basic
    @Column(name = "principalresidence")
    public Boolean getPrincipalresidence() {
        return principalresidence;
    }

    public void setPrincipalresidence(Boolean principalresidence) {
        this.principalresidence = principalresidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AssetRealestate that = (AssetRealestate) o;

        if (memberid != that.memberid) {
            return false;
        }
        if (reassetid != that.reassetid) {
            return false;
        }
        if (ownershiptype != null ? !ownershiptype.equals(that.ownershiptype) : that.ownershiptype != null) {
            return false;
        }
        if (acquireddate != null ? !acquireddate.equals(that.acquireddate) : that.acquireddate != null) {
            return false;
        }
        if (purchaseamount != null ? !purchaseamount.equals(that.purchaseamount) : that.purchaseamount !=
                null) {
            return false;
        }
        if (ownershippercent != null ? !ownershippercent.equals(that.ownershippercent) : that
                .ownershippercent != null) {
            return false;
        }
        if (propertytype != null ? !propertytype.equals(that.propertytype) : that.propertytype != null) {
            return false;
        }
        if (streetaddress != null ? !streetaddress.equals(that.streetaddress) : that.streetaddress != null) {
            return false;
        }
        if (city != null ? !city.equals(that.city) : that.city != null) {
            return false;
        }
        if (stateprovince != null ? !stateprovince.equals(that.stateprovince) : that.stateprovince != null) {
            return false;
        }
        if (country != null ? !country.equals(that.country) : that.country != null) {
            return false;
        }
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) {
            return false;
        }
        if (marketvalue != null ? !marketvalue.equals(that.marketvalue) : that.marketvalue != null) {
            return false;
        }
        if (marketvaluedate != null ? !marketvaluedate.equals(that.marketvaluedate) : that.marketvaluedate
                != null) {
            return false;
        }
        if (assetname != null ? !assetname.equals(that.assetname) : that.assetname != null) {
            return false;
        }
        if (historicalgrowthrate != null ? !historicalgrowthrate.equals(that.historicalgrowthrate) : that
                .historicalgrowthrate != null) {
            return false;
        }
        if (projectedgrowthrate != null ? !projectedgrowthrate.equals(that.projectedgrowthrate) : that
                .projectedgrowthrate != null) {
            return false;
        }
        if (principalresidence != null ? !principalresidence.equals(that.principalresidence) : that
                .principalresidence != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = memberid;
        result = 31 * result + reassetid;
        result = 31 * result + (ownershiptype != null ? ownershiptype.hashCode() : 0);
        result = 31 * result + (acquireddate != null ? acquireddate.hashCode() : 0);
        result = 31 * result + (purchaseamount != null ? purchaseamount.hashCode() : 0);
        result = 31 * result + (ownershippercent != null ? ownershippercent.hashCode() : 0);
        result = 31 * result + (propertytype != null ? propertytype.hashCode() : 0);
        result = 31 * result + (streetaddress != null ? streetaddress.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (stateprovince != null ? stateprovince.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (marketvalue != null ? marketvalue.hashCode() : 0);
        result = 31 * result + (marketvaluedate != null ? marketvaluedate.hashCode() : 0);
        result = 31 * result + (assetname != null ? assetname.hashCode() : 0);
        result = 31 * result + (historicalgrowthrate != null ? historicalgrowthrate.hashCode() : 0);
        result = 31 * result + (projectedgrowthrate != null ? projectedgrowthrate.hashCode() : 0);
        result = 31 * result + (principalresidence != null ? principalresidence.hashCode() : 0);
        return result;
    }
}
