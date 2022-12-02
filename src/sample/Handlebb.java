package sample;

public class Handlebb {
    private String cadena;

    public Handlebb(String cadena){
        this.cadena=cadena;
    }
    String quitarcomillas(){
        char temp[] = cadena.toCharArray();
        String resultado="";
        for(int i=1 ; i<cadena.length()-1;i++){

            resultado  += String.valueOf(temp[i]);
        }

        return resultado;
    }
}
