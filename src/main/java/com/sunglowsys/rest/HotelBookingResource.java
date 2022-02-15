package com.sunglowsys.rest;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.service.HotelBookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HotelBookingResource {
    private final Logger log = LoggerFactory.getLogger (HotelBookingResource.class);

    private final HotelBookingService hotelBookingService ;

    public HotelBookingResource(HotelBookingService hotelBookingService) {
        this.hotelBookingService = hotelBookingService;
    }

    @PostMapping("/hotels")
    public ResponseEntity<HotelBooking> createHotelBooking(@RequestBody HotelBooking hotelBooking ) throws URISyntaxException{
        log.debug ("REST request to save hotel:{}",hotelBooking);
        HotelBooking result = hotelBookingService.save (hotelBooking);
        return ResponseEntity
                .created (new URI ("/api/hotels"+result.getId ()))
                .body (result);
    }

    @PutMapping("/hotels")
    public ResponseEntity<HotelBooking> updateHotelBooking(@RequestBody HotelBooking hotelBooking ){
        log.debug ("request to programm updtae succesfully:{}",hotelBooking);
        HotelBooking result = hotelBookingService.update (hotelBooking);
        return ResponseEntity
                .ok ()
                .body (result);
    }

    @GetMapping("/hotels")
    public ResponseEntity<List<HotelBooking>> getAllHotelBooking(){
        log.debug ("REST request to get a list of hotels");
        List<HotelBooking> result = hotelBookingService.findAll ();
        return ResponseEntity.
                ok ().
                body (result);
    }

    @GetMapping("/hotels/{id}")
    public ResponseEntity<HotelBooking> gethotelBooking(@PathVariable Long id) {
        log.debug ("REST request to get hotel booking:{}", id);
        Optional<HotelBooking> result = hotelBookingService.findById (id);
        return ResponseEntity
                .ok ()
                .body (result.get ());
    }

    public ResponseEntity<HotelBooking> deleteHotelBooking(@PathVariable Long id){
        log.debug ("REST request programm delete successfully:{}",id);
        hotelBookingService.delete (id);
        return ResponseEntity
                .ok ()
                .build ();
    }

}
