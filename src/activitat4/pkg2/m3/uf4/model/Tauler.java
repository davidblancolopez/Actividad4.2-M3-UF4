
package activitat4.pkg2.m3.uf4.model;

/**
 *
 * @author dblan
 */
public class Tauler {
    
    private casella [][] tauler;
    int num1, num2;

    public Tauler(int num1, int num2) {
        this.tauler = new casella [num1][num2];
        this.num1 = num1;
        this.num2 = num2;
    }


    

    
    
    
    
    public class casella{
        boolean estat;
        String color;

        public casella(boolean estat, String color) {
            this.estat = estat;
            this.color = color;
        }

        public boolean getEstat() {
            return estat;
        }

        public void setEstat(boolean estat) {
            this.estat = estat;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        
        
        public void cambiarEstat(boolean estat){
                       
            if (estat) {
                estat = false;
            }else{
                estat= true;
            }
        }
        
        public void cambiarColor(String color){
            if (color == "verd") {
                color = "vermell";
            }else{
                color = "verd";
            }
        }
        
        
    }
    
    
    
}
