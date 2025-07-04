package com.example.customerapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerDTO implements Serializable {

    @Schema(description = "Unique ID of the customer")
    private Long id;

    @NotBlank
    @Schema(description = "Full name of the customer")
    private String name;

    @Email
    @Schema(description = "Email address")
    private String email;

    // Getter ve Setter

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Statik metod: örnek müşteri listesi oluşturur
    public static List<CustomerDTO> getSampleCustomers() {
        List<CustomerDTO> customers = new ArrayList<>();

        CustomerDTO c1 = new CustomerDTO();
        c1.setId(1L);
        c1.setName("Sena Aksakallı");
        c1.setEmail("senaak@example.com");
        customers.add(c1);

        CustomerDTO c2 = new CustomerDTO();
        c2.setId(2L);
        c2.setName("Miray Aksakallı");
        c2.setEmail("mirayak@example.com");
        customers.add(c2);

        CustomerDTO c3 = new CustomerDTO();
        c3.setId(3L);
        c3.setName("Fulya Beker");
        c3.setEmail("fulyabe@example.com");
        customers.add(c3);

        CustomerDTO c4 = new CustomerDTO();
        c4.setId(4L);
        c4.setName("Defne Beker");
        c4.setEmail("defnebe@example.com");
        customers.add(c4);

        CustomerDTO c5 = new CustomerDTO();
        c5.setId(5L);
        c5.setName("Çiğdem Arslan");
        c5.setEmail("cigdear@example.com");
        customers.add(c5);

        return customers;
    }
}
