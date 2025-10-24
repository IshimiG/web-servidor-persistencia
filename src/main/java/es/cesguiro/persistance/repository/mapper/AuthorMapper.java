package es.cesguiro.persistance.repository.mapper;

import es.cesguiro.domain.repository.entity.AuthorEntity;
import es.cesguiro.persistance.dao.jpa.entity.AuthorJpaEntity;

public class AuthorMapper {
    private static AuthorMapper instance;

    private AuthorMapper() {}

    public static AuthorMapper getInstance() {
        if (instance == null) {
            instance = new AuthorMapper();
        }
        return instance;
    }

    public AuthorJpaEntity fromAuthroEntityToAuthorJpaEntity(AuthorEntity authorEntity) {
        if (authorEntity == null) {
            return null;
        }
        return new AuthorJpaEntity(
                authorEntity.id(),
                authorEntity.name(),
                authorEntity.nationality(),
                authorEntity.biographyEs(),
                authorEntity.biographyEn(),
                authorEntity.birthYear(),
                authorEntity.deathYear(),
                authorEntity.slug()
        );
    }

    public AuthorEntity fromAuthorJpaEntityToAuthorEntity(AuthorJpaEntity authorJpaEntity) {
        if (authorJpaEntity == null) {
            return null;
        }
        return new AuthorEntity(authorJpaEntity.getId(),
                authorJpaEntity.getName(), 
                authorJpaEntity.getNationality(), 
                authorJpaEntity.getBiographyEs(), 
                authorJpaEntity.getBiographyEn(), 
                authorJpaEntity.getBirthYear(), 
                authorJpaEntity.getDeathYear(), 
                authorJpaEntity.getSlug());
    }

}
