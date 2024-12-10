package org.example.entity;

import org.example.entity.enums.EstadoFlashCardEnum;

public class FlashCard {

    private String pregunta;
    private String respuesta;
    private EstadoFlashCardEnum estado;

    public FlashCard() {
    }

    public FlashCard(String pregunta, String respuesta, EstadoFlashCardEnum estado) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.estado = estado;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public EstadoFlashCardEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoFlashCardEnum estado) {
        this.estado = estado;
    }
}
