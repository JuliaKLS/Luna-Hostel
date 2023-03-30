package repository;

import entity.Hospedagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedagemRepository extends JpaRepository<Hospedagem, Object> {

    Hospedagem delete();
}
