/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//2
package controladoras;

import modelos.ModuloXRol;

/**
 *
 * @author Ricardo
 */
public class AdmRoles {
    
    
    private ModuloXRol objModuloxRol = new ModuloXRol();
    
    public Boolean validaRol(String rol){
        
        Boolean valido = false;
        
        if(rol !=""){
            valido = true;
        }
        
        return valido;
    }
    
    public Boolean validaDescripcion(String descrip){
        
        Boolean valido = false;
        
        if(descrip !=""){
            valido = true;
        }
        
        return valido;
    }
    
    
    
}
