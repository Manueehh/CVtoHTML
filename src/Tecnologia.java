public class Tecnologia {
    private String tipo;
    private String valor;
    public Tecnologia(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    public String getTipo() {
        return tipo;
    }
    public String getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return "Tecnologia [tipo=" + tipo + ", valor=" + valor + "]";
    }

    
}
