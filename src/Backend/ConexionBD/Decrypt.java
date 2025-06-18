package Backend.ConexionBD;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Decrypt {
    private static final String ENCRYPTION_KEY = "1234567891234567";
    //Descencriptamos las credenciales para la conexion a la bd
    public static String decrypt(String encryptedText) throws Exception {
        if (encryptedText == null || encryptedText.isEmpty()) {
            return "";
        }

        SecretKeySpec key = new SecretKeySpec(
                ENCRYPTION_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(
                Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }
}
