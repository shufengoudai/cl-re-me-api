package com.amis.api.admin.util;

import java.util.HashMap;
import java.util.Map;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.util.StringUtils;

/** 密码相关的工具类 */
public class PasswordUtils {

  // generate salt seed
  public static final int SALT_SEED = 13;
  // the head fo salt
  public static final String SALT_STARTSWITH = "$2a$13";

  public static final String SALT_KEY = "salt";

  public static final String CIPHER_KEY = "cipher";

  public static String hashPassword(String password_plaintext) {
    String salt = BCrypt.gensalt(SALT_SEED);
    String password = "";
    Map<String, String> bCryptResult = ecrypt(salt, password_plaintext);
    for (Map.Entry<String, String> entry : bCryptResult.entrySet()) {
      if (entry.getKey().equals("cipher")) {
        password = (String) entry.getValue();
      }
    }
    return password;
  }

  public static boolean checkPassword(String password_plaintext, String stored_hash) {
    String passwords = "";
    String salt = stored_hash.substring(0, 29);
    Map<String, String> bCryptResult = ecrypt(salt, password_plaintext);
    for (Map.Entry<String, String> entry : bCryptResult.entrySet()) {
      if (entry.getKey().equals("cipher")) {
        passwords = (String) entry.getValue();
      }
    }
    if (!stored_hash.equals(passwords)) {
      return false;
    }
    return true;
  }

  /**
   * @param salt encrypt salt, Must conform to the rules
   * @param encryptSource
   * @return
   */
  public static Map<String, String> ecrypt(final String salt, final String encryptSource) {
    Map<String, String> bcryptResult = new HashMap<String, String>();
    if (StringUtils.isEmpty(encryptSource)) {
      return bcryptResult;
    }

    if (StringUtils.isEmpty(salt)) {
      return bcryptResult;
    }
    if (!salt.startsWith(SALT_STARTSWITH)) {
      return bcryptResult;
    }

    String cipher = BCrypt.hashpw(encryptSource, salt);
    bcryptResult.put(SALT_KEY, salt);
    bcryptResult.put(CIPHER_KEY, cipher);
    return bcryptResult;
  }

  public static void main(String[] args) {
    String ccc = hashPassword("aaaa");
    System.out.println(ccc);
  }
}
