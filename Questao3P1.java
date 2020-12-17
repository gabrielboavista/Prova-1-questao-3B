package questao3p1;

import java.util.Scanner;

public class Questao3P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o lado A: ");
        int lda = teclado.nextByte();
        System.out.println("Digite o lado B: ");
        int ldb = teclado.nextByte();
        System.out.println("Digite o lado C: ");
        int ldc = teclado.nextByte();
        
        boolean existe;
        
        int ldx = ldb - ldc;
        int ldy = lda - ldc;
        int ldz = lda - ldb;
        int ldq = ldb + ldc;
        int ldw = lda + ldc;
        int lde = lda + ldb;
        
        if (lda > ldx && lda < ldq){
            if (ldb > ldy && ldb < ldw){
                if (ldc > ldz && ldc < lde){
                    System.out.println("Verdadeiro");
                    existe = true;
                } else {
                    System.out.println("False");
                    existe = false;
                }
            } else {
                System.out.println("Falso");
                existe = false;
            }
        } else{
            System.out.println("Falso");
            existe = false;
        }
        
        if (existe == true){
            if (lda != ldb && lda != ldc && ldc != ldb){
                System.out.println("1");
            } else if (lda == ldb && lda == ldc && ldc == ldb) {
                System.out.println("3");
            } else {
                System.out.println("2");
            }
        } else {
            System.out.println("Impossível verificar o tipo do triangulo se ele não existe!");
        }
    }
    
}
