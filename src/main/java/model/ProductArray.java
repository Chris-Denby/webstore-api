package model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductArray {
    @Getter
    @Setter
    List<Category> categories;
}
