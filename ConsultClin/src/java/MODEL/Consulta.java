/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Heitor
 */
public class Consulta {
    
    private int idConsulta;
    private String descricaoConsulta;
    private String tipoServicoConsulta;

    public Consulta() {
    }

    public Consulta(int idConsulta, String descricaoConsulta, String tipoServicoConsulta) {
        this.idConsulta = idConsulta;
        this.descricaoConsulta = descricaoConsulta;
        this.tipoServicoConsulta = tipoServicoConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDescricaoConsulta() {
        return descricaoConsulta;
    }

    public void setDescricaoConsulta(String descricaoConsulta) {
        this.descricaoConsulta = descricaoConsulta;
    }

    public String getTipoServicoConsulta() {
        return tipoServicoConsulta;
    }

    public void setTipoServicoConsulta(String tipoServicoConsulta) {
        this.tipoServicoConsulta = tipoServicoConsulta;
    }
    
    
    
    
    
}
