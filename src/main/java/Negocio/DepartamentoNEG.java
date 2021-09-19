package Negocio;

import Datos.DepartamentoDTO;
import Entidad.DepartamentoMOD;

import java.util.List;

public class DepartamentoNEG {

    private DepartamentoDTO departamentoDTO;
    public List<DepartamentoMOD> Listardepartamentos(Integer id){
        return departamentoDTO.Listardepartamentos(id);
    }
}
