
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import negocio.UsuarioNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author briay
 */
public class Main {

    public static void main(String[] args) {
        
        /*
        Integer valor = new Integer(1);
        byte b = valor.byteValue();
        ///Usuario usuario = new Usuario(3, "Sergio", "Caballero", "sergio@gmail.com", "123456", b, "https://cdn.pixabay.com/photo/2020/07/01/12/58/icon-5359553_960_720.png", 7, 1);
        UsuarioNegocio userBuss = new UsuarioNegocio();
        //userBuss.insertUsuario(usuario);
        Usuario usuario = new Usuario();
        usuario = userBuss.findById(2);
        System.out.println(usuario.toString());
        usuario.setNombre("JUAN ROBERTO");
        userBuss.update(usuario);
        usuario = userBuss.findById(2);
        System.out.println(usuario.toString());
        System.out.println("Registro exitoso");
        */
        /*UsuarioNegocio userBuss = new UsuarioNegocio();
        List<Usuario> itasuario = new ArrayList<>();
        itasuario = userBuss.findAll();
        for(Usuario u : itasuario){
            System.out.println(u.toString());
        }*/
        
        UsuarioNegocio userBuss = new UsuarioNegocio();
        Usuario user = new Usuario();
        user = userBuss.findByIdentification(1030657287);
        System.out.println(user.toString());
        
        
        
        

    }

}
