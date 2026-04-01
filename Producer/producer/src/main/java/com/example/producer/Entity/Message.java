
package com.example.producer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String firstName;
    private String middleName;
    private String lastName;

}
