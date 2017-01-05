
package vista;


import activitat4.pkg2.m3.uf4.model.tauler;
/**
 *
 * @author dblan
 */
public class vistaTauler {
    /**
     * Metode per a mostrar el menú de la aplicació amb les opcions.
     */
    public void mostrarMenu(){
        System.out.println("Menú: \n"
                + "1. Modificar casella. \n"
                + "2. Sortir.");
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
