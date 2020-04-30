package it.corso.jsf.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Session Bean implementation class EsempioRestJsonBean
 */
@Stateless
@LocalBean
public class EsempioRestJsonBean implements EsempioRestJsonBeanLocal {

    /**
     * Default constructor. 
     */
    public EsempioRestJsonBean() {

    }

    @GET
    @Path(value="/role/lista")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> getRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role(1l, "Ruolo 1", "Descrizione ruolo 1 - Lorem ipsum..."));
        roles.add(new Role(2l, "Ruolo 2", "Descrizione ruolo 2 - Lorem ipsum..."));
        roles.add(new Role(3l, "Ruolo 3", "Descrizione ruolo 3 - Lorem ipsum..."));
        roles.add(new Role(4l, "Ruolo 4", "Descrizione ruolo 4 - Lorem ipsum..."));
        roles.add(new Role(5l, "Ruolo 5", "Descrizione ruolo 5 - Lorem ipsum..."));
        roles.add(new Role(6l, "Ruolo 6", "Descrizione ruolo 6 - Lorem ipsum..."));
        roles.add(new Role(7l, "Ruolo 7", "Descrizione ruolo 7 - Lorem ipsum..."));
        roles.add(new Role(8l, "Ruolo 8", "Descrizione ruolo 8 - Lorem ipsum..."));
        roles.add(new Role(9l, "Ruolo 9", "Descrizione ruolo 8 - Lorem ipsum..."));
        roles.add(new Role(10l, "Ruolo 10", "Descrizione ruolo 8 - Lorem ipsum..."));
        roles.add(new Role(11l, "Ruolo 11", "Descrizione ruolo 8 - Lorem ipsum..."));
        roles.add(new Role(12l, "Ruolo 12", "Descrizione ruolo 8 - Lorem ipsum..."));
        roles.add(new Role(13l, "Ruolo 13", "Descrizione ruolo 8 - Lorem ipsum..."));

        return roles;
    }
}

class Role {
    private Long id;
    private String nome;
    private String descrizione;

    public Role() {
        super();
    }

    public Role(Long id, String nome, String descrizione) {
        super();
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


}
