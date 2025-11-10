package es.cesguiro.persistance.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import es.cesguiro.domain.repository.entity.BookEntity;
import es.cesguiro.persistance.dao.jpa.entity.BookJpaEntity;
@Mapper
public interface BookMapper {

    BookMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(BookMapper.class);


    @Mapping(target = "publisher", source = "publisher")
    @Mapping(target = "authors", source = "authors")
    BookJpaEntity fromBookEntityToBookJpaEntity(BookEntity bookEntity);

    @Mapping(target = "publisher", source = "publisher")
    @Mapping(target = "authors", source = "authors")
    BookEntity fromBookJpaEntityToBookEntity(BookJpaEntity bookJpaEntity);
}
