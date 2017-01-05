
package control;

import vista.vistaTauler;

/**
 *
 * @author dblan
 */
public class controlTauler {
    private vistaTauler vText;

    public controlTauler() {
        this.vText = vText;
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
    
    

    


}
