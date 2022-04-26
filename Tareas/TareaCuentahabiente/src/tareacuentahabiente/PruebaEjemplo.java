/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacuentahabiente;

/**
 *
 * @author dannapaola
 */
public class PruebaEjemplo {
     
   public static void main(String[] args) {
        // TODO code application logic here
      
       Cuentahabiente[] Usuario= new Cuentahabiente [5];
       
       Usuario[0]=new Cuentahabiente(1524, "Esmeralda Quintanar", 68000);
       Usuario[1]=new Cuentahabiente(7665, "Dayana Castillo", 97000);
       Usuario[2]=new Cuentahabiente(4789, "Cassandra Hernandez", 1000);
       Usuario[3]=new Cuentahabiente(9712, "Lucio Vargas", 12000);
       Usuario[4]=new Cuentahabiente(1204, "Erik Sosa", 86000);
       
       
       for (Cuentahabiente cuentahabiente : Usuario) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
            
           
       }
        
        
   }

}
