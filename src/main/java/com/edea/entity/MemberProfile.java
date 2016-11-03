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
@Table(name = "\"Member Profile\"", schema = "public", catalog = "postgres")
public class MemberProfile {
    private int familyid;
    private int memberid;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private Date dob;
    private BigDecimal age;
    private String ssnTin;
    private String employmentstatus;
    private String taxfilingstatus;
    private String dependentstatus;
    private String membertype;
    private String student;
    private String retirementstatus;
    private Integer fhScore;
    private Integer budgetscore;
    private Integer wealthscore;
    private String obligationscore;

    @Basic
    @Column(name = "familyid", nullable = false)
    public int getFamilyid() {
        return familyid;
    }

    public void setFamilyid(int familyid) {
        this.familyid = familyid;
    }

    @Id
    @Column(name = "memberid", nullable = false)
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 50)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "middlename", nullable = true, length = 50)
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Basic
    @Column(name = "lastname", nullable = true, length = 50)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 50)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "dob", nullable = true)
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "age", nullable = true, precision = 2)
    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    @Basic
    @Column(name = "ssn_tin", nullable = true, length = 50)
    public String getSsnTin() {
        return ssnTin;
    }

    public void setSsnTin(String ssnTin) {
        this.ssnTin = ssnTin;
    }

    @Basic
    @Column(name = "employmentstatus", nullable = true, length = 50)
    public String getEmploymentstatus() {
        return employmentstatus;
    }

    public void setEmploymentstatus(String employmentstatus) {
        this.employmentstatus = employmentstatus;
    }

    @Basic
    @Column(name = "taxfilingstatus", nullable = true, length = 10)
    public String getTaxfilingstatus() {
        return taxfilingstatus;
    }

    public void setTaxfilingstatus(String taxfilingstatus) {
        this.taxfilingstatus = taxfilingstatus;
    }

    @Basic
    @Column(name = "dependentstatus", nullable = true, length = 50)
    public String getDependentstatus() {
        return dependentstatus;
    }

    public void setDependentstatus(String dependentstatus) {
        this.dependentstatus = dependentstatus;
    }

    @Basic
    @Column(name = "membertype", nullable = true, length = 50)
    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    @Basic
    @Column(name = "student", nullable = true, length = 50)
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Basic
    @Column(name = "retirementstatus", nullable = true, length = 50)
    public String getRetirementstatus() {
        return retirementstatus;
    }

    public void setRetirementstatus(String retirementstatus) {
        this.retirementstatus = retirementstatus;
    }

    @Basic
    @Column(name = "FH_Score", nullable = true)
    public Integer getFhScore() {
        return fhScore;
    }

    public void setFhScore(Integer fhScore) {
        this.fhScore = fhScore;
    }

    @Basic
    @Column(name = "budgetscore", nullable = true)
    public Integer getBudgetscore() {
        return budgetscore;
    }

    public void setBudgetscore(Integer budgetscore) {
        this.budgetscore = budgetscore;
    }

    @Basic
    @Column(name = "wealthscore", nullable = true)
    public Integer getWealthscore() {
        return wealthscore;
    }

    public void setWealthscore(Integer wealthscore) {
        this.wealthscore = wealthscore;
    }

    @Basic
    @Column(name = "obligationscore", nullable = true, length = 50)
    public String getObligationscore() {
        return obligationscore;
    }

    public void setObligationscore(String obligationscore) {
        this.obligationscore = obligationscore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MemberProfile that = (MemberProfile) o;

        if (familyid != that.familyid) {
            return false;
        }
        if (memberid != that.memberid) {
            return false;
        }
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) {
            return false;
        }
        if (middlename != null ? !middlename.equals(that.middlename) : that.middlename != null) {
            return false;
        }
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) {
            return false;
        }
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) {
            return false;
        }
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) {
            return false;
        }
        if (age != null ? !age.equals(that.age) : that.age != null) {
            return false;
        }
        if (ssnTin != null ? !ssnTin.equals(that.ssnTin) : that.ssnTin != null) {
            return false;
        }
        if (employmentstatus != null ? !employmentstatus.equals(that.employmentstatus) : that
                .employmentstatus != null) {
            return false;
        }
        if (taxfilingstatus != null ? !taxfilingstatus.equals(that.taxfilingstatus) : that.taxfilingstatus
                != null) {
            return false;
        }
        if (dependentstatus != null ? !dependentstatus.equals(that.dependentstatus) : that.dependentstatus
                != null) {
            return false;
        }
        if (membertype != null ? !membertype.equals(that.membertype) : that.membertype != null) {
            return false;
        }
        if (student != null ? !student.equals(that.student) : that.student != null) {
            return false;
        }
        if (retirementstatus != null ? !retirementstatus.equals(that.retirementstatus) : that
                .retirementstatus != null) {
            return false;
        }
        if (fhScore != null ? !fhScore.equals(that.fhScore) : that.fhScore != null) {
            return false;
        }
        if (budgetscore != null ? !budgetscore.equals(that.budgetscore) : that.budgetscore != null) {
            return false;
        }
        if (wealthscore != null ? !wealthscore.equals(that.wealthscore) : that.wealthscore != null) {
            return false;
        }
        if (obligationscore != null ? !obligationscore.equals(that.obligationscore) : that.obligationscore
                != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = familyid;
        result = 31 * result + memberid;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (middlename != null ? middlename.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (ssnTin != null ? ssnTin.hashCode() : 0);
        result = 31 * result + (employmentstatus != null ? employmentstatus.hashCode() : 0);
        result = 31 * result + (taxfilingstatus != null ? taxfilingstatus.hashCode() : 0);
        result = 31 * result + (dependentstatus != null ? dependentstatus.hashCode() : 0);
        result = 31 * result + (membertype != null ? membertype.hashCode() : 0);
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (retirementstatus != null ? retirementstatus.hashCode() : 0);
        result = 31 * result + (fhScore != null ? fhScore.hashCode() : 0);
        result = 31 * result + (budgetscore != null ? budgetscore.hashCode() : 0);
        result = 31 * result + (wealthscore != null ? wealthscore.hashCode() : 0);
        result = 31 * result + (obligationscore != null ? obligationscore.hashCode() : 0);
        return result;
    }
}
