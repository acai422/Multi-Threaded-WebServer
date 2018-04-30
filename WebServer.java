/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserver;

/**
 *
 * @author aaron
 */

import java.io.*;
import java.net.*;
import java.util.*;

public final class WebServer {

    public static void main(String[] args) throws Exception {
        int port = 6789;
        ServerSocket socket1 = new ServerSocket(port);
        
        while(true){
            Socket socket2 = socket1.accept(); 
            HttpRequest request = new HttpRequest(socket2);
            Thread thread  = new Thread(request);            
            thread.start();
        }    
    }
}

