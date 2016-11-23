/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.vaadin.annotations.Theme;
import com.vaadin.server.ClassResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.Position;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import java.io.File;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author T-107
 */

@SpringUI
@Theme("valo")

public class MiUI extends UI{

    
        @Autowired AplicacionServicios bebidas;
    @Autowired RepositoriosMensajes repo;
    
    @Autowired RepositorioEmpleado repoEmp;
    @Autowired RepositorioDepartamento repoDepto;
    
    @Autowired RepositorioEstacionamiento repoEsta;
    @Autowired RepositorioCliente repoCli;
    
    @Autowired RepositorioTarjetas repoTarjetas;
    @Autowired RepositorioClientee repoClientee;
       
    @Override
    protected void init(VaadinRequest request) {
        //Creamos un Layout
        VerticalLayout layout=new VerticalLayout();
        
        //Generamos una etiqueta
        
        Label etiqueta = new Label("Mi primera etiqueta");
        layout.addComponent(etiqueta);
        setContent(layout);
        
        //Vamos a crear un boton
        Button boton=new Button("Mi primer boton");
        //Cambiamos el estilo del boton 
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        boton.addClickListener((Button.ClickEvent cliqueo) -> {
            //El siguiente es el constructor de la clase Notification:
            
            //Invocamos un insert
           //repo.save(new Mensaje("segundo mensajito","Mi segundo mensajito"));
            
           //Vamos a buscar por id
           // Mensaje mensa= repo.findOne(1L);
            
            //       List<Mensaje> mensajes= (List<Mensaje>) repo.findAll();
            
                   //Un update incorrecto 
              //      Mensaje m= new Mensaje();
                    //No existe el update
                    //Correcto
                    //Mensaje mensa2=repo.findOne(1L);
                            //mensa2.setCuerpo("El nuevo cuerpo del primero");
                           // repo.save(mensa2);
                   //Hacemos el delete
                   
                //   repo.delete(1L);
                  
               // repoDepto.save(new Departamento("Ventas"));
                
              // Estacionamiento esta=new Estacionamiento(new Date());
               //repoEsta.save(esta);
               
               //repoCli.save(new Cliente(new Estacionamiento(1L, new Date())));
               
               //Estacionamiento esta=new Estacionamiento(1L, new Date());
                //repoEsta.save(esta);
               // repoCli.save(new Cliente(esta));
               
              // Tarjetas tar=new Tarjetas();
              // repoTarjetas.save(tar);
               
            Notification notif = new Notification(
                    "PELIGRO",
                   // "Registros encontrados"+mensajes.size(),
                    Type.TRAY_NOTIFICATION);
            
            //Algunas propiedades de la clase notificacion
            notif.setDelayMsec(20000);
            notif.setPosition(Position.TOP_RIGHT);
            notif.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
           notif.setIcon(new FileResource(new File("src/main/resources/spellcheck.png")));
          //notif.setIcon(new ClassResource("spellcheck.png")); 

// Mostrar el mensaje de notificacion en la pagina actual
            notif.show(Page.getCurrent());

        });
            
            layout.addComponent(boton);
            
            Label etiquetaRecomendacion=new Label();
           
            
            
            //Agregamos 
          
            
            etiquetaRecomendacion.setValue(bebidas.obtenerBebida().obtenerRecomendacion());
            layout.addComponent(etiquetaRecomendacion);
            
    }
    
}
