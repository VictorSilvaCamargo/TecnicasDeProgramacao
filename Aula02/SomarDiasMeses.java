package Aula02;

import java.time.LocalDate;
import java.time.Month;

public class SomarDiasMeses {
    public static void main(String[] args) {

        LocalDate primeiraVacina = LocalDate.of(2023, Month.FEBRUARY,1);
        System.out.println("Data da primeira vacina: "+ primeiraVacina);

        LocalDate segundaVacina = primeiraVacina.plusMonths(1);
        System.out.println("Data da segunda vacina: " + segundaVacina);

        LocalDate terceiraVacina = segundaVacina.plusMonths(1);
        System.out.println("Data da terceira vacina: "+ terceiraVacina);
    }

}
