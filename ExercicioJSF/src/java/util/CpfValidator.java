/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author 032126431
 */
public class CpfValidator {

    public static boolean flag;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cpf = "399.992.758-50";

        boolean flag = valida(cpf);

        if (flag) {
            System.out.printf("CPF %S", "VErdadeiro !");//o curinga é o que recebe o valor apos a virgula o que vem apos o porcento é o tipo de parametro0
        } else {
            System.out.println("CPF" + " Falso");//concatena os valores
        }
    }

    private static boolean valida(String vet) {
        int mult, somaJ;
        int somaK;
        int Jc;
        int Kc;
        int pos;
        int Kf = Integer.valueOf(vet.substring(vet.length() - 1, vet.length())).intValue();
        int Jf = Integer.valueOf(vet.substring(vet.length() - 2, vet.length() - 1)).intValue();
        mult = 10;
        somaJ = somaK = pos = Jc = Kc = 0;

        for (int i = 0; i < vet.length() - 2; i++) {
            if (vet.substring(i, i + 1).matches("[0-9]")) {
                pos = Integer.valueOf(vet.substring(i, i + 1)).intValue();
                somaJ += pos * mult;
                somaK += pos * (mult + 1);// o mult pode ser decrementado aqui e nao embaixo
                System.out.println("Caracter = " + pos + " * " + mult-- + "\t");
            }
        }
        if (somaJ % 11 > 1){
          Jc = 11 - somaJ % 11;
        }
        
        somaK += Jc * (mult + 1);
        
        if (somaK % 11 > 1){
          Kc = 11 - somaK % 11;
        }
        
        if (Jc == Jf && Kc == Kf) {
            return true;
        } else {
            return false;
        }
    }

}
