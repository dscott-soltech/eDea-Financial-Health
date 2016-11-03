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
@Table(name = "Asset: Vehicle", schema = "public", catalog = "postgres")
public class AssetVehicle {
    private Integer vehid;
    private Integer memid;
    private String vechiclemake;
    private String vehiclemodel;
    private Date vehicleyear;
    private String vehiclevin;
    private Integer vehiclemileage;
    private String vehiclecondition;
    private Date acquireddate;
    private BigDecimal acquiredprice;
    private BigDecimal marketvalue;
    private Date marketvaluedate;
    private Date solddate;
    private BigDecimal soldprice;

    @Basic
    @Id
    @Column(name = "vehid")
    public Integer getVehid() {
        return vehid;
    }

    public void setVehid(Integer vehid) {
        this.vehid = vehid;
    }

    @Basic
    @Column(name = "memid")
    public Integer getMemid() {
        return memid;
    }

    public void setMemid(Integer memid) {
        this.memid = memid;
    }

    @Basic
    @Column(name = "vechiclemake")
    public String getVechiclemake() {
        return vechiclemake;
    }

    public void setVechiclemake(String vechiclemake) {
        this.vechiclemake = vechiclemake;
    }

    @Basic
    @Column(name = "vehiclemodel")
    public String getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel;
    }

    @Basic
    @Column(name = "vehicleyear")
    public Date getVehicleyear() {
        return vehicleyear;
    }

    public void setVehicleyear(Date vehicleyear) {
        this.vehicleyear = vehicleyear;
    }

    @Basic
    @Column(name = "vehiclevin")
    public String getVehiclevin() {
        return vehiclevin;
    }

    public void setVehiclevin(String vehiclevin) {
        this.vehiclevin = vehiclevin;
    }

    @Basic
    @Column(name = "vehiclemileage")
    public Integer getVehiclemileage() {
        return vehiclemileage;
    }

    public void setVehiclemileage(Integer vehiclemileage) {
        this.vehiclemileage = vehiclemileage;
    }

    @Basic
    @Column(name = "vehiclecondition")
    public String getVehiclecondition() {
        return vehiclecondition;
    }

    public void setVehiclecondition(String vehiclecondition) {
        this.vehiclecondition = vehiclecondition;
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
    @Column(name = "acquiredprice")
    public BigDecimal getAcquiredprice() {
        return acquiredprice;
    }

    public void setAcquiredprice(BigDecimal acquiredprice) {
        this.acquiredprice = acquiredprice;
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
    @Column(name = "solddate")
    public Date getSolddate() {
        return solddate;
    }

    public void setSolddate(Date solddate) {
        this.solddate = solddate;
    }

    @Basic
    @Column(name = "soldprice")
    public BigDecimal getSoldprice() {
        return soldprice;
    }

    public void setSoldprice(BigDecimal soldprice) {
        this.soldprice = soldprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AssetVehicle that = (AssetVehicle) o;

        if (vehid != null ? !vehid.equals(that.vehid) : that.vehid != null) {
            return false;
        }
        if (memid != null ? !memid.equals(that.memid) : that.memid != null) {
            return false;
        }
        if (vechiclemake != null ? !vechiclemake.equals(that.vechiclemake) : that.vechiclemake != null) {
            return false;
        }
        if (vehiclemodel != null ? !vehiclemodel.equals(that.vehiclemodel) : that.vehiclemodel != null) {
            return false;
        }
        if (vehicleyear != null ? !vehicleyear.equals(that.vehicleyear) : that.vehicleyear != null) {
            return false;
        }
        if (vehiclevin != null ? !vehiclevin.equals(that.vehiclevin) : that.vehiclevin != null) {
            return false;
        }
        if (vehiclemileage != null ? !vehiclemileage.equals(that.vehiclemileage) : that.vehiclemileage !=
                null) {
            return false;
        }
        if (vehiclecondition != null ? !vehiclecondition.equals(that.vehiclecondition) : that
                .vehiclecondition != null) {
            return false;
        }
        if (acquireddate != null ? !acquireddate.equals(that.acquireddate) : that.acquireddate != null) {
            return false;
        }
        if (acquiredprice != null ? !acquiredprice.equals(that.acquiredprice) : that.acquiredprice != null) {
            return false;
        }
        if (marketvalue != null ? !marketvalue.equals(that.marketvalue) : that.marketvalue != null) {
            return false;
        }
        if (marketvaluedate != null ? !marketvaluedate.equals(that.marketvaluedate) : that.marketvaluedate
                != null) {
            return false;
        }
        if (solddate != null ? !solddate.equals(that.solddate) : that.solddate != null) {
            return false;
        }
        if (soldprice != null ? !soldprice.equals(that.soldprice) : that.soldprice != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehid != null ? vehid.hashCode() : 0;
        result = 31 * result + (memid != null ? memid.hashCode() : 0);
        result = 31 * result + (vechiclemake != null ? vechiclemake.hashCode() : 0);
        result = 31 * result + (vehiclemodel != null ? vehiclemodel.hashCode() : 0);
        result = 31 * result + (vehicleyear != null ? vehicleyear.hashCode() : 0);
        result = 31 * result + (vehiclevin != null ? vehiclevin.hashCode() : 0);
        result = 31 * result + (vehiclemileage != null ? vehiclemileage.hashCode() : 0);
        result = 31 * result + (vehiclecondition != null ? vehiclecondition.hashCode() : 0);
        result = 31 * result + (acquireddate != null ? acquireddate.hashCode() : 0);
        result = 31 * result + (acquiredprice != null ? acquiredprice.hashCode() : 0);
        result = 31 * result + (marketvalue != null ? marketvalue.hashCode() : 0);
        result = 31 * result + (marketvaluedate != null ? marketvaluedate.hashCode() : 0);
        result = 31 * result + (solddate != null ? solddate.hashCode() : 0);
        result = 31 * result + (soldprice != null ? soldprice.hashCode() : 0);
        return result;
    }
}
