/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioasincrono230223;

import java.util.Scanner;

/**
 *
 * @author Alejandro Bautista
 */
public class EjercicioAsincrono230223 {
    private Scanner teclado;
    private float PriNum;
    private float SegNum;
    private int Opcion;
    private float Resultado;
    
    public void Cargar(){
        teclado = new Scanner(System.in);
        
        System.out.print("\t Bienvenido \n");
        System.out.print(" Inserte un numero \n");
        PriNum=teclado.nextFloat();
        System.out.print(" Inserte el segundo numero \n");
        SegNum=teclado.nextFloat();
        
        this.menu(); ///Nos envia al menu
        
    }
    
    public void menu(){
        teclado = new Scanner(System.in);
        System.out.print("seleccione una opcion \n");
        System.out.print("1. Sumar \n" +"2. Restar \n" + "3. Multiplicacion \n"+ "4. Division \n");
        Opcion=teclado.nextInt();
        
        do{
            switch(Opcion){
                case 1: ///SUMA
                    
                    this.sumar(); /// el metodo hace la operacion 
                    
                    break;
                    
                case 2: ///RESTA
                    
                    this.restar();
                    
                    break;
                    
                case 3: ///MULTIPLICACION
                    
                    this.multiplicar();
                    break;
                    
                case 4:  ///DIVISION
                    
                    this.dividir();
                    break;
                    
            }
        }while (Opcion!=5);
                     
        
    }
    
    
    public void sumar(){
        
        Resultado = PriNum + SegNum; 
        System.out.println("El resultado de la operacion es: " + Resultado);
        teclado.nextLine(); //Limpiamos buffer del System.in
    	System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
    	teclado.nextLine();
        
    }
    
    public void restar(){
        
        Resultado = PriNum - SegNum; 
        System.out.println("El resultado de la operacion es: " + Resultado);
        teclado.nextLine(); //Limpiamos buffer del System.in
    	System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
    	teclado.nextLine();
        
    }
    
    public void multiplicar(){
        
        Resultado = PriNum * SegNum; 
        System.out.println("El resultado de la operacion es: " + Resultado);
        teclado.nextLine(); //Limpiamos buffer del System.in
    	System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
    	teclado.nextLine();
        
    }
    
    public void dividir(){
        
        Resultado = PriNum / SegNum; 
        System.out.println("El resultado de la operacion es: " + Resultado);
        teclado.nextLine(); //Limpiamos buffer del System.in
    	System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
    	teclado.nextLine();
        
    }
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EjercicioAsincrono230223 pv = new EjercicioAsincrono230223();
        ///pv.menu();
        pv.Cargar(); ///Iniciamos con el metodo Cargar
        ///pv.CalculadoraBasica();
    }
    
}
