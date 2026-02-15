package com.dekapx.java.cache;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class User {
    private Long id;
    private String name;
    private String email;
}
