package ru.serdyuk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.serdyuk.domian.Question;


@RepositoryRestResource(path="items",collectionResourceRel = "items")
public interface QuestionRepository extends JpaRepository<Question,Long> {

}
