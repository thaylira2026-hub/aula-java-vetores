package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    // atributos
    private String nome;
    private String idSecreta;
    //arrays
    private String[] poderes;
    private String[] fraquezas;

    //construtores
    public SuperHeroi() {}

    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        //o this aqui é essencial: como o parâmetro se chama nome, igual ao atributo, o this.nome diz "o atributo da classe", e o nome sozinho (do lado direito) é "o parâmetro que chegou". Sem o this, o Java ficaria confuso sobre qual nome você quer dizer.
    this.nome = nome;
    this.idSecreta = idSecreta;
    this.poderes = poderes;
    this.fraquezas = fraquezas;
    }

    // getters/setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getIdSecreta() { return idSecreta; }
    public void setIdSecreta(String idSecreta) { this.idSecreta = idSecreta; }

    public String[] getPoderes() { return poderes; }
    public void setPoderes(String[] poderes) { this.poderes = poderes; }

    public String[] getFraquezas() { return fraquezas; }
    public void setFraquezas(String[] fraquezas) { this.fraquezas = fraquezas; }

        // metodos da classe
        public void listarHeroi() {
            String exibe = String.format("Nome: %s \n", nome);
            exibe += String.format("Identidade Secreta: %s \n", idSecreta);


            exibe += "Poderes: \n";
            for (String poder : poderes) {
                exibe += String.format("- %s \n", poder);
            }

            exibe += "Fraquezas: \n";
            for (String fraqueza : fraquezas) {
                exibe += String.format("- %s \n", fraqueza);
            }

            JOptionPane.showMessageDialog(null, exibe, "Ficha do Herói", JOptionPane.INFORMATION_MESSAGE);
        }
    }

