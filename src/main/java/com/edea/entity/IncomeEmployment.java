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
@Table(name = "Income: Employment", schema = "public", catalog = "postgres")
public class IncomeEmployment {
    private int memberid;
    private int incomeid;
    private String employer;
    private String workcity;
    private String workstate;
    private String workcountry;
    private String currency;
    private BigDecimal grossincome;
    private String grossincomeperiod;
    private String profession;
    private Date startdate;
    private Date enddate;
    private String employmenttype;
    private String employmentunit;
    private Boolean commissions;
    private Boolean bonuses;
    private String title;
    private Boolean pension;
    private String payunit;

    @Basic
    @Column(name = "memberid")
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    @Id
    @Column(name = "incomeid")
    public int getIncomeid() {
        return incomeid;
    }

    public void setIncomeid(int incomeid) {
        this.incomeid = incomeid;
    }

    @Basic
    @Column(name = "employer")
    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    @Basic
    @Column(name = "workcity")
    public String getWorkcity() {
        return workcity;
    }

    public void setWorkcity(String workcity) {
        this.workcity = workcity;
    }

    @Basic
    @Column(name = "workstate")
    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }

    @Basic
    @Column(name = "workcountry")
    public String getWorkcountry() {
        return workcountry;
    }

    public void setWorkcountry(String workcountry) {
        this.workcountry = workcountry;
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
    @Column(name = "grossincome")
    public BigDecimal getGrossincome() {
        return grossincome;
    }

    public void setGrossincome(BigDecimal grossincome) {
        this.grossincome = grossincome;
    }

    @Basic
    @Column(name = "grossincomeperiod")
    public String getGrossincomeperiod() {
        return grossincomeperiod;
    }

    public void setGrossincomeperiod(String grossincomeperiod) {
        this.grossincomeperiod = grossincomeperiod;
    }

    @Basic
    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "startdate")
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "enddate")
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "employmenttype")
    public String getEmploymenttype() {
        return employmenttype;
    }

    public void setEmploymenttype(String employmenttype) {
        this.employmenttype = employmenttype;
    }

    @Basic
    @Column(name = "employmentunit")
    public String getEmploymentunit() {
        return employmentunit;
    }

    public void setEmploymentunit(String employmentunit) {
        this.employmentunit = employmentunit;
    }

    @Basic
    @Column(name = "commissions")
    public Boolean getCommissions() {
        return commissions;
    }

    public void setCommissions(Boolean commissions) {
        this.commissions = commissions;
    }

    @Basic
    @Column(name = "bonuses")
    public Boolean getBonuses() {
        return bonuses;
    }

    public void setBonuses(Boolean bonuses) {
        this.bonuses = bonuses;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "pension")
    public Boolean getPension() {
        return pension;
    }

    public void setPension(Boolean pension) {
        this.pension = pension;
    }

    @Basic
    @Column(name = "payunit")
    public String getPayunit() {
        return payunit;
    }

    public void setPayunit(String payunit) {
        this.payunit = payunit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        IncomeEmployment that = (IncomeEmployment) o;

        if (memberid != that.memberid) {
            return false;
        }
        if (incomeid != that.incomeid) {
            return false;
        }
        if (employer != null ? !employer.equals(that.employer) : that.employer != null) {
            return false;
        }
        if (workcity != null ? !workcity.equals(that.workcity) : that.workcity != null) {
            return false;
        }
        if (workstate != null ? !workstate.equals(that.workstate) : that.workstate != null) {
            return false;
        }
        if (workcountry != null ? !workcountry.equals(that.workcountry) : that.workcountry != null) {
            return false;
        }
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) {
            return false;
        }
        if (grossincome != null ? !grossincome.equals(that.grossincome) : that.grossincome != null) {
            return false;
        }
        if (grossincomeperiod != null ? !grossincomeperiod.equals(that.grossincomeperiod) : that
                .grossincomeperiod != null) {
            return false;
        }
        if (profession != null ? !profession.equals(that.profession) : that.profession != null) {
            return false;
        }
        if (startdate != null ? !startdate.equals(that.startdate) : that.startdate != null) {
            return false;
        }
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) {
            return false;
        }
        if (employmenttype != null ? !employmenttype.equals(that.employmenttype) : that.employmenttype !=
                null) {
            return false;
        }
        if (employmentunit != null ? !employmentunit.equals(that.employmentunit) : that.employmentunit !=
                null) {
            return false;
        }
        if (commissions != null ? !commissions.equals(that.commissions) : that.commissions != null) {
            return false;
        }
        if (bonuses != null ? !bonuses.equals(that.bonuses) : that.bonuses != null) {
            return false;
        }
        if (title != null ? !title.equals(that.title) : that.title != null) {
            return false;
        }
        if (pension != null ? !pension.equals(that.pension) : that.pension != null) {
            return false;
        }
        if (payunit != null ? !payunit.equals(that.payunit) : that.payunit != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = memberid;
        result = 31 * result + incomeid;
        result = 31 * result + (employer != null ? employer.hashCode() : 0);
        result = 31 * result + (workcity != null ? workcity.hashCode() : 0);
        result = 31 * result + (workstate != null ? workstate.hashCode() : 0);
        result = 31 * result + (workcountry != null ? workcountry.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (grossincome != null ? grossincome.hashCode() : 0);
        result = 31 * result + (grossincomeperiod != null ? grossincomeperiod.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (employmenttype != null ? employmenttype.hashCode() : 0);
        result = 31 * result + (employmentunit != null ? employmentunit.hashCode() : 0);
        result = 31 * result + (commissions != null ? commissions.hashCode() : 0);
        result = 31 * result + (bonuses != null ? bonuses.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (pension != null ? pension.hashCode() : 0);
        result = 31 * result + (payunit != null ? payunit.hashCode() : 0);
        return result;
    }
}
