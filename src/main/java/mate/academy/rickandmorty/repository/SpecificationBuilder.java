package mate.academy.rickandmorty.repository;

import mate.academy.rickandmorty.dto.CharacterSearchParameters;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationBuilder<T> {
    Specification<T> build(CharacterSearchParameters searchParameters);
}
