package io.github.juliandresbv.jhipster.mg.application.repository;

import io.github.juliandresbv.jhipster.mg.application.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
