package Aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class PrimeiraAula {
    public static void main(String[] args) {
        //pega a data do dia atual e imprime
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        System.out.println();
        //imprime a hora atual
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);
        System.out.println();
        //imprime a data e a hora atual
        LocalDateTime diaHora = LocalDateTime.now();
        System.out.println(diaHora);
        System.out.println();

        LocalDate dataPassado = LocalDate.of(2023,9,1);
        System.out.println(dataPassado);
        System.out.println();
        //LocalDate dataPassado1 = LocalDate.of(2023, Month.SEPTEMBER,31);
        LocalDate anoDia = LocalDate.ofYearDay(2023,50);
        System.out.println(anoDia);
        System.out.println();

        LocalTime horaMinuto = LocalTime.of(20,30);
        LocalTime horaMinutoSegundo = LocalTime.of(20,30,10);
        System.out.println(horaMinuto);
        System.out.println(horaMinutoSegundo);
        System.out.println();
        /*
        LocalTime horaMinuto1 = LocalTime.of(23,60);
        System.out.println(horaMinuto1);
         */
        LocalDateTime AnoMesHoraMinuto = LocalDateTime.of(2023,Month.SEPTEMBER,15,20,44,30);
        System.out.println(AnoMesHoraMinuto);

        LocalDateTime dataHoraPersonalizada = LocalDateTime.of(hoje,horaMinutoSegundo);
        System.out.println(dataHoraPersonalizada);
    }
}
