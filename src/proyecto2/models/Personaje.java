package proyecto2.models;

import java.util.ArrayList;

public class Personaje {
    private String jugador;

    private boolean vivo;

    private String nombre;
    private String descripcion; 

    private Atributo vidaMaxima;
    private Atributo vidaActual;

    private Atributo ataque;
    private Atributo defensa;
    private Atributo velocidad;
    private Atributo punteria;
    private Atributo critico;

    private ArrayList nombresUsados;
    private ArrayList derrotados;
    private ArrayList baneados;
    
    
    
    
    
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Atributo getVidaMaxima() {
        return vidaMaxima;
    }
    public void setVidaMaxima(Atributo vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }
    public Atributo getVidaActual() {
        return vidaActual;
    }
    public void setVidaActual(Atributo vidaActual) {
        this.vidaActual = vidaActual;
    }
    public Atributo getAtaque() {
        return ataque;
    }
    public void setAtaque(Atributo ataque) {
        this.ataque = ataque;
    }
    public Atributo getDefensa() {
        return defensa;
    }
    public void setDefensa(Atributo defensa) {
        this.defensa = defensa;
    }
    public Atributo getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(Atributo velocidad) {
        this.velocidad = velocidad;
    }
    public Atributo getPunteria() {
        return punteria;
    }
    public void setPunteria(Atributo punteria) {
        this.punteria = punteria;
    }
    public Atributo getCritico() {
        return critico;
    }
    public void setCritico(Atributo critico) {
        this.critico = critico;
    }
    public ArrayList getNombresUsados() {
        return nombresUsados;
    }
    public void setNombresUsados(ArrayList nombresUsados) {
        this.nombresUsados = nombresUsados;
    }
    public ArrayList getDerrotados() {
        return derrotados;
    }
    public void setDerrotados(ArrayList derrotados) {
        this.derrotados = derrotados;
    }
    public ArrayList getBaneados() {
        return baneados;
    }
    public void setBaneados(ArrayList baneados) {
        this.baneados = baneados;
    }

    /** Recibe un valor y lo reduce de la base de la vida actual
     * CUIDADO: Retorna el valor final (quitando venenos) de la vida actual.
     */
    public double recibirDaño(double daño){
        this.vidaActual.setValorBase(this.vidaActual.getValorBase()-daño);

        return this.vidaActual.getValorFinal();
    }

    public void actualizarAtributos(){
        this.ataque.calcularFinal();
        this.defensa.calcularFinal();
        this.critico.calcularFinal();
        this.punteria.calcularFinal();
        this.critico.calcularFinal();
        this.vidaActual.calcularFinal();
        this.vidaMaxima.calcularFinal();
    }

    @Override
    public String toString() {
        return "Personaje [jugador=" + jugador + ", vivo=" + vivo + ", nombre=" + nombre + ", descripcion="
                + descripcion + ", vidaMaxima=" + vidaMaxima + ", vidaActual=" + vidaActual + ", ataque=" + ataque
                + ", defensa=" + defensa + ", velocidad=" + velocidad + ", punteria=" + punteria + ", critico="
                + critico + ", nombresUsados=" + nombresUsados + ", derrotados=" + derrotados + ", baneados=" + baneados
                + "]";
    }

    
    

    

    

    

    
}
