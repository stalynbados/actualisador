/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stalynDAO;

import java.util.ArrayList;

/**
 *
 * @author STALYN
 */
public interface cliente_direccion {
        public boolean createCliente_direccion(cliente_direccion cat);
    public ArrayList<cliente_direccion> readCliente_direcion();
    public boolean updatecliente_direccion(cliente_direccion cat);
    public boolean deletecliente_direccion(String id);
}
