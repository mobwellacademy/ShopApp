package org.mobwell.academy.shopapp.screens.model;

/**
 * Created by dsangui on 2/17/15.
 */
public class Artigo {
    String nome,
        description,
        banner,
        logo;

    

    public Artigo(String nome, String description, String banner, String logo) {
        this.nome = nome;
        this.description = description;
        this.banner = banner;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
