package br.edu.cesmac.nolapi.domain;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUsuario;
    @NotEmpty@NotBlank(message = "Campo Obrigatório")
    private String nome;
    @NotEmpty@NotBlank(message = "Campo Obrigatório")
    private String senha;
    private String telefone;
    private String facebook;
    private String instagram;
    @NotEmpty@NotBlank@Email(message = "Campo Obrigatório")
    private String email;
    @NotEmpty@NotBlank(message = "Campo Obrigatório")
    private String cep;
    private String logradouro;
    private String bairro;
    private String uf;
    private String cidade;
    private String razaoSocial;
    private String cpf;
    private String cnpj;
    @NotEmpty@NotBlank(message = "Campo Obrigatório")
    private String tipo;
    private ArrayList<Pedido> pedidos = new ArrayList();

    @OneToMany
    private Pedido pedido;

    public Usuario(){

    }

    public  Usuario(Long idUsuario, String nome, String senha, String telefone,
                    String facebook, String instagram, String email, String cep, String logradouro,
                    String bairro, String uf, String cidade, String razaoSocial, String cpf, String cnpj, String tipo){
        this.idUsuario = idUsuario;
        this.cep = cep;
        this.nome = nome;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.razaoSocial = razaoSocial;
        this.logradouro = logradouro;
        this.email = email;
        this.facebook = facebook;
        this.instagram = instagram;
        this.telefone = telefone;
        this.uf = uf;
        this.tipo = tipo;
        this.senha = senha;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
