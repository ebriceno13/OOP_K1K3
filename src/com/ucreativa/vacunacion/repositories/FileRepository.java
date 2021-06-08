package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{
    @Override
    public void save(Persona persona, String marca, Date fecha) throws IOException {
        //tarea

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero
            // BufferedReader para lectura
            // (disponer del metodo readLine()).
            archivo = new File("C:\\Users\\XtremePC\\Documents\\U\\Creativa\\Repo\\OOP_K1K3");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if ( null != fr ){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }

    @Override
    public List<String> get() {
        return null;
    }
}
