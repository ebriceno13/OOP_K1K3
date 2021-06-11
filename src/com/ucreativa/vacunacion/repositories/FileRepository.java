package com.ucreativa.vacunacion.repositories;


import com.ucreativa.vacunacion.entities.Persona;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{

    private final String ruta = "archivo.txt";

    @Override
    public void save(Persona persona, String marca, Date fecha) throws IOException {
        //tarea
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        try{

            File file = new File(ruta);

            if (!file.exists()){
                file.createNewFile();
            }

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(persona.getNombre() + " - " + " Vacuna: " + marca + " - " + format.format(fecha) + "\n");
        bw.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    @Override
    public List<String> get() {
        try {

            BufferedReader br = new BufferedReader(new FileReader(ruta));
            return br.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
