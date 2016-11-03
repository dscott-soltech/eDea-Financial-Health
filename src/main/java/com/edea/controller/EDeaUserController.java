package com.edea.controller;

import javax.validation.Valid;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edea.DTO.EDeaUserDTO;
import com.edea.entity.EDeaUser;
import com.edea.repository.EDeaUserRepository;

/**
 * Created by dscott on 11/3/2016.
 */
@RestController
@RequestMapping("/user")
public class EDeaUserController {

    @Autowired
    private EDeaUserRepository userRepository;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public ResponseEntity<Collection<EDeaUser>> getAllUsers() {
        return new ResponseEntity<>((Collection<EDeaUser>) userRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(@Valid EDeaUserDTO eDeaUserDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "users/new";
        }
        EDeaUser eDeaUser = userRepository.save(eDeaUserDTO.getUser());
        return "saved new user as id " + eDeaUser.getId();
    }


}
