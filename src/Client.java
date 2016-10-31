/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author moles
 */
public class Client {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        ConnectInterface con;
        int n;
    System.out.print("Write Text:");
    String txt=scanner.nextLine();
    try{
        //con=(ConnectInterface)Naming.lookup("//localhost/myrmi");
        con=(ConnectInterface)Naming.lookup("rmi://localhost:1099/myrmi");
        n=con.numberOfChart(txt);
        System.out.printf("Text has %d characters\n",n);
    }catch(MalformedURLException | NotBoundException | RemoteException e){
        System.out.println(e);
    }
    }
    
}
