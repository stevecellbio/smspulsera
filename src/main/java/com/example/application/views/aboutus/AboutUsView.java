package com.example.application.views.aboutus;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("About Us")
@Route(value = "my-view", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class AboutUsView extends Composite<VerticalLayout> {

    public AboutUsView() {
        Paragraph textLarge = new Paragraph();
        Paragraph textSmall = new Paragraph();
        Hr hr = new Hr();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textLarge.setText("Supporting kids in low-income countries, the right way.");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textSmall.setText(
                "Our school is proud to announce a unique and impactful initiative in collaboration with the Pulsera Project, a non-profit organization that connects us with the rich cultural heritage and artistic talents of Central American artisans. The Pulsera Project is more than just a means to purchase hand-woven bracelets, known as pulseras. It's a movement that fosters fair trade, supports sustainable development, and enhances educational experiences for our students.The Pulsera Project operates with a mission to empower artisans in countries like Nicaragua and Guatemala by providing them with fair wages and a global platform to sell their colorful creations. These artisans, many of whom are women and youth, craft each bracelet by hand, infusing them with the vibrant stories and traditions of their culture. The sale of these pulseras not only provides economic benefits to the artisans but also funds various community initiatives, including education, environmental programs, and workers' rights advocacy.Our school's involvement in the Pulsera Project is a testament to our commitment to global education and social responsibility. By hosting a pulsera sale, we aim to raise awareness about the importance of fair trade practices and provide a tangible way for our students and the broader community to engage with and support global artisans. This initiative also offers an excellent opportunity for our students to learn about Central American cultures, the challenges faced by communities in these regions, and the impact of ethical consumer choices.The upcoming pulsera sale at our school is an event that promises not just unique accessories but also an educational journey. Each pulsera available for purchase is unique, reflecting the individual style and story of the artisan who crafted it. The pricing and sales process will be transparent, ensuring that a significant portion of the proceeds directly benefits the artisans and their communities.In addition to the sale, our school will provide various educational resources to integrate the Pulsera Project into our curriculum. Teachers will have access to lesson plans, cultural insights, and stories from the artisans, enriching our students' learning experience. These resources will delve into the history, traditions, and social issues of Central America, providing a comprehensive understanding of the region and its people.The success of this initiative relies not only on the participation of our students and staff but also on the broader community's involvement. We encourage everyone to volunteer, help promote the event, and actively engage in learning about the Pulsera Project and the artisans it supports. This engagement will extend beyond the pulsera sale, with regular updates, artisan features, and community engagement stories shared through our school's communication channels.In conclusion, our school's partnership with the Pulsera Project is more than just a fundraising event. It's an educational experience that connects us with a global community, fosters cultural understanding, and empowers artisans through sustainable and ethical practices. We invite all students, staff, and community members to join us in this colorful journey of change and hope.");
        textSmall.setWidth("100%");
        textSmall.getStyle().set("font-size", "var(--lumo-font-size-xs)");
        getContent().add(textLarge);
        getContent().add(textSmall);
        getContent().add(hr);
    }
}
