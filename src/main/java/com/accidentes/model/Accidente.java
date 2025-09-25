package com.accidentes.model;

import java.util.Date;
import java.util.Objects;

public class Accidente {
    private final String num_expediente;
    private final String fecha;
    private final String hora;
    private final String localizacion;
    private final int numero;
    private final int cod_distrito;
    private final String distrito;
    private final String tipo_accidente;
    private final String estado_meteorologico;
    private final String tipo_vehiculo;
    private final String tipo_persona;
    private final String rango_edad;
    private final String sexo;
    private final int cod_lesividad ;
    private final String lesividad;
    private final int coordenada_x;
    private final int coordenada_y;
    private final String positiva_alcohol;
    private final String positiva_droga;


    public Accidente(String num_expediente, String fecha, String hora, String localizacion, int numero, int cod_distrito, String distrito, String tipo_accidente, String estado_meteorologico, String tipo_vehiculo, String tipo_persona, String rango_edad, String sexo, int cod_lesividad, String lesividad, int coordenada_x, int coordenada_y, String positiva_alcohol, String positiva_droga) {
        this.num_expediente = num_expediente;
        this.fecha = fecha;
        this.hora = hora;
        this.localizacion = localizacion;
        this.numero = numero;
        this.cod_distrito = cod_distrito;
        this.distrito = distrito;
        this.tipo_accidente = tipo_accidente;
        this.estado_meteorologico = estado_meteorologico;
        this.tipo_vehiculo = tipo_vehiculo;
        this.tipo_persona = tipo_persona;
        this.rango_edad = rango_edad;
        this.sexo = sexo;
        this.cod_lesividad = cod_lesividad;
        this.lesividad = lesividad;
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
        this.positiva_alcohol = positiva_alcohol;
        this.positiva_droga = positiva_droga;
    }

    public String getNum_expediente() {
        return num_expediente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public int getNumero() {
        return numero;
    }

    public int getCod_distrito() {
        return cod_distrito;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getTipo_accidente() {
        return tipo_accidente;
    }

    public String getEstado_meteorologico() {
        return estado_meteorologico;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public String getRango_edad() {
        return rango_edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCod_lesividad() {
        return cod_lesividad;
    }

    public String getLesividad() {
        return lesividad;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public String getPositiva_alcohol() {
        return positiva_alcohol;
    }

    public String getPositiva_droga() {
        return positiva_droga;
    }

    public Accidente withId(int id) {
        return new Accidente(num_expediente,fecha,hora,localizacion,numero,cod_distrito,distrito,tipo_accidente,estado_meteorologico,tipo_vehiculo,tipo_persona,rango_edad,sexo,cod_lesividad,lesividad,coordenada_x,coordenada_y,positiva_alcohol,positiva_droga);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Accidente accidente = (Accidente) o;
        return numero == accidente.numero && cod_distrito == accidente.cod_distrito && cod_lesividad == accidente.cod_lesividad && coordenada_x == accidente.coordenada_x && coordenada_y == accidente.coordenada_y && Objects.equals(num_expediente, accidente.num_expediente) && Objects.equals(fecha, accidente.fecha) && Objects.equals(hora, accidente.hora) && Objects.equals(localizacion, accidente.localizacion) && Objects.equals(distrito, accidente.distrito) && Objects.equals(tipo_accidente, accidente.tipo_accidente) && Objects.equals(estado_meteorologico, accidente.estado_meteorologico) && Objects.equals(tipo_vehiculo, accidente.tipo_vehiculo) && Objects.equals(tipo_persona, accidente.tipo_persona) && Objects.equals(rango_edad, accidente.rango_edad) && Objects.equals(sexo, accidente.sexo) && Objects.equals(lesividad, accidente.lesividad) && Objects.equals(positiva_alcohol, accidente.positiva_alcohol) && Objects.equals(positiva_droga, accidente.positiva_droga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num_expediente, fecha, hora, localizacion, numero, cod_distrito, distrito, tipo_accidente, estado_meteorologico, tipo_vehiculo, tipo_persona, rango_edad, sexo, cod_lesividad, lesividad, coordenada_x, coordenada_y, positiva_alcohol, positiva_droga);
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "num_expediente='" + num_expediente + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", numero=" + numero +
                ", cod_distrito=" + cod_distrito +
                ", distrito='" + distrito + '\'' +
                ", tipo_accidente='" + tipo_accidente + '\'' +
                ", estado_meteorologico='" + estado_meteorologico + '\'' +
                ", tipo_vehiculo='" + tipo_vehiculo + '\'' +
                ", tipo_persona='" + tipo_persona + '\'' +
                ", rango_edad='" + rango_edad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cod_lesividad=" + cod_lesividad +
                ", lesividad='" + lesividad + '\'' +
                ", coordenada_x=" + coordenada_x +
                ", coordenada_y=" + coordenada_y +
                ", positiva_alcohol='" + positiva_alcohol + '\'' +
                ", positiva_droga='" + positiva_droga + '\'' +
                '}';
    }
}
