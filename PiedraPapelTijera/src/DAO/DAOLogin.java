/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author danieyancizar
 * Metodos implementados en el Dao local
 */
public interface DAOLogin {
    public boolean VerificarUsuarios(String nombre);
    public String getUsuario();
    public boolean CambiarContrasenia(String contrasenia);
}
