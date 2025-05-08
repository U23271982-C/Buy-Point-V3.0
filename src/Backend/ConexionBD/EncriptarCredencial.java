package Backend.ConexionBD;

import javax.crypto.*;
import javax.crypto.spec.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncriptarCredencial {
    private static final String ENCRYPTION_KEY = "1234567891234567";

    public static String encrypt(String value) throws Exception {
        SecretKeySpec key = new SecretKeySpec(
                ENCRYPTION_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(value.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static void main(String[] args) {
        try {
            String usuario = "sa";
            String password = "TuPasswordSegura123";

            System.out.println("Usuario encriptado: ENC(" + encrypt(usuario) + ")");
            System.out.println("Password encriptado: ENC(" + encrypt(password) + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
