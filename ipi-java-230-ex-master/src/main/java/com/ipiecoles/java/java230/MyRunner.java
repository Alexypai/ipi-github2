package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Employe;
import com.ipiecoles.java.java230.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private EmployeRepository employeRepository;


    @Override
    public void run(String... strings) throws Exception {

        Long nbEmployes = employeRepository.count();
        System.out.println(" il y a " + nbEmployes + "Dans la BDD");
        Optional<Employe> employe = employeRepository.findById(55L);
        if (employe.isEmpty()) {
            System.out.println("nothing");
        } else {
            Employe e = employe.get();
            System.out.println(e.toString());
        }
    }

    public static void print(Object t) {
        System.out.println(t);
    }
}
