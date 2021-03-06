package com.org.accentLeaflet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.org.accentLeaflet.entities.Arch_1004901;
import com.org.accentLeaflet.entities.ArchiveID;

@CrossOrigin("*")
@RepositoryRestResource(path = "archive")
public interface ArchiveRepo extends JpaRepository<Arch_1004901, ArchiveID> {

}
