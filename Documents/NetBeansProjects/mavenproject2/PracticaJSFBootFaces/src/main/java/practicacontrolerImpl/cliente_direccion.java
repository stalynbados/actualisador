/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacontrolerImpl;

import com.mycompany.practicajsfbootfaces.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.cliente_direccion;
import stalynDAO.cliente_direccion;

/**
 *
 * @author STALYN
 */
public class cliente_direccion implements cliente_direccion{

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<cliente_direccion> listDatos;
    @Override
    public boolean createPersona(cliente_direccion cat) {
         sql = "INSERT INTO public.persona(id_persona, first_name, last_name, dni,direccion, telefono, id_usuario)"
                 + "VALUES("+cat.getId_persona()+",'"+cat.getFirst_name()+"','"+cat.getLast_name()+"','"+cat.getDni()+"',"
                 + "'"+cat.getDireccion()+"','"+cat.getTelefono()+"','"+cat.getId_usuario()+"')";
     return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<cliente_direccion> readPersona() {
        listDatos = new ArrayList<>();

        sql = "SELECT id_persona, first_name, last_name, dni,direccion, telefono, id_usuario "
                + "    FROM public.persona";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                    ///FALTA
                    listDatos.add(new cliente_direccion(rs.getString("id_persona"),rs.getString ("first_name"), rs.getString ("last_name"),rs.getString ("dni"),rs.getString ("direcion"),rs.getString ("telefono"),rs.getString ("id_usuario")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(personaCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }
    }

    @Override
    public boolean updatePersona(persona cat) {
         sql = "UPDATE  public.persona SET "
                +"name_cat ='"+cat.getName_cat()+"',estado='"+cat.getEstado()+"' "
                + "WHERE id_persona = "+cat.getId_categoria()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deletePersona(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
