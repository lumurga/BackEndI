package test.com.backend;




import com.backend.dao.config.ConfigurationJDBC;
        import com.backend.dao.impl.OdontologoDaoH2;
        import com.backend.model.Odontologo;
        import com.backend.service.OdontologoService;
        import org.junit.Assert;
        import org.junit.Test;

        import org.junit.runner.RunWith;
        import org.junit.runners.JUnit4;

        import java.util.List;

        import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)

public class OdontologoServiceTest {


    @Test
    public void listarTodos( ) {
        OdontologoService odServiceTest = new OdontologoService(new OdontologoDaoH2(new ConfigurationJDBC()));
        Odontologo od1Test = new Odontologo("Patricia", "Damiani", 3654231);
        Odontologo od2Test = new Odontologo("Cristina", "Albornoz", 18346540);
        odServiceTest.limpiar();
        odServiceTest.guardar(od1Test);
        odServiceTest.guardar(od2Test);
        List<Odontologo> odontologos = odServiceTest.listarTodos();
        Assert.assertTrue( !odontologos.isEmpty() );
        Assert.assertTrue( odontologos.size() == 2 );
    }

}