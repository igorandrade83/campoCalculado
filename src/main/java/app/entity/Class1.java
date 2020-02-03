package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CLASS1
* @generated
*/
@Entity
@Table(name = "\"CLASS1\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Class1")
public class Class1 implements Serializable {

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
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
    
    private java.lang.String nome;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_class2", nullable = true, referencedColumnName = "fk_class1e2", insertable=true, updatable=true)
    
    private Class2 class2;

    /**
    * Construtor
    * @generated
    */
    public Class1(){
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
    public Class1 setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Class1 setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém class2
    * return class2
    * @generated
    */
    
    public Class2 getClass2(){
        return this.class2;
    }

    /**
    * Define class2
    * @param class2 class2
    * @generated
    */
    public Class1 setClass2(Class2 class2){
        this.class2 = class2;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Class1 object = (Class1)obj;
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