package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Clients client1 = new Clients("Anna", "Rudnicka");
        Clients client2 = new Clients("Katarzyna", "Kowalska");
        Clients client3 = new Clients("Małgorzata", "Kot");
        Clients client4 = new Clients("Katarzyna", "Kowalska");

        System.out.println(client1.equals(client2));
        System.out.println(client2.equals(client4));

        ArrayList<String> clients = new ArrayList<>();
        clients.add(client1.toString());
        clients.add(client2.toString());
        clients.add(client3.toString());
        clients.add(client4.toString());

        System.out.println("Lista klientów:");
        for (String client : clients){
            System.out.println(client);
        }

        Map<Integer, Clients> clientsMap = new HashMap<>();
        clientsMap.put(01, client1);
        clientsMap.put(02, client2);
        clientsMap.put(03, client3);
        clientsMap.put(04, client4);


        System.out.println("Klient nr 04: " +clientsMap.get(04));
        System.out.println("Liczba klientów: "+clientsMap.size());
        System.out.println(clientsMap);

    }
}