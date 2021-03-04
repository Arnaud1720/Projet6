package com.arnaud.envTestspringData.service;

import com.arnaud.envTestspringData.beans.Booking;
import com.arnaud.envTestspringData.beans.Site;
import com.arnaud.envTestspringData.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServices {
    @Autowired
    TopoService topoService;
    @Autowired
    BookingRepository bookingRepository;

    public Booking createBooking(Booking booking){
       return bookingRepository.saveAndFlush(booking);
    }

    public void deleteBooking(int id)
    {
         bookingRepository.deleteById(id);

    }


    public List<Booking> findAllByPseudo(String pseudo){
        return bookingRepository.findAllByPseudo(pseudo);
    }

    public Booking findById(int id){
        return bookingRepository.findById(id).orElse(null);
    }


    public List<Booking> findAll(){
        return bookingRepository.findAll();
    }

}
