package com.example.pimmovel.dao;

import android.util.Log;

import com.example.pimmovel.conexao.Conexao;
import com.example.pimmovel.model.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {

    public Usuario selecionaUsuario(String Email, String Senha){
        try {
            Connection conn = Conexao.conectar();
            if(conn !=null){

                String sql = "select '"+Email+"', '"+Senha+"' from tbLogin" ;
                Statement st = null;
                st = conn.createStatement();

                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    Usuario usu = new Usuario();
                    usu.setId(rs.getInt(1));
                    usu.setEmail(rs.getString(2));
                    usu.setSenha(rs.getString(3));

                    conn.close();
                    return usu;

                }


            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.e("ERRO", e.getMessage());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            Log.e("ERRO", throwables.getMessage());

        }

        return null;
    }
}
