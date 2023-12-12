import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AESDecryptor {
    public static String decrypt(String ciphertext, String key, String iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8)));

        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(ciphertext));
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws Exception {
        String ciphertext = "9ce44f88a25272b6d9cbb430ebbcfcf1";
        String key = "your_AES_key_32_bytes";
        String iv = "your_initialization_vector_16_bytes";

        String decryptedData = decrypt(ciphertext, key, iv);
        System.out.println(decryptedData);
    }
}
