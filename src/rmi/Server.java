/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author moles
 */
public class Server extends UnicastRemoteObject implements ConnectInterface {
    /**
     * 
     * @throws RemoteException remote exception
     */
    public Server() throws RemoteException{
    }
    /**
     * 
     * @param text text
     * @return number of charts
     * @throws RemoteException  remote exception
     */
    @Override
    public int numberOfChart(String text) throws RemoteException {
        System.out.printf("Sent: %s\n",text);
        return text.length();
    }

    public static void main(String args[]) {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("myrmi", new Server());
            System.out.println("Server working");
        } catch (RemoteException e) {
            System.out.println("System not connected " + e);
        }
    }

}
