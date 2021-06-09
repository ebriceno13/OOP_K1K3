package com.ucreativa.vacunacion.repositories;


import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{

    @Override
    public void save(Persona persona, String marca, Date fecha) throws IOException {
        //tarea
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        try{
            String ruta = "archivo.txt";

            File file = new File(ruta);

            if (!file.exists()){
                file.createNewFile();
            }

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(persona.getNombre() + " - " + " Vacuna: " + marca+ " - " + format.format(fecha));
        bw.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    @Override
    public List<String> get() throws IOException {

        FileReader fr = new FileReader("archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        List<String> lines = new ArrayList<>();
        br.read();
        return lines;
    }
}
