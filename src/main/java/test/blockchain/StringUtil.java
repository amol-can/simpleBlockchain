package test.blockchain;
import java.security.MessageDigest;

public class StringUtil {
	//Applies SHA256 to a string and return the result
	public static String applySha(String input) {
		try {
			MessageDigest digest=MessageDigest.getInstance("SHA-256");
			//Apply sha to input
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			int i;
			for(i = 0; i < hash.length;i++);{
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return input;
	}
}
