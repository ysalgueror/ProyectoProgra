package com.Proyecto.ProyectoProgra.controllers;


import com.Proyecto.ProyectoProgra.dao.UsuarioDao;
import com.Proyecto.ProyectoProgra.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class UsuarioControllers {

    @Autowired
    private UsuarioDao usuarioDao;


    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Daniela");
        usuario.setApellido("Salguero");
        usuario.setEmail("danielasalguero@gmail.com");
        usuario.setTelefono("41992124");
        return usuario;


    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario() {
        return  usuarioDao.getUsuarios ();
      }






    @RequestMapping (value = "usuario8989")

    public Usuario editar () {
        Usuario usuario = new Usuario ();
        usuario.setNombre("Daniela");
        usuario.setApellido("Salguero");
        usuario.setEmail("danielasalguero@gmail.com");
        usuario.setTelefono("41992124");
        return usuario;

    }
            @RequestMapping (value = "usuario7877")

            public Usuario eliminar () {
                Usuario usuario = new Usuario ();
                usuario.setNombre("Daniela");
                usuario.setApellido("Salguero");
                usuario.setEmail("danielasalguero@gmail.com");
                usuario.setTelefono("41992124");
                return usuario;

            }


                @RequestMapping (value = "usuario5656")

                public Usuario buscar () {
                    Usuario usuario = new Usuario ();
                    usuario.setNombre("Daniela");
                    usuario.setApellido("Salguero");
                    usuario.setEmail("danielasalguero@gmail.com");
                    usuario.setTelefono("41992124");
                    return usuario;

                }

   }
