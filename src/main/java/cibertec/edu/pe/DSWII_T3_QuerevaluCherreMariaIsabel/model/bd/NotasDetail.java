package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class NotasDetail implements Serializable {

    private String idalumno;
    private String idcurso;


    public NotasDetail() {}

    public NotasDetail(String idalumno, String idcurso) {
        this.idalumno = idalumno;
        this.idcurso = idcurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idalumno, idcurso);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        NotasDetail that = (NotasDetail) obj;
        return Objects.equals(idalumno, that.idalumno) && Objects.equals(idcurso, that.idcurso);
    }
}
