package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Notas;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.NotasDetail;

@Repository
public interface NotasRepository extends JpaRepository<Notas, NotasDetail> {
}