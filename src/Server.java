/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.RemoteException;
import java.rmi.registry.Registry;


/**
 *
 * @author moles
 */
public class Server  {
    

    public static void main(String args[]) {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("myrmi", new ServerRMI());
            System.out.println("Server working");
        } catch (RemoteException e) {
            System.out.println("System not connected " + e);
        }
    }

}
