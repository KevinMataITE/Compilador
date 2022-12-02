package kevin.parser;
import java.lang.Runtime;

public class ExceptionErrordedeclaracion extends RuntimeException {
    private String renglon;
    private String token;

    public ExceptionErrordedeclaracion(String token){

        System.out.println("No esta delcarada tu madre" + token);
    }
}
