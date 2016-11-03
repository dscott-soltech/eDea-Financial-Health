package com.edea.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.edea.entity.EDeaUser;

/**
 * Created by dscott on 11/3/2016.
 */
public interface EDeaUserRepository extends CrudRepository<EDeaUser, Long> {

    @Override
    List<EDeaUser> findAll();

    @Override
    EDeaUser save(EDeaUser eDeaUser);
}
