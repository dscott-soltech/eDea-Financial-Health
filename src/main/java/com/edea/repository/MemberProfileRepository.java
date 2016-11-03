package com.edea.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.edea.entity.MemberProfile;

/**
 * Created by dscott on 11/3/2016.
 */
public interface MemberProfileRepository extends CrudRepository<MemberProfile, Long> {

    @Override
    List<MemberProfile> findAll();

    @Override
    MemberProfile save(MemberProfile memberProfile);
}
