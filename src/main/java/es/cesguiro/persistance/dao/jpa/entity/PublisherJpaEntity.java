package es.cesguiro.persistance.dao.jpa.entity;

import java.io.Serializable;
import java.util.List;

import es.cesguiro.domain.model.Book;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "publishers")
public class PublisherJpaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;
    @OneToMany(mappedBy = "publisher")
    private List<Book> books;
    public PublisherJpaEntity() {
    }
    public PublisherJpaEntity(Long id, String name, String slug) {
        this.id = id;
        this.name = name;
        this.slug = slug;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PublisherJpaEntity other)) {
            return false;
        }
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

}
