/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMensaje {
    @Autowired RepositoriosMensajes repoMensajes;
    //Primjero hacemos el metodo para guardar 
    @CrossOrigin
    @RequestMapping(value="/mensaje/{titulo}/{cuerpo}",method=RequestMethod.POST, headers={"Accept=text/html"})
    public String guardar(@PathVariable String titulo, @PathVariable String cuerpo){
       repoMensajes.save(new Mensaje(titulo, cuerpo));
       return "Mensaje guardado con exito";
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje",method=RequestMethod.GET,headers = {"Accept=application/json"})
    
    public String buscarTodos()throws Exception{
        ArrayList<Mensaje> mensajes=(ArrayList<Mensaje>) repoMensajes.findAll();
        
        ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(mensajes);
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}",method=RequestMethod.GET,headers = {"Accept=application/json"})
    
    public String buscarId(@PathVariable long id)throws Exception{
        Mensaje mensa= repoMensajes.findOne(id);
        
        ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(mensa);
    }
    
    @CrossOrigin    
    @RequestMapping(value = "/mensaje/{id}/{titulo}/{cuerpo}",method=RequestMethod.PUT,headers = {"Accept=text.html"})
    
    public String actualizar(@PathVariable Long id,@PathVariable String titulo,@PathVariable String cuerpo){
        
       
        repoMensajes.save(new Mensaje(id,titulo,cuerpo));
        return "Mensaje actualizado con exito";
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}",method=RequestMethod.DELETE,headers ={"Accept=text/html"})
    public String borrarPorId(@PathVariable Long id)throws Exception{
        repoMensajes.delete(id);
        
        return "mensaje borrado";
    }
}
