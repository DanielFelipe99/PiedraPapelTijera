/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author danie
 */
public class ControladorLogin implements DAOLogin {
    private static ControladorLogin controladorLogin;
    private String nombre;
    private String contrasenia;
    
   
    
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
        controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }
    
    @Override
    public boolean VerificarUsuarios(String nombre) {
         boolean estado=false;
        
        if((nombre.equals("daniel")||nombre.equals("ancizar")))
            estado=true;
        
        return estado;
    }

    @Override
    public String getUsuario() {
        return this.nombre;
    }

    @Override
    public boolean CambiarContrasenia(String contrasenia) {
         boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
    }
    
}
