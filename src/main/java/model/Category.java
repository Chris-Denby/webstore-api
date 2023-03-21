package model;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Getter
    @Setter
    int id;

    @Getter
    @Setter
    String title;

    @Getter
    @Setter
    String imageUrl;;

    @Getter
    @Setter
    List<Product> items;
}
