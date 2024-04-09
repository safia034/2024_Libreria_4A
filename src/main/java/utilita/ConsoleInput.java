/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *rappresenta un dispositivo per acquisire dati di input
 * di ciascun tipo nativo e di tipo String
 * dalla console di input, ossia dalla tastiera
 * 
 * Ad esempio:
 * ConsoleInput tastiera=new ConsoleInput();
 * tastiera.readString --> restituisce una stringa inserita con la tastiera
 * tastiera.readInt --> restituisce un numero intero con la tastiera
 * @author Studente
 */
public class ConsoleInput 
{
    private InputStreamReader reader;
    private BufferedReader tastiera;
    
    /**
     * Costruttore
     */
    public ConsoleInput()
    {
        reader=new InputStreamReader(System.in);
        tastiera=new BufferedReader(reader);
        
    }
    
    /**
     * Legge una stringa
     * @return la stringa letta dalla tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * 
     */
    public String readString() throws IOException, NumberFormatException
    {
        return tastiera.readLine();
    }
    
        /**
     * Legge un numeoro intero
     * @return il nuemro letto dalla tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * se viene inserito un valore che non è
     * un numero coerente, ad esempio "ciao" o "10.2"
     */
    public int readInt() throws IOException, NumberFormatException
    {
        String s=tastiera.readLine();
        int x=Integer.parseInt(s);
        return x;
    }
 
            /**
     * Legge un numero short
     * @return il nuemro letto dalla tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * se viene inserito un valore che non è
     * un numero coerente, ad esempio "ciao" o un numero troppo grande
     */
    public short readShort() throws IOException, NumberFormatException
    {
        return Short.parseShort(tastiera.readLine());
    }
            /**
     * Legge un carattere dalla tastiera
     * se vengono inseriti più caratteri restituisce solo il primo dei caratteri letti
     * @return il carattere letto dalla tastiera
     * @throws IOException errore di input
     */   
    public char readChar() throws IOException, NumberFormatException
    {
        return tastiera.readLine().charAt(0);
    }
    
            /**
     * Legge un numeoro intero long
     * @return il nuemro letto dalla tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * se viene inserito un valore che non è
     * un numero coerente, ad esempio "ciao" o "10.2" o un numero troppo grande
     */
    public Long readLong() throws IOException, NumberFormatException
    {
        return Long.parseLong(tastiera.readLine());
    }
            /**
     * Legge un numeoro float
     * @return il nuemro letto dalla tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * se viene inserito un valore che non è
     * un numero coerente, ad esempio "ciao" 
     */    
    public float readFloat() throws IOException, NumberFormatException
    {
        return Float.parseFloat(tastiera.readLine());
    }

            /**
     * Legge un numeoro double
     * @return il nuemro letto dalla tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * se viene inserito un valore che non è
     * un numero coerente, ad esempio "ciao" 
     */        
    public double readDouble() throws IOException, NumberFormatException
    {
        return Double.parseDouble(tastiera.readLine());
    }
             /**
     * Legge un numeoro booleano
     * @return il valore booleano inserito da tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * qualunque valore diverso da "true" restituisce "false"
     */           
    public Boolean readBoolean() throws IOException, NumberFormatException
    {
        return Boolean.parseBoolean(tastiera.readLine());
    }
             /**
     * Legge un numeoro byte
     * @return il nuemro letto dalla tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * se viene inserito un valore che non è
     * un numero byte, ad esempio "ciao" o "-129" o "128" poichè
     * sono fuori dalrange dei numeri byte
     */       
    public byte readByte() throws IOException, NumberFormatException
    {
        return Byte.parseByte(tastiera.readLine());
    }
    
    
}
