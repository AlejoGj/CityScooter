package rentingscooter.utilities;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class    DateUtil {
    // Clase utilitaria
    /*  Date : manejo de fechas en java dd/MM/yyyy
     * */
    public static LocalDate convertStringToDate (String dateString) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Ajusta el formato según tus necesidades
        LocalDate date = LocalDate.parse(dateString, dateFormat); // Convierte la cadena a LocalDate

        return date; // Retorna el objeto Date convertido
    }

}
