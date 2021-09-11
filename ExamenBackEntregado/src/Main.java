import com.backend.dao.config.ConfigurationJDBC;
import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.model.Odontologo;
import com.backend.service.OdontologoService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2(new ConfigurationJDBC()));
        Odontologo odontologo1 = new Odontologo("Patricia", "Damiani", 9895292);
        Odontologo odontologo2 = new Odontologo("Cristina", "Albornoz", 9895285);


        odontologoService.limpiar();

        odontologoService.guardar(odontologo1);
        odontologoService.guardar(odontologo2);

        List<Odontologo> odontologos = odontologoService.listarTodos();

        for (Odontologo od : odontologos) {
            System.out.println(od.getID() + " - " + od.getNombre() + " - " + od.getApellido() + " - " + od.getMatricula());
            //System.out.println(od.toString());
        }

    }
}