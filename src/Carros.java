public class Carros {

    private String marca;
    private String modelo;
    private String ano;
    private String potencia;
    private int valor;


    //private String cadastro;

    public Carros(String marca, String modelo, String ano, String potencia, int valor) {
        // propriedades definidas
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.valor = valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        System.out.println(this.marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
        System.out.println(this.modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
        System.out.println(this.ano);
    }

    public String getAno() {
        return ano;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
        System.out.println(this.potencia);
    }

    public String getPotencia() {
        return potencia;
    }

    public void setValor(int valor) {
        this.valor = valor;
        System.out.println("R$" + this.valor);
    }

    public int getValor() {
        return valor;
    }


}