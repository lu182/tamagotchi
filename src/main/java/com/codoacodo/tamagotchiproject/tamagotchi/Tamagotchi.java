package com.codoacodo.tamagotchiproject.tamagotchi;

public class Tamagotchi {

    private String nombre;
    private Integer nivel;
    private String estado;
    private Integer tiempoEnMinutos;


    //Constructor sin parámetros pero con valores por defecto al crearse:
    public Tamagotchi(){
        this.nivel = 0;
        this.tiempoEnMinutos = 0;
    }

    //Constructor con parámetros solo si le ingresan un nombre y un estado + valores por defecto:
    public Tamagotchi(String nombre, String estado) {
        this.nombre = nombre;
        this.nivel = 0;
        this.estado = estado;
        this.tiempoEnMinutos = 0;
    }

    //Constructor que crée para el test unitario:
    public Tamagotchi(String nombre){
        this.nombre = nombre;
    }

    //Métodos:
    public void comer(){
        switch (this.estado){
            case "hambrienta":
                this.estado = "contenta";
                break;
            case "contenta":
                this.nivel++;
                break;
            case "aburrida":
                if (this.tiempoEnMinutos > 80){
                    this.estado = "contenta";
                }
                break;
            default:
                System.out.println("Estado desconocido");
                break;
        }
    }

    public void jugar(){
        if (this.puedeJugar()){
            switch (this.estado){
                case "contenta":
                    this.nivel += 2;
                    break;
                case "aburrida":
                    this.estado = "contenta";
                    break;
                /*case "hambrienta":
                    break;*/
                default:
                    System.out.println("Estado desconocido");
                    break;
            }
        }
    }

    public Boolean puedeJugar(){
        return this.estado.equals("hambrienta") ? false : true;
    }

    //Getters & Setters:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        if(nivel < 0){
            this.nivel = 0;
        }
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(Integer tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }
}
