import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private String nome;
    private List<Carros> listaCarros = new ArrayList<Carros>();
    private BigDecimal valorPatrimonial;
    private String remover;
    private String alterar;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carros> getListaCarros() {
        return listaCarros;

    }

    public void addListaCarros(Carros carro) {
        this.listaCarros.add(carro);

    }

    public BigDecimal getValorPatrimonial() {
        return valorPatrimonial;
    }

    public void setValorPatrimonial(BigDecimal valorPatrimonial) {
        this.valorPatrimonial = valorPatrimonial;
    }

    // remover e adicionar veículos

    public String getRemover() {
        return remover;
    }

    public void setRemover(String remover) {
        this.remover = remover;
    }

    public String getAlterar() {
        return alterar;
    }

    public void setAlterar(String alterar) {
        this.alterar = alterar;
    }
}
