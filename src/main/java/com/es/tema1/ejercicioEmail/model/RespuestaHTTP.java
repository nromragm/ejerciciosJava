package com.es.tema1.ejercicioEmail.model;

public class RespuestaHTTP {

    private int codigoRespuesta;

    private String mensajeRespuesta;

    private UserEmail userEmail;

    public RespuestaHTTP(int codigoRespuesta, String mensajeRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public RespuestaHTTP(int codigoRespuesta, String mensajeRespuesta, UserEmail userEmail) {
        this.codigoRespuesta = codigoRespuesta;
        this.mensajeRespuesta = mensajeRespuesta;
        this.userEmail = userEmail;
    }

    public UserEmail getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(UserEmail userEmail) {
        this.userEmail = userEmail;
    }

    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(int codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    @Override
    public String toString() {
        return "RespuestaHTTP{" +
                "codigoRespuesta=" + codigoRespuesta +
                ", mensajeRespuesta='" + mensajeRespuesta + '\'' +
                ", userEmail=" + userEmail +
                '}';
    }
}
