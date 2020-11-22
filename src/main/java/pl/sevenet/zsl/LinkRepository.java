package pl.sevenet.zsl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface LinkRepository extends CrudRepository<Link, Long> {
}

