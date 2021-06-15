package com.ucreativa;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;
import com.ucreativa.vacunacion.ui.FrontEnd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FrontEnd fe = new FrontEnd("Sistema de Vacunación");
        fe.build();

    } //Main


}//Close