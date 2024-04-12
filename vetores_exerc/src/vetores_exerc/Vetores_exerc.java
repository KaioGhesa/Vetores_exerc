package vetores_exerc;
import javax.swing.JOptionPane;
/*
Em Java, um vetor (também conhecido como array) é uma estrutura de dados que permite 
armazenar múltiplos valores do mesmo tipo em uma única variável. 
Os vetores têm um tamanho fixo, que é determinado quando são criados, 
e cada elemento dentro do vetor pode ser acessado por um índice.
**/

public class Vetores_exerc {
    public static void main(String[] args) {
        float soma = 0;
        /*tipo de dado para mostrar numero "flutuante", ou seja numeros reais,
        float é um pouco limitado e sem muita precisão então para calculos 
        com previsão é melhor utilizar "double"
        **/
        float[] vetor = new float[10];
        //Numeros dentro do vetor ou seja de 0 ate a 9
        
        for (int i=0;i<vetor.length;i++){
        //Codigo irá contar começando do zero e terminando no 9, comparando "esse numero e menor que 10?
        String valor = JOptionPane.showInputDialog("Qual o valor?");
        //transformar em tipo string ou testo e mostrar a mensagem na tela
        vetor[i] = Float.parseFloat(valor);
        //converte a string valor que é obtida pelo usuario para um float
        }
        for(int i=0;i<vetor.length;i++){
        soma = soma + vetor[i];
        //faz a soma dos valores que o usuario disponibiliza (somando um valor + outro)
        }
        float media = soma / vetor.length;
        //divida a soma por 10
        JOptionPane.showMessageDialog(null, "A media= " + media);
        //aparece na tela a media do usuario
        
        for (int i=0;i<vetor.length;i++){
        if(vetor[i]<media){
        JOptionPane.showMessageDialog(null,"valor" + vetor[i] + "e menor que a media");
        //ver se o valor do usuario e menor que a media
        }
        }
    }
}
