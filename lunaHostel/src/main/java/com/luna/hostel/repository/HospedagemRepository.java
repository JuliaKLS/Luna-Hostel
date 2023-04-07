package com.luna.hostel.repository;

import com.luna.hostel.entity.Hospedagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HospedagemRepository extends JpaRepository<Hospedagem, Object> {

    List<Hospedagem> findByDataDeEntradaLessThanEqualAndDataDeSaidaGreaterThanEqual(LocalDate dt1, LocalDate dt2);

}
