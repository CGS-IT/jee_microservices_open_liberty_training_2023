package at.cgsit.openliberty.demo.rest.dto;


import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
public class TestDTO {

    String name;

    String vorname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}

