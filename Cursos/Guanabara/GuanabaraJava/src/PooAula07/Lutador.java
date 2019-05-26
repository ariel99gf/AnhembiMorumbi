/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooAula07;

/**
 *
 * @author ariel
 */
public class Lutador {

    //Atibutos
    public String nome;
    public String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrotas, empates;

    //Métodos publicos
    public void apresentar() {
        System.out.println("---------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("com: " + this.getIdade() + " anos e: " + this.getAltura());
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println(this.getVitoria() + " Vitórias" );
        System.out.println(this.getDerrotas() + " Derrotas e");
        System.out.println(this.getEmpates() + " Empates");
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso: " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitoria() + " vezes");
        System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
        System.out.println("Empatou: " + this.getEmpates());
        
    }

    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos Especiais

    public Lutador(String no, String na, int id,
            float al, float pe, int vi, int de,int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso<=70.3){
            this.categoria = "Leve";
        } else if(this.peso<=83.9){
           this.categoria = "Médio"; 
        } else if(this.peso<=120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
