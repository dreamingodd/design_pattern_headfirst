package proxy.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
        MyRemote service = new MyRemoteImpl();
        try {
            Naming.rebind("RemoteHello", service);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says: Hello!";
    }

}
