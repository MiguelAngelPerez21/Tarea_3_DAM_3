package org.example;

public class SquirtleNadador implements Runnable {

    private String nombre;

    public SquirtleNadador(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public void run()
    {
        System.out.println( this.nombre + " usa Surf!");

        try {
            // Simulamos que el vuelo toma 1 segundo
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("¡A "+ this.nombre + " le dio el viento!");
        }

        System.out.println( this.nombre + " terminó la misión!");

    }
}
