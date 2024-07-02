package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Pagos;

@Repository
public interface PagosRepository extends JpaRepository<Pagos,String> {
}
