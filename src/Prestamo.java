package tools;


import java.util.ArrayList;

import Content.Material;

import Docker.Persona;

import Themes.Colores;


public class Prestamo extends Colores{
    
    public Prestamo(){

    }

    public void imprimirDeudores(ArrayList<Persona> personas){//esta de mas verificar, xq todos son deudores, seria simplemente imprimir
        int indice = 1;
        System.out.println(green + "* Lista de Deudores *" + reset);
        for(Persona persona : personas){
            if(persona.getSePresto()){
                System.out.println(red + indice + ")" + blue + persona.getNombre() + blue + " " + green + persona.getTipoPersona().trim() + yellow + "  Debe: " + reset + persona.debe());
                indice++;
            }else{
                //nothing
            }
        }
    }

    public void prestar(int indice, ArrayList<Persona> personas, Material material){
        Persona persona = personas.get(indice);
        persona.setSePresto(true);
        persona.agregarMaterial(material);
    }

    public String seHaPrestado(Persona persona, Material material){
        String res = yellow + "Se ha prestado " + reset + red + material.getNombre() + reset + green + material.getTipoMaterial().trim() + reset + yellow + " a " + reset + red + persona.getNombre() + reset + green + persona.getTipoPersona().trim() + reset;
        return res;
    }
}