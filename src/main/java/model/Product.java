package model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    @Getter
    @Setter
    int id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    double price;

    @Getter
    @Setter
    String imageUrl;
}

