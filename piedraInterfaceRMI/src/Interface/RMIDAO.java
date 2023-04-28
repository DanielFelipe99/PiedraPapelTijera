/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author danie
 */
public interface RMIDAO extends Remote{
    public boolean VerificarUsuarios(String nombre)throws RemoteException;
    public String getUsuario()throws RemoteException;
    public boolean CambiarContrasenia(String contrasenia)throws RemoteException;
}
