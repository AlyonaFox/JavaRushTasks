import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wrapper extends BufferedReader{
    private BufferedReader reader;

    public Wrapper() {
        super(new InputStreamReader( System.in ));
        reader = new BufferedReader( new InputStreamReader( System.in ) );
    }

    public int readInt() {
        try {
            return Integer.parseInt( reader.readLine() );
        } catch (IOException e) {
            return 0;
        }
    }
}
