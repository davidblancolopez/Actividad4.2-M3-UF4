
package control;

import activitat4.pkg2.m3.uf4.model.Tauler;
import vista.VistaTauler;

/**
 *
 * @author dblan
 */
public class ControlTauler {
    private VistaTauler vText;
    
    int columnes, files;

    public ControlTauler() {
        this.vText = vText;
    }
    
    
    public void aplicacio(){
        
        //Demanem els numeros de files i columnes.
        columnes = vText.demanarnumero("Introdueix el numero de columnes:");
        files = vText.demanarnumero("Introdueix el numero de files:");
        
        //Creem el tauler.
        Tauler tauler = new Tauler(columnes, files);
        
        /*Fem un bucle que mostrara el menú per a poder seleccionar les opcions
        fins que s'escolli la opció de sortir.*/
        do{
            
        }while(true);
        
    }
    
    
    
    
    
    
    
    /**
     * Metode per a recollir la opció en el menú ifer una acció o un altre.
     */
    public void respostaMenu(){
        int opcio = 0;
        
        opcio = vText.mostrarMenu();
        
        switch(opcio){
            case 1:
                
            break;
            case 2:
                System.exit(0);
            break;
        }
    }
    
    
    public void modificarCasella(){
        
    }

    


}
