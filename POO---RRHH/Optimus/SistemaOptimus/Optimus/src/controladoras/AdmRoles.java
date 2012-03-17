/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

/**
 *
 * @author Ricardo
 */
public class AdmRoles {
    
    
    public Boolean validaRol(String rol){
        
        Boolean valido = false;
        
        if(rol != ""){
            valido = true;
        }
        
        return valido;
    }
    
    public Boolean validaDescripcion(String descrip){
        
        Boolean valido = false;
        
        if(descrip != ""){
            valido = true;
        }
        
        return valido;
    }
    
}
