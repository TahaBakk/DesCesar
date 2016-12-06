/**
 * Created by PC (taha) on 06/12/2016.
 */
public class Main {


    public static void main(String[] args) {
        //le pasamos el texto y codigo para que lo descifre
        String texto = "Twzmu Qxacu Vmycm xwzzw ycqayciu mab ycq lwtwzmu qxacu ycqi lwtwz aqb iumb, kwvamkbmbcz, ilqxqakq dmtqb...Vw pig vilqm ycm ium mt lwtwz uqauw, ycm tw jcaycm, tw mvkcmvbzm g tw ycqmzi, aquxtmumvbm xwzycm ma mt lwtwz.\" Twzmu qxacu lwtwz aqb iumb, kwvamkbmbcz ilqxqakqvo mtqb. Cb xpizmbzi xczca mc tmkbca tiwzmmb, mb nickqjca czvi bmuxwz. Ycqaycm dwtcbxib vqjp ib lcq zcbzcu twjwzbqa ib ycqa uiczqa. Ycqaycm qv amu cb mzib mtmumvbcu jqjmvlcu i aqb iumb vqat. Xzimamvb quxmzlqmb, izkc vmk bqvkqlcvb bmuxca, ivbm mzib mnnqkqbcz wzkq, aml bmuxca tqjmzw uiovi vmk izkc. Viu nickqjca vqjp lqiu, vmk kwvamkbmbcz vmycm ctbzqkma ik. Kzia xctdqviz tikqvqi xwzbi. Viu mtmumvbcu mab vmk izkc aioqbbqa, mc ozidqli vqat zpwvkca. Xzwqv cb vqjp ycqa mvqu uwttqa akmtmzqaycm. Qvbmzlcu mb uitmacili niuma ik ivbm qxacu xzquqa qv nickqjca. Qvbmomz wzvizm twzmu momb lwtwz bmuxca, dmt dmabqjctcu aixqmv lqkbcu. Vcttiu dmpqkcti ib izkc momb ozidqli. Cb xpizmbzi xczca mb dizqca mtmumvbcu. Lwvmk vmk mcqauwl ivbm, aml bqvkqlcvb aixqmv. Viu uiaai uiaai, awttqkqbclqv ycqa czvi i, uwttqa jqjmvlcu uq. Aml vmk rcabw qv ivbm lixqjca twjwzbqa nikqtqaqa ib bwzbwz. ";
        int codigo = 8;

        System.out.println("El texto descifrado es: \n");
        System.out.println(descifrado(texto, codigo));
    }

    
    //descifrar el texto
    public static String descifrado(String texto, int codigo) {
        //Utilizo el string builder para concatenar las letras en una frase con el "append" para no usar el += (y asi aprendo a usar cosas nuevas)
        StringBuilder textoDescifrado = new StringBuilder();
        codigo = codigo % 26;//aqui hacemos el mod al codigo introducido por nosotros "8" con la cantidad de letras a comparar "26"
        for (int i = 0; i < texto.length(); i++) {

                //En este caso si las letras son minusculas entra en el if y no descifra la letra en minuscula
                if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                    if ((texto.charAt(i) - codigo) < 'a') {
                        textoDescifrado.append((char) (texto.charAt(i) - codigo + 26));
                    } else {
                        textoDescifrado.append((char) (texto.charAt(i) - codigo));
                    }
                //En este caso si las letras son mayusculas nos pondra la letra en mayuscula
                } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                    if ((texto.charAt(i) - codigo) < 'A') {
                        textoDescifrado.append((char) (texto.charAt(i) - codigo + 26));
                    } else {
                        textoDescifrado.append((char) (texto.charAt(i) - codigo));
                    }
                //sino es ninguna opcion de las anteriores sera un espacio asi que lo añadimos
                }else {
                    textoDescifrado.append(" ");
                }
        }
        return textoDescifrado.toString();
    }
}





