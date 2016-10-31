/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author moles
 */
public interface ConnectInterface extends Remote{
    /**
     * 
     * @param text text
     * @return number of marks
     * @throws RemoteException remote exception 
     */
    public int numberOfChart(String text) throws RemoteException;
}
