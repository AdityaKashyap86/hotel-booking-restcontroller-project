package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.repository.HotelBookingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelBookingServiceImpl implements  HotelBookingService {

    private final Logger log = LoggerFactory.getLogger (HotelBookingServiceImpl.class);

    private final HotelBookingRepository hotelBookingRepository;

    public HotelBookingServiceImpl(HotelBookingRepository hotelBookingRepository) {
        this.hotelBookingRepository = hotelBookingRepository;
    }


    @Override
    public HotelBooking save(HotelBooking hotelBooking) {
        log.debug ("request to save hotel:{}", hotelBooking);
        return hotelBookingRepository.save (hotelBooking);
    }

    @Override
    public HotelBooking update(HotelBooking hotelBooking) {
        log.debug ("request to update hotelBooking :{}", hotelBooking);
        return hotelBookingRepository.save (hotelBooking);
    }

    @Override
    public List<HotelBooking> findAll(

    ) {
        log.debug ("request to get all hotelbookig");
        return hotelBookingRepository.findAll ();
    }

    @Override
    public Optional<HotelBooking> findById(Long id) {
        log.debug ("request to grt all programm:{}", id);
        return hotelBookingRepository.findById (id);
    }

    @Override
    public void delete(Long id) {
        log.debug ("request to delete hotel:{}", id);
        hotelBookingRepository.deleteById (id);
    }
}