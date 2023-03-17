package com.mycompany.cerveja;

import java.util.ArrayList;
import java.util.Scanner;

public class Cerveja {
    private static int id = 1;
    private int codigo;
    public String nome;
    public String embalagem;
    public double alcool;
    public double preco;
    
    public Cerveja(String nome) {
        this.nome = nome;
        this.codigo = id;
        id++;
    }
    
    public void preencherNome(String nome) {
        this.nome = nome;
    }
    
    public void preencherEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
    
    public void preencherQuantAlcool(double alcool) {
        this.alcool = alcool;
    }
    
    public void preencherPreco(double preco) {
        this.preco = preco;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public static void main(String[] args) {
        Scanner tipo = new Scanner(System.in);
        ArrayList<Cerveja> cervejas = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro de cerveja " + (i+1));
            System.out.print("Nome: ");
            String nome = tipo.nextLine();
            Cerveja cerveja = new Cerveja(nome);
            System.out.print("Embalagem: ");
            cerveja.preencherEmbalagem(tipo.nextLine());
            System.out.print("Teor alcoólico: ");
            cerveja.preencherQuantAlcool(tipo.nextDouble());
            System.out.print("Preço: ");
            cerveja.preencherPreco(tipo.nextDouble());
            tipo.nextLine();
            cervejas.add(cerveja);
            System.out.println("Cerveja cadastrada com código " + cerveja.getCodigo());
            System.out.println();
        }
        
        System.out.println("Cervejas cadastradas:");
        for (Cerveja cerveja : cervejas) {
            System.out.println("ID: " + cerveja.getCodigo());
            System.out.println("Nome: " + cerveja.nome);
            System.out.println("Tipo da embalagem: " + cerveja.embalagem);
            System.out.println("Quantidade de alcool: " + cerveja.alcool + "%");
            System.out.println("Preço: " + cerveja.preco);
            System.out.println();
        }
        
        tipo.close();
    }
}

