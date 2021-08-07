package com.uah.es.views.usuarios;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.uah.es.views.MainLayout;

@PageTitle("Usuarios")
@Route(value = "usuarios", layout = MainLayout.class)
public class UsuariosView extends Div {

    public UsuariosView() {
        addClassName("usuarios-view");
        add(new Text("Content placeholder"));
    }

}
