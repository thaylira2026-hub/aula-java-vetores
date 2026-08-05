package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainSuperHeroi {
    public static void main(String[] args) {
        SuperHeroi heroi;
        String nome;
        String idSecreta;
        String[] poderes;
        String[] fraquezas;
        int qtdPoderes;
        int qtdFraquezas;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do super-herói:");
                idSecreta = JOptionPane.showInputDialog("Digite a identidade secreta:");

                qtdPoderes = Integer.parseInt(JOptionPane.showInputDialog("Quantos poderes esse herói tem?"));
                qtdFraquezas = Integer.parseInt(JOptionPane.showInputDialog("Quantas fraquezas esse herói tem?"));

                poderes = new String[qtdPoderes];
                fraquezas = new String[qtdFraquezas];

                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Poder %d:", (i + 1)));
                }

                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog(String.format("Fraqueza %d:", (i + 1)));
                }

                heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);

                heroi.listarHeroi();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Programa encerrado. Até logo!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}