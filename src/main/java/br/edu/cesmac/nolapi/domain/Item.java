package br.edu.cesmac.nolapi.domain;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idItem;
    private Long idPedido;
    @NotEmpty@NotBlank(message = "Campo Obrigatório")
    private String descricao;
    @NotNull(message = "Campo não pode ser nulo")
    private Double valor;
    @NotNull(message = "Campo não pode ser nulo")
    private Integer quantidade;

    @ManyToOne
    private Pedido pedido;

    public Item(){

    }

    public Item(Long idItem, Long idPedido, String descricao, Double valor, Integer quantidade){
        this.idItem = idItem;
        this.idPedido = idPedido;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
