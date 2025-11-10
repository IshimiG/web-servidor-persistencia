package es.cesguiro.persistance.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.cesguiro.domain.repository.entity.AuthorEntity;
import es.cesguiro.persistance.dao.jpa.entity.AuthorJpaEntity;
@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorJpaEntity fromAuthorEntityToAuthorJpaEntity(AuthorEntity authorEntity);
    AuthorEntity fromAuthorJpaEntityToAuthorEntity(AuthorJpaEntity authorJpaEntity);

}
