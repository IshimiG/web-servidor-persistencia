package es.cesguiro.persistance.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.cesguiro.domain.repository.entity.PublisherEntity;
import es.cesguiro.persistance.dao.jpa.entity.PublisherJpaEntity;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherJpaEntity publisherEntityToPublisherJpaEntity(PublisherEntity publisherEntity);

    PublisherEntity publisherJpaEntityToPublisherEntity(PublisherJpaEntity publisherJpaEntity);
}
