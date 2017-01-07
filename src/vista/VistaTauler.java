
package vista;


import activitat4.pkg2.m3.uf4.model.Tauler;
import java.util.Scanner;
/**
 *
 * @author dblan
 */
public class VistaTauler {
    
    private Scanner lector = new Scanner(System.in);
    
    
    /**
     * Metode que demana els numeros per a fer el tauler.
     * @param missatge
     * @return 
     */
    public int demanarnumero(String missatge){
        int numero;
        
        System.out.println(missatge);
        numero = lector.nextInt();
        
        return numero;
    }
    
    
    
    
    
    
    
    
    /**
     * Metode per a mostrar el menú de la aplicació amb les opcions i recollir 
     * la opció escollida.
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
     * Metode per a demanar els numeros de la posició d'una casella per a cambiar 
     * el seu estat.
     */
    public int numerosCasella(String missatge){
        int posicio;
        
        
        System.out.println(missatge);
        
        posicio = lector.nextInt();
        
        
        return posicio;
    }
    
    
        /**
     * Metode per a comprovar que la posició introduida es correcte.
     *
     * @param opcio
     * @return
     */
    public boolean comprovarPosicio(int opcio, Tauler.casella [][] tauler) {
        boolean comprovar = true;

        //Si es compleix la condició el boolean serà False, per a qe així pugui sortir del bucle que es troba en "menu".
        if (opcio >= 0 && opcio < tauler.length) {
            comprovar = false;
        }

        return comprovar;
    }
    
    
    
    
    /**
     * Metode que serveix per a mostrar el tauler
     * @param tauler 
     */
    public void mostrarTauler(Tauler.casella [][] tauler){
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                System.out.println(tauler[i][j].getEstat());
                System.out.println(tauler[i][j].getColor());
            }
        }
    }
    
    
    
    
}
