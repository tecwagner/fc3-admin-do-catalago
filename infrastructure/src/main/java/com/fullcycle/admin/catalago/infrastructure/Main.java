package com.fullcycle.admin.catalago.infrastructure;

import com.fullcycle.admin.catalago.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Testando a instacia de useCase
        System.out.println(new UseCase().execute());

    }
}