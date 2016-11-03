package com.edea.controller;

import javax.validation.Valid;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edea.entity.MemberProfile;
import com.edea.repository.MemberProfileRepository;

/**
 * Created by dscott on 11/3/2016.
 */
@RestController
@RequestMapping("/user")
public class MemberProfileController {

    @Autowired
    private MemberProfileRepository userRepository;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public ResponseEntity<Collection<MemberProfile>> getAllUsers() {
        return new ResponseEntity<>((Collection<MemberProfile>) userRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public String add(@Valid @RequestBody MemberProfile memberProfile, BindingResult result) {
        if (result.hasErrors()) {
            return "Invalid data submitted " + result.getAllErrors();
        }
        memberProfile = userRepository.save(memberProfile);
        return "saved new user : " + memberProfile.getFirstname() + " " + memberProfile.getLastname();
    }


}
