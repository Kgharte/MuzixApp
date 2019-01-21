package com.stackroute.Muzix.repository;

import com.stackroute.Muzix.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {

  //  @Query("SELECT t FROM track t WHERE t.trackName-=?1")
    public Track findBytrackName(String name);



}
