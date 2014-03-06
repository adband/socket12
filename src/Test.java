import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
    public static void main(String[] args) throws IOException {
                boolean h=false;
    String login="";
        String message="";
        boolean c=true;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
         login = bufferRead.readLine();


        if (login.equals("Вася"))        System.out.println("1");
        message = (login.equals("Вася")) ? "Привет" :
                (login == "Директор") ? "Здравствуйте" :
                        (login == "") ? "Нет логина" :"іівівї";
        System.out.println(    message+='2');



    }

}

