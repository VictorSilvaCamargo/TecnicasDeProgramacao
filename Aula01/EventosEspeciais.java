package Aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


public class EventosEspeciais {

    private final LocalDate dataNascimento = LocalDate.of(2023, Month.FEBRUARY,3);
    private final LocalTime tempo = LocalTime.of(13,0);

    public LocalDate evento1(){
        return dataNascimento;
    }

    public LocalTime evento2(){
        return tempo;
    }

    public LocalDateTime evento3(){
        return LocalDateTime.of(dataNascimento,tempo);
    }

}
