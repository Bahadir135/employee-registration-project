package com.example.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

 //   @NotNull -----> Field shouldn't be null
 //   @NotEmpty -----> Field should not be empty('') + @NotNull
  //  @NotBlank ----> Field should not be blank('  ') + @NotEmpty  + @NoNull

    @NotBlank
    @Size(max =12,min =2)
    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts mm-dd-yyyy - yyyy-dd-mm

  //  @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

 //   @NotBlank
 //   @Email
    private String email;

 //   @NotBlank
  //  @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
