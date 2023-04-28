/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serverpiedra;
import Interface.RMIDAO;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import javax.management.remote.rmi.RMIServer;
/**
 *
 * @author danie
 */
public class ServerPiedra extends UnicastRemoteObject implements RMIDAO {
    public ServerPiedra() throws RemoteException{
        super();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            Registry registro = LocateRegistry.createRegistry(7777);
            registro.rebind("RemotoRMI", new ServerPiedra());
            System.out.println("Servidor esta activo");
        }catch(RemoteException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public boolean VerificarUsuarios(String nombre) throws RemoteException {
            boolean estado=false;
        
        if((nombre.equals("daniel")||nombre.equals("ancizar")))
            estado=true;
        
        return estado;
    }

    @Override
    public String getUsuario() throws RemoteException {
       return this.getUsuario();
    }

    @Override
    public boolean CambiarContrasenia(String contrasenia) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
