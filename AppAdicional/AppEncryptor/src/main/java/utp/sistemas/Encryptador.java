package utp.sistemas;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encryptador {

    private static final String CLAVE_SECRETA = "1234567891234567";

    public static String encryptar(String texto) throws Exception {
        SecretKeySpec key = new SecretKeySpec(
                CLAVE_SECRETA.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(texto.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
}
