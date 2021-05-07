package br.edu.cesmac.nolapi.domain;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idPedido;
    private Long idUsuario;
    @NotEmpty@NotBlank(message = "Campo Obrigatório")
    private String descricao;
    private ArrayList<Item> itens = new ArrayList();

    @OneToMany
    private Item item;

    @ManyToOne
    private Usuario usuario;

    public Pedido() {
    }

    public Pedido(Long idPedido, Long idUsuario, String descricao) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.descricao = descricao;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
