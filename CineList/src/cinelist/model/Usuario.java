package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Usuario {

    private int cod_usu;
    private String nome_usu;
    private Login login_usu;
    private Tipo tipo_usu;

    // construtores
    public Usuario() {

    }

    public Usuario(String no, Login lo, Tipo ti) {
        this.nome_usu = no;
        this.login_usu = lo;
        this.tipo_usu = ti;
    }

    public Usuario(int co, String no, Login lo, Tipo ti) {
        this.cod_usu = co;
        this.nome_usu = no;
        this.login_usu = lo;
        this.tipo_usu = ti;
    }

    /**
     * @return the cod_usu
     */
    public int getCod_usu() {
        return cod_usu;
    }

    /**
     * @param cod_usu the cod_usu to set
     */
    public void setCod_usu(int cod_usu) {
        this.cod_usu = cod_usu;
    }

    /**
     * @return the nome_usu
     */
    public String getNome_usu() {
        return nome_usu;
    }

    /**
     * @param nome_usu the nome_usu to set
     */
    public void setNome_usu(String nome_usu) {
        this.nome_usu = nome_usu;
    }

    /**
     * @return the login_usu
     */
    public Login getLogin_usu() {
        return login_usu;
    }

    /**
     * @param login_usu the login_usu to set
     */
    public void setLogin_usu(Login login_usu) {
        this.login_usu = login_usu;
    }

    /**
     * @return the tipo_usu
     */
    public Tipo getTipo_usu() {
        return tipo_usu;
    }

    /**
     * @param tipo_usu the tipo_usu to set
     */
    public void setTipo_usu(Tipo tipo_usu) {
        this.tipo_usu = tipo_usu;
    }
}
