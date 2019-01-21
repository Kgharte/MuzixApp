package com.stackroute.Muzix.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Track
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trackId;
    @Column
    private String trackName;
    @Column
    private String comment;

//    public Track( String trackName, String comment) {
//        this.trackName = trackName;
//        this.comment = comment;
//    }
}
