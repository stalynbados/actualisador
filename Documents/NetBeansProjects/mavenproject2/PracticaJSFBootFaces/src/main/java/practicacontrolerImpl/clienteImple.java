/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacontrolerImpl;

import com.mycompany.practicajsfbootfaces.Conexionbd;
import java.sql.ResultSet;
import java.util.ArrayList;
import modell.cliente;
import stalynDAO.clientedao;

/**
 *
 * @author STALYN
 */
public class clienteImple implements clientedao{

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<cliente> listDatos;
    @Override
    public boolean createcliente(cliente cat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<cliente> readcliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatecliente(cliente cat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletecliente(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
