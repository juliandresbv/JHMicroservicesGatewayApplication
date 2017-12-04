package io.github.juliandresbv.jhipster.mg.application.repository.search;

import io.github.juliandresbv.jhipster.mg.application.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {
}
