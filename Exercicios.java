/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarefapoo;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Adrielly Isly
 */
public class Exercicios {

    public static void main(String[] args) {
       //ex02();
       //ex03();
       //ex04();
       //ex05();
       //ex07();
       //ex08();
       //ex09();
       ex15();
    }
    
    public static void ex01(){
        System.out.println("Em POO,a abstração é o processo de esconder os detalhes de implementação de uma aplicação.");
        System.out.println("Ou seja, uma classe abstrata não existe de fato, é apenas uma base que pode ser utilizada\n" + 
                "por outras classes, permitindo a reutilização e diminuindo a repetição do código");
    }
    
    public static void ex02() {
        System.out.println(""
                + "Encapsular os dados de uma aplicação significa evitar que estes sofram acessos indevidos. "
                + "Para isso, é criada uma estrutura que contém métodos que podem ser utilizados por qualquer outra classe, "
                + "sem causar inconsistências no desenvolvimento de um código.");
    }
    
    public static void ex03(){
        System.out.println("A Herança possibilita que as classes compartilhem seus atributos, "
                + "métodos e outros membros da classe entre si. Para a ligação entre as classes, "
                + "a herança adota um relacionamento esquematizado hierarquicamente");
    }

    public static void ex04() {
        System.out.println("Definimos Polimorfismo como um princípio a partir do qual as classes derivadas "
                + "de uma única classe base são capazes de invocar os métodos que, "
                + "embora apresentem a mesma assinatura, "
                + "comportam-se de maneira diferente para cada uma das classes derivadas.");
    }
    
    public static void ex05(){
          Scanner scanner = new Scanner(System.in);

        System.out.println("Digita a largura");
        float largura = scanner.nextFloat();
        System.out.println("Digita a altura");
        float altura = scanner.nextFloat();

        if (largura < 1.5)
            System.out.print("Essa cortina será barra/vinco: ");
        else if (largura < 2.8)
            System.out.print("Essa cortina será lateral: ");
        else
            System.out.print("Essa cortina será barra: ");

        System.out.println(largura * altura);
    }
    
    public static void ex07(){
        Scanner entrada = new Scanner(System.in);
        int contador_num_par=0;
        int contador_num_impar=0;
        int soma_num_par=0;
        
        System.out.print("Insira o primeiro numero inteiro (deve ser o maior): ");
        int maior_num = entrada.nextInt();
        System.out.print("Insira o segundo numero inteiro (deve ser o menor): ");
        int menor_num = entrada.nextInt();
        
        if(menor_num >= maior_num){
            System.out.println("Você não inseriu o número maior antes, ou eles são iguais");
            return;
        }
        
       for(; menor_num <= maior_num; menor_num++){
           if(menor_num % 2 == 0){
               contador_num_par++;
               soma_num_par = soma_num_par + menor_num;
           }else {
               contador_num_impar++;
           }
       }
        
       System.out.println("Quantidade de números ímpares: " + contador_num_impar);
       System.out.println("Quantidade de números pares: " + contador_num_par);
       System.out.println("Média dos números pares: " + soma_num_par/contador_num_impar);
    }

    public static void ex08(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 3 números, que será retornado o maior deles");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.max(a,Math.max(b,c)));
    }
    
    public static void ex09(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 3 números, que será retornado o maior e o menor deles");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.max(a,Math.max(b,c)));
        System.out.println(Math.min(a,Math.min(b,c)));
    }
    
    public static void ex10(){
        Scanner scanner = new Scanner(System.in);
        List<String> list = List.of("Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado");
        int x = scanner.nextInt();

        if (x <= 7 && x >= 1)
            System.out.println(list.get(x));
        else
            System.out.println("valor inválido");
    }
    
    public static void ex11(){
        Scanner scanner = new Scanner(System.in);

        String s = "s";

        while ("s".equals(s)) {
            System.out.print("Insira o numero a ser calculado a tabuada: ");
            int x = scanner.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.println(x + " x " + i + " = " + i * x);
            }
            
            System.out.println("----");
            for (int i = 10; i >= 1; i--) {
                System.out.println(x + " x " + i + " = " + i * x);
            }
            
            System.out.print("Deseja continuar? s/n " );
            s = scanner.next();
        }
    }
    
    public static void ex12(){
        Scanner scanner = new Scanner(System.in);

        
        int[] opt = new int[6];
        String s = "s";

        while ("s".equals(s)) {
        System.out.print("Insira a opção que deseja votar");
        int x = scanner.nextInt();
        
        if(x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 ){
            opt[x-1]++;
        }else {
            System.out.println("opção inválida");
        }
        
        System.out.print("Deseja continuar? s/n " );
        s = scanner.next();
    }
        for(int i = 0; i < 6; i++){
            System.out.println("Quantidade de votos na opção " + (i+1) +" foi de: "+ opt[i]);
        }
    }
    
    public static void ex13(){
        System.out.println("Exibe uma caixa solicitando a entrada de dados pelo usuário em um \n" +
                           "campo de texto, e botões OK e Cancelar. ");
    }

    public static void ex14(){
        System.out.println("Exibe uma pergunta que é definida pelo programador, tem \n" +
                           "os botões Sim, Não e Cancelar.");
    }
     
    public static void ex15(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro numero inteiro (deve ser o maior): ");
        int maior_num = entrada.nextInt();
        System.out.print("Insira o segundo numero inteiro (deve ser o menor): ");
        int menor_num = entrada.nextInt();
        
        if(menor_num >= maior_num){
            System.out.println("Você não inseriu o número maior antes, ou eles são iguais");
            return;
        }
        
       System.out.println("quantidade: " + (maior_num-menor_num));
       
       int[] opt = new int[maior_num-menor_num+1];
       int aux = menor_num;
       
       for(int i = 0; i <= (maior_num-menor_num);i++ , aux++){
           opt[i] = aux;
       }
       
       for(int i = 0; i <= opt.length/2; i++){
           System.out.println(opt[i]);
       }
    } 
    
    public static void ex16() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.print("O custo total foi de: R$");
        if (x == 1) System.out.println("ERRO");
        else if (x < 12) System.out.println(x * .3);
        else System.out.println(x * .25);
    }
    
    public static void ex17(){
        Scanner scanner = new Scanner(System.in);

        float h = scanner.nextFloat();
        int sexo = scanner.nextInt();

        if (sexo == 1) System.out.println(72.7 * h - 58);
        else System.out.println(62.1 * h - 44.7);
    }
    
    public static void ex18() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro numero inteiro (deve ser o maior): ");
        int maior_num = entrada.nextInt();
        System.out.print("Insira o segundo numero inteiro (deve ser o menor): ");
        int menor_num = entrada.nextInt();
        
        if(menor_num >= maior_num){
            System.out.println("Você não inseriu o número maior antes, ou eles são iguais");
            return;
        }
        
       System.out.println("quantidade: " + (maior_num-menor_num));
       
       int[] opt = new int[maior_num-menor_num+1];
       int aux = menor_num;
       
       for(int i = 0; i <= (maior_num-menor_num);i++ , aux++){
           opt[i] = aux;
       }
       
       for(int i = 0; i <= opt.length/2; i++){
           System.out.println(opt[i]);
       }
    }
    
    public static void ex19(){ 
        Scanner scanner = new Scanner(System.in);

        String s = "s";

        while ("s".equals(s)) {
            System.out.print("Insira o numero a ser calculado a tabuada: ");
            int x = scanner.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.println(x + " x " + i + " = " + i * x);
            }
            
            
            System.out.print("Deseja continuar? s/n " );
            s = scanner.next();
        }
    }
    
    public static void ex20(){


        Double n1 = Double.valueOf(
                JOptionPane.showInputDialog(
                        null,
                        "Qual foi sua nota",
                        "NOTA P1",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        Double n2 = Double.valueOf(
                JOptionPane.showInputDialog(
                        null,
                        "Qual foi sua nota",
                        "NOTA P2",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        if ((n1+n2)/2 >= 6)
            JOptionPane.showMessageDialog(null, "PARABÉNS! Você foi aprovado!", "", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Vocêfoi reprovado!!! Estude mais...", "", JOptionPane.ERROR_MESSAGE);
    
    }
}
