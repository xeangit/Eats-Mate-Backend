package com.swidx.mapservice.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)

@Entity(name="tour_information")
@Embeddable
public class TourInformationEntity implements Serializable {

    @EmbeddedId
    private TourId tourId;

    @Column
    private String title;

    @Column
    private String gubun;

    @Column
    private Integer read_count;

    @Column
    private String update_time;

    @Column
    private String address;

    @Column
    private String cntct;

    @Column
    private String represent_image;

    @Column
    private String thumbnail_image;

    @Column(precision = 16,scale = 14)
    private BigDecimal lat;

    @Column(precision = 17,scale = 14)
    private BigDecimal lng;


    public TourInformationEntity(TourId tourId,String title,String gubun,
                                 Integer read_count,BigDecimal lat,BigDecimal lng,String cntct,
                                 String update_time,String address,String represent_image,String thumbnail_image){
        this.tourId = tourId;
        this.title = title;
        this.gubun = gubun;
        this.read_count = read_count;
        this.lat = lat;
        this.lng = lng;
        this.cntct = cntct;
        this.update_time = update_time;
        this.address = address;
        this.represent_image = represent_image;
        this.thumbnail_image = thumbnail_image;

    }

}
