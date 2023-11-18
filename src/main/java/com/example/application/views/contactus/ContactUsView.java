package com.example.application.views.contactus;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Contact Us")
@Route(value = "my-view2", layout = MainLayout.class)
@Uses(Icon.class)
public class ContactUsView extends Composite<VerticalLayout> {

    public ContactUsView() {
        H1 h1 = new H1();
        Paragraph textMedium = new Paragraph();
        H2 h2 = new H2();
        Paragraph textMedium2 = new Paragraph();
        Paragraph textLarge = new Paragraph();
        Paragraph textSmall = new Paragraph();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Contact Us");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        textMedium.setText(
                "We are unable to process transactions directly through the website, though you can get in touch with us and exchange money in-person, or online finance apps such as PayPal.");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        h2.setText("Email");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h2);
        h2.setWidth("max-content");
        textMedium2.setText("As of right now, the only to contact us is email.");
        textMedium2.setWidth("100%");
        textMedium2.getStyle().set("font-size", "var(--lumo-font-size-m)");
        textLarge.setText("Our emails");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textSmall.setText("smerryman@chccs.k12.nc.us");
        textSmall.setWidth("100%");
        textSmall.getStyle().set("font-size", "var(--lumo-font-size-xs)");
        getContent().add(h1);
        getContent().add(textMedium);
        getContent().add(h2);
        getContent().add(textMedium2);
        getContent().add(textLarge);
        getContent().add(textSmall);
    }
}
