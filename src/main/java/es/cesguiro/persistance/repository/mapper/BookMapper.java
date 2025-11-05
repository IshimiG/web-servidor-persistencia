package es.cesguiro.persistance.repository.mapper;

import es.cesguiro.domain.repository.entity.BookEntity;
import es.cesguiro.persistance.dao.jpa.entity.BookJpaEntity;

public class BookMapper {

    private static BookMapper instance;

    private BookMapper() {}

    public static BookMapper getInstance() {
        if (instance == null) {
            instance = new BookMapper();
        }
        return instance;
    }

    public BookJpaEntity fromBookEntityToBookJpaEntity (BookEntity bookEntity) {
        if (bookEntity == null) {
            return null;
        }
        return new BookJpaEntity(
            bookEntity.id(),
            bookEntity.isbn(),
            bookEntity.titleEs(), 
            bookEntity.titleEn(), 
            bookEntity.synopsisEs(), 
            bookEntity.synopsisEn(), 
            bookEntity.basePrice(), 
            bookEntity.discountPercentage(), 
            bookEntity.cover(), 
            bookEntity.publicationDate(), 
            bookEntity.authors()
            );
    }

    public BookEntity fromBookJpaEntityToBookEntity(BookJpaEntity bookJpaEntity) {
        if (bookJpaEntity == null) {
            return null;
        }
        return new BookEntity(
            bookJpaEntity.getId(),
            bookJpaEntity.getIsbn(),
            bookJpaEntity.getTitleEs(),
            bookJpaEntity.getTitleEn(),
            bookJpaEntity.getSynopsisEs(),
            bookJpaEntity.getSynopsisEn(),
            bookJpaEntity.getBasePrice(),
            bookJpaEntity.getDiscountPercentage(),
            bookJpaEntity.getCover(),
            bookJpaEntity.getPublicationDate(),
            bookJpaEntity.getAuthors()
        );
    }
}
