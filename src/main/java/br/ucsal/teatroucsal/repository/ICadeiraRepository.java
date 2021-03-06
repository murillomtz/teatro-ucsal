package br.ucsal.teatroucsal.repository;

import br.ucsal.teatroucsal.entity.CadeiraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICadeiraRepository extends JpaRepository<CadeiraEntity, Long> {
}
