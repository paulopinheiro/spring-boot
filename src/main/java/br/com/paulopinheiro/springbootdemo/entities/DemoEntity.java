package br.com.paulopinheiro.springbootdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class DemoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer id;
    private String label;

    public DemoEntity() {}

    public DemoEntity(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemoEntity)) {
            return false;
        }
        DemoEntity other = (DemoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.paulopinheiro.springbootdemo.entities.DemoEntity[ id=" + id + " ]";
    }
}