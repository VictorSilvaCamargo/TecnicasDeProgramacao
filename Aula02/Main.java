package Aula02;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");

        List<LocalDate> datasDate = new ArrayList<>();

        for(String data : datasStrings){
            DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dataFormatada = LocalDate.parse(data,formatoData);
            datasDate.add(dataFormatada);
        }

        for (LocalDate data : datasDate){
            System.out.println(data);
        }
    }
}
