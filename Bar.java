package com.mycompany.bar;

import java.util.Scanner;
/**
 *
 * @author roney
 */
public class Bar {

    public static void main(String[] args) {
        Scanner mesa = new Scanner (System.in);
        Scanner m = new Scanner (System.in);
        Scanner n = new Scanner (System.in);
        
        float valorCerveja = 3;
        int valorAgua = 2;
        int valorTonica = 4;
        int valorRefri = 5;
        
        
        System.out.println("Iremos cadastrar o seu pedido");
        System.out.println("Digite o seu nome: ");        
        String nome = n.nextLine();

        System.out.println("Prazer "+nome+",qual a bebida que você deseja?");
        System.out.println("Bebidas disponiveis no momento: \n Cerveja \n Água \n Refrigerante \n Tônica");
        String bebida = mesa.nextLine();
        System.out.println("A bebida escolhida foi "+bebida);
        
        System.out.println("Qual a marca que você deseja? ");
        String marca = m.nextLine();
        System.out.println("A marca selecionada foi "+marca);
        
        if (null != bebida)switch (bebida) {
            case "cerveja" -> System.out.println("O valor da compra foi de "+valorCerveja+" reais");
            case "água" -> System.out.println("O valor da compra foi de "+valorAgua+" reais");
            case "tonica" -> System.out.println("O valor da compra foi de "+valorTonica+" reais");
            case "refrigerante" -> System.out.println("O valor da compra foi de "+valorRefri+" reais");
            default -> {
            }
        }
    }
}
