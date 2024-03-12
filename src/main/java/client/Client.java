package client;

import lombok.Data;

@Data
public class Client {
    public Client(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;
    private String name;
}
