package org.example;

import client.ClientService;
import config.PostgresConnection;

public class Main {
    public static void main(String[] args) {
        ClientService service = new ClientService(PostgresConnection.getInstance().getPostgresConnection());
        System.out.println("Client created.ID: " + service.createClient("Up DOE"));
        System.out.println("Name by id 5 = " + service.getById(5));
        service.setName(5, "Alice");
        service.listAll().forEach((a)-> System.out.println(a));
    }
}
