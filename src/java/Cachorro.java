/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import  javax.persistence.Column;
import  javax.persistence.TableGenerator;

@Entity
@Table(name = "Cachorro")
public class Cachorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Raca;
    private String Porte;
    private String Cor;
    private String Nome;
    private String Sexo;

    
    
    
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @return the Raca
     */
    public String getRaca() {
        return Raca;
    }

    /**
     * @param Raca the Raca to set
     */
    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    /**
     * @return the Porte
     */
    public String getPorte() {
        return Porte;
    }

    /**
     * @param Porte the Porte to set
     */
    public void setPorte(String Porte) {
        this.Porte = Porte;
    }

    /**
     * @return the Cor
     */
    public String getCor() {
        return Cor;
    }

    /**
     * @param Cor the Cor to set
     */
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
    
    
    
    
    
    
    
}
