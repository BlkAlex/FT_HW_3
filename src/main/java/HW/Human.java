package HW;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public class Human {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String surname;

    @Getter
    @Setter
    private String patronymic;

    @Getter
    @Setter
    private String country;

    @Getter
    @Setter
    private int age;

    @Getter
    @Setter
    private LocalDate bithdayDate;

    @Getter
    @Setter
    private String inn;

    @Getter
    @Setter
    private SEX sex;

    @Getter
    @Setter
    private int mailIndex;

    @Getter
    @Setter
    private String region;

    @Getter
    @Setter
    private String town;

    @Getter
    @Setter
    private String street;

    @Getter
    @Setter
    private String numberHouse;

    @Getter
    @Setter
    private int numberFlat;


}

