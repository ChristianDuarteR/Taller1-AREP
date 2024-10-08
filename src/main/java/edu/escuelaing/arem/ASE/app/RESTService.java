package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public interface RESTService {
    void handleGet(String[] requestLine, BufferedReader in, OutputStream out, Socket clientSocket) throws IOException;
    void handlePost( BufferedReader in, OutputStream out) throws IOException;
}

