package es.cesguiro.persistance.dao.jpa.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class BookJpaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    @Column(name = "title_es")
    private String titleEs;
    @Column(name = "title_en")
    private String titleEn;
    @Column(name = "synopsis_es")
    private String synopsisEs;
    @Column(name = "synopsis_en")
    private String synopsisEn;
    @Column(name = "base_price")
    private BigDecimal basePrice;
    @Column(name = "discount_percentage")
    private double discountPercentage;
    private String cover;
    @Column(name = "publication_date")
    private String publicationDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private PublisherJpaEntity publisher;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookAuthorJpaEntity> bookAuthors = new ArrayList<>();

    public BookJpaEntity() {
    }

    

    public BookJpaEntity(Long id, String isbn, String titleEs, String titleEn, String synopsisEs,
            String synopsisEn, BigDecimal basePrice, double discountPercentage, String cover, String publicationDate, List<AuthorJpaEntity> authors) {
        this.id = id;
        this.isbn = isbn;
        this.titleEs = titleEs;
        this.titleEn = titleEn;
        this.synopsisEs = synopsisEs;
        this.synopsisEn = synopsisEn;
        this.basePrice = basePrice;
        this.discountPercentage = discountPercentage;
        this.cover = cover;
        this.publicationDate = publicationDate;
        setAuthors(authors);
    }

    public List<BookAuthorJpaEntity> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<BookAuthorJpaEntity> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public List<AuthorJpaEntity> getAuthors() {
        return bookAuthors.stream().map(BookAuthorJpaEntity::getAuthor).collect(Collectors.toList());
    }

    public void setAuthors(List<AuthorJpaEntity> authors) {
        this.bookAuthors.clear();
        for (AuthorJpaEntity author : authors) {
            BookAuthorJpaEntity bookAuthor = new BookAuthorJpaEntity(this, author);
            this.bookAuthors.add(bookAuthor);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitleEs() {
        return titleEs;
    }

    public void setTitleEs(String titleEs) {
        this.titleEs = titleEs;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getSynopsisEs() {
        return synopsisEs;
    }

    public void setSynopsisEs(String synopsisEs) {
        this.synopsisEs = synopsisEs;
    }

    public String getSynopsisEn() {
        return synopsisEn;
    }

    public void setSynopisisEn(String synopisisEn) {
        this.synopsisEn = synopisisEn;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public PublisherJpaEntity getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherJpaEntity publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BookJpaEntity other)) {
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

