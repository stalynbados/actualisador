/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stalynDAO;


import java.util.ArrayList;
import modell.cliente;

public interface clientedao {
    public boolean createcliente(cliente cat);
    public ArrayList<cliente> readcliente();
    public boolean updatecliente(cliente cat);
    public boolean deletecliente(String id);
}
