package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CLASS2
* @generated
*/
@Entity
@Table(name = "\"CLASS2\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Class2")
public class Class2 implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
    private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "num", nullable = true, unique = false, insertable=true, updatable=true)
    
    private java.lang.Integer num;

    /**
    * Construtor
    * @generated
    */
    public Class2(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Class2 setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém num
    * return num
    * @generated
    */
    
    public java.lang.Integer getNum(){
        return this.num;
    }

    /**
    * Define num
    * @param num num
    * @generated
    */
    public Class2 setNum(java.lang.Integer num){
        this.num = num;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Class2 object = (Class2)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}