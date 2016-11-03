package com.edea.DTO;

import javax.validation.constraints.NotNull;

import com.edea.entity.EDeaUser;

/**
 * Created by dscott on 11/3/2016.
 */
public class EDeaUserDTO {

    private Long id;
    @NotNull
    private String fname;
    @NotNull
    private String lname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public EDeaUser getUser() {

        EDeaUser EDeaUser = new EDeaUser();
        EDeaUser.setId(this.id);
        EDeaUser.setFname(this.fname);
        EDeaUser.setLname(this.lname);
        return EDeaUser;
    }
}
