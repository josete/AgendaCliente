/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesoap;

import agendasoap.Agenda;
import agendasoap.Agenda_Service;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Portatil
 */
public class ClienteSoap {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    static Agenda_Service service;

    public static void main(String[] args) {
        service = new Agenda_Service();
        crearMenu();
    }

    public static void crearMenu() {
        System.out.println("1.  Añadir contacto");
        System.out.println("2.  Ver agenda");
        System.out.println("3.  Ver persona");
        System.out.println("4.  Validar agenda");
        System.out.println("5.  Salir");
        int opcion = scanner.nextInt();
        comprobar(opcion);
    }

    public static void comprobar(int opcion) {
        switch (opcion) {
            case 1:
                crearContacto();
                break;
            case 2:
                verAgenda();
                break;
            case 3:
                verContacto();
                break;
            case 4:
                validar();
            case 5:
                System.exit(0);
        }
    }

    public static void verContacto() {
        System.out.println("Inserta el nombre: ");
        String nombre = scanner.next();
        agendasoap.Persona pe = service.getValidarPort().devolverPersona(nombre);
        System.out.println("Nombre: " + pe.getName());
        System.out.println("Telefono: " + pe.getTelephone());
        System.out.println("Email: " + pe.getEmail());
        crearMenu();
    }

    public static void verAgenda() {
        agendasoap.Agenda ag = service.getValidarPort().devolverAgenda();
        for (agendasoap.Persona p : ag.getPersona()) {
            System.out.println("Nombre: " + p.getName());
            System.out.println("Telefono: " + p.getTelephone());
            System.out.println("Email: " + p.getEmail());
            System.out.println("--------------");
        }
        crearMenu();
    }

    public static void crearContacto() {
        System.out.println("Nombre: ");
        String nombre = scanner.next();
        System.out.println("Telefono: ");
        String telefono = scanner.next();
        while (!comprobarNumero(telefono)) {
            System.out.println("El numero de telefono no es valido, vuelve a introducirlo: ");
            telefono = scanner.next();
        }
        System.out.println("email: ");
        String email = scanner.next();
        if (!comprobarEmail(email)) {
            System.out.println("El email introducido no es valido, vuelve a introducirlo: ");
            email = scanner.next();
        }
        agendasoap.Persona p = new agendasoap.Persona();
        p.setName(nombre);
        p.setTelephone(telefono);
        p.setEmail(email);
        service.getValidarPort().insertarPersona(p);
        System.out.println("Persona insertada");
        crearMenu();
    }

    private static void validar() {
        System.out.println("Introduce el nombre de la agenda:");
        String nombreAgenda = scanner.next();
        File f = new File(nombreAgenda);
        //agendasoap.Agenda ag = service.getValidarPort().devolverAgenda();
        boolean b = service.getValidarPort().validarAgenda(f.toString());
        System.out.println(b);
    }

    private static boolean comprobarNumero(String numero) {
        Pattern patron = Pattern.compile("\\d{9}");
        Matcher valido = patron.matcher(numero);
        return valido.matches();
    }

    private static boolean comprobarEmail(String email) {
        Pattern patron = Pattern.compile("[\\-a-zA-Z0-9\\.\\+]+@[a-zAZ0-9](\\.?[\\-a-zA-Z0-9]*[a-zA-Z0-9])*");
        Matcher valido = patron.matcher(email);
        return valido.matches();
    }

}
