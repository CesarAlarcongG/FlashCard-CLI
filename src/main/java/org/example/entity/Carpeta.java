package org.example.entity;

import java.util.List;

public class Carpeta {

    private String nombreCarpeta;
    private List<FlashCard> flashCards;
    private List<Carpeta> carpetas;

    //Métodos para crear
    public void crearCarpeta(Carpeta carpeta){
        //Validamos si la carpeta tiene nombre
        if(validarNombre(carpeta.nombreCarpeta)){
            System.out.println("Debe digitar el nombre de la carpeta");
            return;
        }
        this.carpetas.add(carpeta);
    }
    public boolean validarNombre(String nombreCarpeta){
        if (nombreCarpeta == null){
            return true;
        }else {
            return false;
        }

    }

    public void crearFlashCard(FlashCard flashCard){
        this.flashCards.add(flashCard);
    }

    //Métodos para eliminar
    public void eliminarCarpeta(String nombreCarpeta){
        this.carpetas.remove(nombreCarpeta);
    }

    public void eliminarFlashCard(String nombreFlashCard){
        this.flashCards.remove(nombreFlashCard);
    }

    //Constructuctor
    public Carpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
        this.flashCards = null;
        this.carpetas = null;
    }

    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }

    public List<FlashCard> getFlashCards() {
        return flashCards;
    }

    public void setFlashCards(List<FlashCard> flashCards) {
        this.flashCards = flashCards;
    }

    public List<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(List<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }
}
