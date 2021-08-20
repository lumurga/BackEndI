package integrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;



public class Test {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            +"("
            + " ID INT PRIMARY KEY, "
            + " PRIMER_NOMBRE varchar(100) NOT NULL, "
            + " APELLIDO varchar(100) NOT NULL, "
            + " EDAD INT NOT NULL "
            +")";

    private static final String SQL_INSERT = "INSERT INTO USUARIO (ID, PRIMER_NOMBRE,APELLIDO, EDAD) VALUES (1, 'Francisco','Robles',21)";
    private static final String SQL_INSERT2 = "INSERT INTO USUARIO (ID, PRIMER_NOMBRE,APELLIDO, EDAD) VALUES (2, 'Agustín','Bravo',20)";
    private static final String SQL_INSERT3 = "INSERT INTO USUARIO (ID, PRIMER_NOMBRE,APELLIDO, EDAD) VALUES (3, 'Lucía','Miloro',27)";
    private static final String SQL_INSERT4 = "INSERT INTO USUARIO (ID, PRIMER_NOMBRE,APELLIDO, EDAD) VALUES (4, 'Juan','Arias', 19)";

    private static final String SQL_DELETE = "DELETE FROM USUARIO WHERE ID=2"; /* ? */

    private static  final Logger logger = Logger.getLogger(String.valueOf(Test.class));


    public static void main(String[] args) throws Exception{
        Connection connection = null;
        //connection = getConnection();
        ;
        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);


            statement.execute(SQL_INSERT);


            statement.execute(SQL_INSERT2);


            statement.execute(SQL_INSERT3);


            statement.execute(SQL_INSERT4);

            logger.info("Se insertaron registros");

            Statement statementDEL = connection.createStatement();
            statementDEL.execute(SQL_DELETE);

            logger.info("Se eliminó el usuario con el ID 2");

        } catch(Exception e){

        } finally {
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/test2");
    }
}
