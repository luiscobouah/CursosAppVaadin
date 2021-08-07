package com.uah.es.views.matrículas;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.uah.es.views.MainLayout;

@PageTitle("Matrículas")
@Route(value = "matriculas", layout = MainLayout.class)
public class MatrículasView extends Div {

    public MatrículasView() {
        addClassName("matrículas-view");
        add(new Text("Content placeholder"));
    }

}
