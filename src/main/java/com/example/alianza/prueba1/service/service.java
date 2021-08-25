package com.example.alianza.prueba1.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.alianza.prueba1.model.Data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class service {

    Logger logger = LoggerFactory.getLogger(service.class);

    ArrayList<Data> tests = new ArrayList<>();
    boolean test = false;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getdata")
    public List<Data> getDatas() {
        if (test == false) {
            test = true;
            Data d1 = new Data();
            d1.setKey("jgutierrez");
            d1.setBussines("Juliana Gutierrez");
            d1.setEmail("jgutierrez@gmail.com");
            d1.setPhone(3154193269L);
            d1.setDate(LocalDate.parse("2021-08-31"));

            Data d2 = new Data();
            d2.setKey("mmartinez");
            d2.setBussines("manuel martinez");
            d2.setEmail("mmartines@gmail.com");
            d2.setPhone(3158975152L);
            d2.setDate(LocalDate.parse("2021-08-24"));

            Data d3 = new Data();
            d3.setKey("aruiz");
            d3.setBussines("Ana ruiz");
            d3.setEmail("aruizz@gmail.com");
            d3.setPhone(3154193269L);
            d3.setDate(LocalDate.parse("2021-08-11"));

            Data d4 = new Data();
            d4.setKey("ogarcia");
            d4.setBussines("Oscar garia");
            d4.setEmail("ogarcia1@gmail.com");
            d4.setPhone(31678218971L);
            d4.setDate(LocalDate.parse("2021-08-20"));

            Data d5 = new Data();
            d5.setKey("tramos");
            d5.setBussines("Tania ramos");
            d5.setEmail("tramos@gmail.com");
            d5.setPhone(32025788889L);
            d5.setDate(LocalDate.parse("2021-08-15"));

            Data d6 = new Data();
            d6.setKey("cariza");
            d6.setBussines("Carlos ariza");
            d6.setEmail("carioza@gmail.com");
            d6.setPhone(322789784463L);
            d6.setDate(LocalDate.parse("2021-08-23"));
            tests.add(d1);
            tests.add(d2);
            tests.add(d3);
            tests.add(d4);
            tests.add(d5);
            tests.add(d6);
        }
        logger.error("error");
        return tests;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/postdata")
    public String createDatas(@Validated @RequestBody Data data) {
        Data d1 = new Data();
        d1.setKey(data.getKey());
        d1.setBussines(data.getBussines());
        d1.setEmail(data.getEmail());
        d1.setPhone(data.getPhone());
        d1.setDate(data.getDate());
        tests.add(d1);
        logger.trace("error creando");
        return "se a guardado exitosamente"; 
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getdata/{Key}")
    public Data getDatasKey(@PathVariable String Key) {
        for(Data tes: tests){
            if(tes.getKey().equals(Key)){
                return tes;
            }
        }
        logger.error("error");
        return null;
    }

}
