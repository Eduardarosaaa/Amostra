/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecofarm;

import java.sql.SQLOutput;
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
             
             double polu = 5.0;
             double diassemregar = 0.0;
             double diasemplan = 0.0;
             
             boolean galinha = false;
             boolean vaca = false;
             
             String galinome = "";
             String vacanome = "";
             int ovos = 0;
             int leite = 0;
             
       while (dia <= 4){
        
       
        System.out.println("Voce esta no dia " + dia);
        System.out.println("Nivel de poluicao: " + polu + "/10");
        System.out.println("**************************");
        System.out.println("*[1] Plantar             *");
        System.out.println("*[2] Animais             *");
        System.out.println("*[3] Regar               *");
        System.out.println("*[4] Colher              *");
        System.out.println("*[5] Inventario          *");
        System.out.println("*[6] Dormir              *");
        System.out.println("**************************");
        int opcao = sc.nextInt();
        
 

           if (opcao == 1){
               diasemplan = 0.0;
               System.out.println("O que você quer plantar?");
               System.out.println("[1] Abobora");
               System.out.println("[2] Batata");
               System.out.println("[3] Melancia");
               System.out.println("[4] Milho");
               int planta = sc.nextInt();
               
             if (planta == 1) {
             aboboraplantada++;
              polu -= 0.9;
            System.out.println("Voce plantou Abobora");
        } else if (planta == 2) {
             batataplantada++;
             polu -= 0.7;
            System.out.println("Voce plantou Batata");
        } else if (planta == 3) {
            melanciaplantada++;
            polu -= 0.8;
            System.out.println("Voce plantou Melancia");
        } else if (planta == 4) {
            milhoplantado++;
            polu -= 0.9;
            System.out.println("Voce plantou Milho");
        }

          
               if (polu < 0){
                   polu = 0;
               }   
                System.out.println("A poluicao diminuiu para" + polu);
          
           } if (opcao == 2) {
                     if (dia == 1) {
                         galinha = true;
                                 System.out.println("No caminho para a fazenda voce resgatou uma galinha \n e agora ela vive com voce na fazenda");        
                                 System.out.println("Informe um nome para ela");
                                 galinome = sc.next();
                     }
                     if (dia == 2) {
                         vaca = true;
                         System.out.println("Uma vaca apareceu na fazenda \n e voce a adotou");   
                         System.out.println("Informe um nome para ela");
                         vacanome = sc.next();
                     }
                     
                 System.out.println("Deseja fazer carinho e coletar os ovos da " + galinome + "?"); 
                 System.out.println("[1] Sim");
                 System.out.println("[2] Nao");
                 int escolha = sc.nextInt();
                 
                 if (escolha == 1){
                 ovos++;
                 polu -= 0.3;
                 System.out.println("Voce acariciou a " + galinome + " e coletou os ovos dela");
                 }
                 
                 if (dia >= 2 ){
                 System.out.println("Deseja alimentar a " + vacanome + "?");
                 System.out.println("[1] Sim");
                 System.out.println("[2] Nao");
                  int escolhe = sc.nextInt();
                 
                 if (escolhe == 1){
                 leite++;
                 polu -= 0.4;
                 System.out.println("Voce alimentou a " + vacanome + " e coletou o leite dela");
                 }
                 } 
        }if (opcao == 3){
            diassemregar = 0.0;
            polu -= 0.2;
            System.out.println("Voce regou as plantas");
          }if (opcao == 4){
        
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
           
             if (opcao == 5){
                System.out.println("*************************");
                System.out.println("*      Inventario       *");
                System.out.println("* Voce tem  " + aboboraInventario + " Aboboras  *");
                System.out.println("* Voce tem  " + batataInventario + " Batataas  *");
                System.out.println("* Voce tem  " + melanciaInventario + " Melancias *");
                System.out.println("* Voce tem  " + milhoInventario + " Milhos    *");
                System.out.println("* Voce tem  " + ovos + " ovos      *" );
                System.out.println("* Voce tem  " + leite + " leites    *" );
                System.out.println("*************************");
                
            } if (opcao == 6){
                System.out.println("Voce foi dormir");
                
                diasemplan++;
                diassemregar++;
                
                 if (diasemplan >= 2){
                          polu += 1.5;
                          System.out.println("Voce passou dias sem plantar nada");
                          System.out.println("A poluicao aumentou");
                      }
                      
                      if (diassemregar >= 2) {
                          polu += 1.0;
                          System.out.println("Suas plantas estao sem agua");
                          System.out.println("A poluicao aumentou");
                      }
                      polu += 1.5;
                    
       
                System.out.println("Poluicao atual:" + polu);
                  if (polu >= 10.0){
                      System.out.println("A poluicao chegou no nivel maximo");
                      System.out.println("Voce perdeu");
                      break;
                  }
           dia++;  
          if (dia == 5) {
              System.out.println("*************************************************");
              System.out.println("*                 Parabens                      *");
              System.out.println("*           Voce venceu a poluicao :)           *");
              System.out.println("*************************************************");
           } 
       }
    }
    }
}
