package es.cesguiro.persistance.repository.mapper;

import es.cesguiro.domain.repository.entity.PublisherEntity;
import es.cesguiro.persistance.dao.jpa.entity.PublisherJpaEntity;

public class PublisherMapper {
    private static PublisherMapper instace;

    private PublisherMapper() {}

    public static PublisherMapper getInstance() {
        if (instace == null) {
            instace = new PublisherMapper();
        }
        return instace;
    }

    public PublisherJpaEntity fromPublisherEntityToPublisherJpaEntity(PublisherEntity publisherEntity) {
        if (publisherEntity == null) {
            return null;
        }
        return new PublisherJpaEntity(
            publisherEntity.id(),
            publisherEntity.name(),
            publisherEntity.slug()
        );
    }

    public PublisherEntity fromPublisherJpaToPublisherEntity(PublisherJpaEntity publisherJpaEntity) {
        if (publisherJpaEntity == null) {
            return null;
        }
        return new PublisherEntity(
            publisherJpaEntity.getId(), 
            publisherJpaEntity.getName(), 
            publisherJpaEntity.getSlug()
        );
    }
}
