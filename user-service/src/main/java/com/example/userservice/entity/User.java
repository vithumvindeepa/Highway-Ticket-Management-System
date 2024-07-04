package com.example.userservice.entity;

/**
 * @author Vithum vindeepa
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user")
public class User {

    @Id
    private String id;
    private String name;

}
