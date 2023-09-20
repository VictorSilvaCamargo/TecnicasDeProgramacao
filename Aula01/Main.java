package Aula01;


public class Main {
    public static void main(String[] args) {
        EventosEspeciais eventos = new EventosEspeciais();

        System.out.println("Data de Nascimento: "+ eventos.evento1());
        System.out.println("Hora de Nascimento: "+ eventos.evento2());
        System.out.println("Data e Hora de Nascimento: "+ eventos.evento3());

    }
}
