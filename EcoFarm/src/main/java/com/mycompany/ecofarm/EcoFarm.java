/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecofarm;

import java.util.Scanner;

/**
 *
 * @author 213336
 */
public class EcoFarm {

    public static void main(String[] args) {
        
         
        System.out.println("==============================================================");
        System.out.println("=                         Bem-vindo                          =");
        System.out.println("=                             A                              =");
        System.out.println("=                                                            =");
        System.out.println("=          _____ ____ ___    _____ _    ____  __  __         =");
        System.out.println("=          | ____/ ___/ _ \\  |  ___/ \\  |  _ \\|  \\/  |       =");
        System.out.println("=          |  _|| |  | | | | | |_ / _ \\ | |_) | |\\/| |       =");
        System.out.println("=          | |__| |__| |_| | |  _/ ___ \\|  _ <| |  | |       =");
        System.out.println("=          |_____\\____\\___/  |_|/_/   \\_\\_| \\_\\_|  |_|       =");
        System.out.println("=                                                            =");
        System.out.println("==============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
           Scanner sc = new Scanner(System.in);
           
       int dia = 1;
       
       
        int aboboraplantada = 0;
            int batataplantada = 0; 
            int melanciaplantada = 0;
             int milhoplantado = 0;
             
             int aboboraInventario = 0;
             int batataInventario = 0;
             int melanciaInventario = 0;
             int milhoInventario = 0;
       while (dia <= 5){
        
       
        System.out.println("Voce esta no dia " + dia);
        System.out.println("**************************");
        System.out.println("*[1] Plantar             *");
        System.out.println("*[2] Regar               *");
        System.out.println("*[3] Colher              *");
        System.out.println("*[4] Inventario          *");
        System.out.println("*[5] Dormir              *");
        System.out.println("**************************");
        int opcao = sc.nextInt();
        
 

           if (opcao == 1){
               System.out.println("O que você quer plantar?");
               System.out.println("[1] Abobora");
               System.out.println("[2] Batata");
               System.out.println("[3] Melancia");
               System.out.println("[4] Milho");
               int planta = sc.nextInt();
               
             if (planta == 1) {
               aboboraplantada++;
            System.out.println("Voce plantou Abobora");
        } else if (planta == 2) {
             batataplantada++;
            System.out.println("Voce plantou Batata");
        } else if (planta == 3) {
            melanciaplantada++;
            System.out.println("Voce plantou Melancia");
        } else if (planta == 4) {
            milhoplantado++;
            System.out.println("Voce plantou Milho");
        }

        }if (opcao == 2){
            System.out.println("Voce regou as plantas");
          }if (opcao == 3){
        
    aboboraInventario += aboboraplantada;
    batataInventario += batataplantada;
    melanciaInventario += melanciaplantada;
    milhoInventario += milhoplantado;

    aboboraplantada = 0;
    batataplantada = 0;
    melanciaplantada = 0;
    milhoplantado = 0;

    System.out.println("Todas as plantacoes foram colhidas!");
                }
           
             if (opcao == 4){
                System.out.println("*************************");
                System.out.println("*      Inventario       *");
                System.out.println("* Voce tem  " + aboboraInventario + " Aboboras  *");
                System.out.println("* Voce tem  " + batataInventario + " Batataas  *");
                System.out.println("* Voce tem  " + melanciaInventario + " Melancias *");
                System.out.println("* Voce tem  " + milhoInventario + " Milhos    *");
                System.out.println("*************************");
            } if (opcao == 5){
                System.out.println("Voce foi dormir");
                dia++;
            }
            
    }
    }
}
