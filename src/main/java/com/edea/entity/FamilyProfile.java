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
@Table(name = "Family: Profile", schema = "public", catalog = "postgres")
public class FamilyProfile {
    private int familyid;
    private Integer familyfhscore;
    private Integer familybudgetscore;
    private Integer familywealthscore;
    private Integer familyobligationscore;
    private Integer numbermembers;
    private String city;
    private String state;
    private String zipcode;
    private String street;
    private Integer memberid;
    private Integer numberempincaccts;
    private Integer numberexpaccts;
    private Integer numberlaaccts;
    private Integer numberdebtaccts;
    private Integer numbervehicles;
    private Integer numbernlaaccts;
    private Integer numberccaccts;
    private Integer numberpropertyaccts;
    private Date residencestartdate;
    private Date residenceenddate;

    @Id
    @Column(name = "familyid")
    public int getFamilyid() {
        return familyid;
    }

    public void setFamilyid(int familyid) {
        this.familyid = familyid;
    }

    @Basic
    @Column(name = "familyfhscore")
    public Integer getFamilyfhscore() {
        return familyfhscore;
    }

    public void setFamilyfhscore(Integer familyfhscore) {
        this.familyfhscore = familyfhscore;
    }

    @Basic
    @Column(name = "familybudgetscore")
    public Integer getFamilybudgetscore() {
        return familybudgetscore;
    }

    public void setFamilybudgetscore(Integer familybudgetscore) {
        this.familybudgetscore = familybudgetscore;
    }

    @Basic
    @Column(name = "familywealthscore")
    public Integer getFamilywealthscore() {
        return familywealthscore;
    }

    public void setFamilywealthscore(Integer familywealthscore) {
        this.familywealthscore = familywealthscore;
    }

    @Basic
    @Column(name = "familyobligationscore")
    public Integer getFamilyobligationscore() {
        return familyobligationscore;
    }

    public void setFamilyobligationscore(Integer familyobligationscore) {
        this.familyobligationscore = familyobligationscore;
    }

    @Basic
    @Column(name = "numbermembers")
    public Integer getNumbermembers() {
        return numbermembers;
    }

    public void setNumbermembers(Integer numbermembers) {
        this.numbermembers = numbermembers;
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
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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
    @Column(name = "numberempincaccts")
    public Integer getNumberempincaccts() {
        return numberempincaccts;
    }

    public void setNumberempincaccts(Integer numberempincaccts) {
        this.numberempincaccts = numberempincaccts;
    }

    @Basic
    @Column(name = "numberexpaccts")
    public Integer getNumberexpaccts() {
        return numberexpaccts;
    }

    public void setNumberexpaccts(Integer numberexpaccts) {
        this.numberexpaccts = numberexpaccts;
    }

    @Basic
    @Column(name = "numberlaaccts")
    public Integer getNumberlaaccts() {
        return numberlaaccts;
    }

    public void setNumberlaaccts(Integer numberlaaccts) {
        this.numberlaaccts = numberlaaccts;
    }

    @Basic
    @Column(name = "numberdebtaccts")
    public Integer getNumberdebtaccts() {
        return numberdebtaccts;
    }

    public void setNumberdebtaccts(Integer numberdebtaccts) {
        this.numberdebtaccts = numberdebtaccts;
    }

    @Basic
    @Column(name = "numbervehicles")
    public Integer getNumbervehicles() {
        return numbervehicles;
    }

    public void setNumbervehicles(Integer numbervehicles) {
        this.numbervehicles = numbervehicles;
    }

    @Basic
    @Column(name = "numbernlaaccts")
    public Integer getNumbernlaaccts() {
        return numbernlaaccts;
    }

    public void setNumbernlaaccts(Integer numbernlaaccts) {
        this.numbernlaaccts = numbernlaaccts;
    }

    @Basic
    @Column(name = "numberccaccts")
    public Integer getNumberccaccts() {
        return numberccaccts;
    }

    public void setNumberccaccts(Integer numberccaccts) {
        this.numberccaccts = numberccaccts;
    }

    @Basic
    @Column(name = "numberpropertyaccts")
    public Integer getNumberpropertyaccts() {
        return numberpropertyaccts;
    }

    public void setNumberpropertyaccts(Integer numberpropertyaccts) {
        this.numberpropertyaccts = numberpropertyaccts;
    }

    @Basic
    @Column(name = "residencestartdate")
    public Date getResidencestartdate() {
        return residencestartdate;
    }

    public void setResidencestartdate(Date residencestartdate) {
        this.residencestartdate = residencestartdate;
    }

    @Basic
    @Column(name = "residenceenddate")
    public Date getResidenceenddate() {
        return residenceenddate;
    }

    public void setResidenceenddate(Date residenceenddate) {
        this.residenceenddate = residenceenddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FamilyProfile that = (FamilyProfile) o;

        if (familyid != that.familyid) {
            return false;
        }
        if (familyfhscore != null ? !familyfhscore.equals(that.familyfhscore) : that.familyfhscore != null) {
            return false;
        }
        if (familybudgetscore != null ? !familybudgetscore.equals(that.familybudgetscore) : that
                .familybudgetscore != null) {
            return false;
        }
        if (familywealthscore != null ? !familywealthscore.equals(that.familywealthscore) : that
                .familywealthscore != null) {
            return false;
        }
        if (familyobligationscore != null ? !familyobligationscore.equals(that.familyobligationscore) :
                that.familyobligationscore != null) {
            return false;
        }
        if (numbermembers != null ? !numbermembers.equals(that.numbermembers) : that.numbermembers != null) {
            return false;
        }
        if (city != null ? !city.equals(that.city) : that.city != null) {
            return false;
        }
        if (state != null ? !state.equals(that.state) : that.state != null) {
            return false;
        }
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) {
            return false;
        }
        if (street != null ? !street.equals(that.street) : that.street != null) {
            return false;
        }
        if (memberid != null ? !memberid.equals(that.memberid) : that.memberid != null) {
            return false;
        }
        if (numberempincaccts != null ? !numberempincaccts.equals(that.numberempincaccts) : that
                .numberempincaccts != null) {
            return false;
        }
        if (numberexpaccts != null ? !numberexpaccts.equals(that.numberexpaccts) : that.numberexpaccts !=
                null) {
            return false;
        }
        if (numberlaaccts != null ? !numberlaaccts.equals(that.numberlaaccts) : that.numberlaaccts != null) {
            return false;
        }
        if (numberdebtaccts != null ? !numberdebtaccts.equals(that.numberdebtaccts) : that.numberdebtaccts
                != null) {
            return false;
        }
        if (numbervehicles != null ? !numbervehicles.equals(that.numbervehicles) : that.numbervehicles !=
                null) {
            return false;
        }
        if (numbernlaaccts != null ? !numbernlaaccts.equals(that.numbernlaaccts) : that.numbernlaaccts !=
                null) {
            return false;
        }
        if (numberccaccts != null ? !numberccaccts.equals(that.numberccaccts) : that.numberccaccts != null) {
            return false;
        }
        if (numberpropertyaccts != null ? !numberpropertyaccts.equals(that.numberpropertyaccts) : that
                .numberpropertyaccts != null) {
            return false;
        }
        if (residencestartdate != null ? !residencestartdate.equals(that.residencestartdate) : that
                .residencestartdate != null) {
            return false;
        }
        if (residenceenddate != null ? !residenceenddate.equals(that.residenceenddate) : that
                .residenceenddate != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = familyid;
        result = 31 * result + (familyfhscore != null ? familyfhscore.hashCode() : 0);
        result = 31 * result + (familybudgetscore != null ? familybudgetscore.hashCode() : 0);
        result = 31 * result + (familywealthscore != null ? familywealthscore.hashCode() : 0);
        result = 31 * result + (familyobligationscore != null ? familyobligationscore.hashCode() : 0);
        result = 31 * result + (numbermembers != null ? numbermembers.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (memberid != null ? memberid.hashCode() : 0);
        result = 31 * result + (numberempincaccts != null ? numberempincaccts.hashCode() : 0);
        result = 31 * result + (numberexpaccts != null ? numberexpaccts.hashCode() : 0);
        result = 31 * result + (numberlaaccts != null ? numberlaaccts.hashCode() : 0);
        result = 31 * result + (numberdebtaccts != null ? numberdebtaccts.hashCode() : 0);
        result = 31 * result + (numbervehicles != null ? numbervehicles.hashCode() : 0);
        result = 31 * result + (numbernlaaccts != null ? numbernlaaccts.hashCode() : 0);
        result = 31 * result + (numberccaccts != null ? numberccaccts.hashCode() : 0);
        result = 31 * result + (numberpropertyaccts != null ? numberpropertyaccts.hashCode() : 0);
        result = 31 * result + (residencestartdate != null ? residencestartdate.hashCode() : 0);
        result = 31 * result + (residenceenddate != null ? residenceenddate.hashCode() : 0);
        return result;
    }
}
