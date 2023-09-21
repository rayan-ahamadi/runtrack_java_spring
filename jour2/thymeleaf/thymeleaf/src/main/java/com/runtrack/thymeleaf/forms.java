package com.runtrack.thymeleaf;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class forms {

    @NotNull(message = "Le nom ne peut pas être vide")
    private String nom;

    @Min(value = 0, message = "L'âge doit être un nombre positif")
    private int age;

    // Getters et Setters (Omettez pour la simplicité)
}
