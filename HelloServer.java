import java.rmi.*;
import java.rmi.server.*;

class HelloServer {
 public static void main (String[] argv) {    
 try {         
Naming.rebind("rmi://localhost/HelloServer",new Hello("Hello Bae!"));
System.out.println("Hello Server is ready.");
 
  }
 catch (Exception e)
	{
	System.out.println("Hello Server failed: " + e);
    	}
  }
}
