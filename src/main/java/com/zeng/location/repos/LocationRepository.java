package com.zeng.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zeng.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
