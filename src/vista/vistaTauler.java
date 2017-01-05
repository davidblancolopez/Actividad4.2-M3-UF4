
package vista;


import activitat4.pkg2.m3.uf4.model.tauler;
import java.util.Scanner;
/**
 *
 * @author dblan
 */
public class vistaTauler {
    
    private Scanner lector = new Scanner(System.in);
    
    
    /**
     * Metode per a mostrar el menú de la aplicació amb les opcions.
     */
    public int mostrarMenu(){
        int opcio;
        
        do{
        System.out.println("Menú: \n"
                + "1. Modificar casella. \n"
                + "2. Sortir.");
        opcio = lector.nextInt();
        }while(comprovarMenu(opcio));
        
        return opcio;
    }
    
    
    /**
     * Metode per a comprovar que la opcio introduida al menu es correcte.
     *
     * @param opcio
     * @return
     */
    public boolean comprovarMenu(int opcio) {
        boolean comprovar = true;

        //Si es compleix la condició el boolean serà False, per a qe així pugui sortir del bucle que es troba en "menu".
        if (opcio > 0 && opcio < 3) {
            comprovar = false;
        }

        return comprovar;
    }

    
    
    
    
    /**
     * Metode que serveix per a mostrar el tauler
     * @param tauler 
     */
    public void mostrarTauler(tauler.casella [][] tauler){
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                System.out.println(tauler[i][j].getEstat());
                System.out.println(tauler[i][j].getColor());
            }
        }
    }
    
    
    
    
}
