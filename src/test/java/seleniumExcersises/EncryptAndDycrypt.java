package seleniumExcersises;

import org.apache.commons.codec.binary.Base64;

public class EncryptAndDycrypt {
	
	
	public static void main(String[] args) {

	EncryptAndDycrypt ed = new EncryptAndDycrypt();
		
		ed.EncodeEmail();
		ed.DecodeEmail();
		ed.EncodedMobilenumber();
		ed.DecodedMobilenumber();
		
	}
	
	public void EncodeEmail() {
		String mail ="5bdae58257e4d1a4c2d851a6";
		byte[] encodedstring =Base64.encodeBase64(mail.getBytes());
		System.out.println("Encoded mail id : "+ new String (encodedstring));
	}
	
	public void DecodeEmail() {
		String mail ="JU8wZg8rWuUCkrmxWV69xw==";
		byte[] decodedstring =Base64.decodeBase64(mail.getBytes());
		System.out.println("Decoded mail id : "+ new String (decodedstring));
	}
	
	public void EncodedMobilenumber() {
		String mobile ="8767510435";
		byte[] encodedstring =Base64.encodeBase64(mobile.getBytes());
		System.out.println("Encoded Mobile number : "+ new String (encodedstring));
	}
	
	public void DecodedMobilenumber() {
		String mobileno ="ODc2NzUxMDQzNQ==";
		byte[] decodedstring =Base64.decodeBase64(mobileno.getBytes());
		System.out.println("Decoded Mobile number: "+ new String (decodedstring));
	}

}
