/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilita;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 * rappresenta un menu costituito da un elenco di voci.
 * il metodo elencoVoci è un array di String cdove ogni elemento
 * costit
 * ad ogni voce è associato un numero intero. tali numeri vanno da 0 anumeroVoci -1.
 * l'utente può scegliere il numero corrispondente ad una delle voci.
 * esempio:
 * (0)esci
    *(1)fai questo...
    *(2)fai quello...
    *Scegli--> 
*l'utente scegli una di queste voci (0,1,o 2,...).
 */
public class Menu 
{
    private String[] elencoVoci;
    private int numeroVoci;
    
    /**
     * coctrutore
     * @param elenco array di stronga che rappresenta l'elenco di voci del menu 
     * esempio: elenco= {"esci","fai questo..","fai quello.."}
     */
    public Menu(String[] elenco)
    {
        numeroVoci=elenco.length;
        elencoVoci=new String[numeroVoci];
        for(int i=0;i<numeroVoci;i++)
        {
            elencoVoci[i]=elenco[i]; 
        }
    }
    /**
     * Metodo che consente di scegliere una voce fra quelle del menu.
     * Controllo se l'input inserito è numerico o valido (compreso)
     * @return
     * 
     */
    public int sceltaMenu()
    {
     //   Scanner tastiera=new Scanner(System.in);
      ConsoleInput tastiera=new ConsoleInput();
        int scelta = 0;
        String sceltaStringa;
        boolean sceltaOK=true;
        
        do
        {
            sceltaOK=true;
            visualizzaMenu();
            System.out.print("Scegli-->");
            
            
          try 
          {
              scelta=tastiera.readInt();
          }
          catch (IOException ex)
          {
              System.out.println("impossibile leggere da tatiera"); 
              sceltaOK=false;
          }
          catch (NumberFormatException ex)
          {
              System.out.println("Erorre! formato input non conforme "); 
              sceltaOK=false;
          }
            // controlliamo che ilnumero inserito dall'utente si compreso fra 0 e (numeroVoci -1)
         
            if(sceltaOK)
            {
               if(scelta<0||scelta>=numeroVoci)
                {
                    sceltaOK=false;
                    System.out.println("Scelta non valida! Inserire un numero compreso tra 0 e "+(numeroVoci-1));
                } 
            }
            
           
        }while(!sceltaOK);
        return scelta;
          
    }
    
    public void visualizzaMenu()
    {
        for(int i=0;i<numeroVoci;i++)
        {
            System.out.println("("+i+")"+elencoVoci[i]);
        }
    }
}