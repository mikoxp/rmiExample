
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moles
 */
public class ServerRMI extends UnicastRemoteObject implements ConnectInterface {

    public ServerRMI() throws RemoteException{
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
    
}
