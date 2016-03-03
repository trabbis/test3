package com.travis;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//import org.myorg.SystemUnavailableException;
//import sun.misc.BASE64Encoder;
//import sun.misc.CharacterEncoder;
public final class PasswordService
{
  private static PasswordService instance;
  private PasswordService()
  {
  }
  
  public static void main(String[] argv) throws Exception {
//	  String plainText = "canpar";
	  
	  System.out.println("Encrypt(canpar)..." + PasswordService.getInstance().encrypt("canpar") );
	  System.out.println("Encrypt(DSONVUbpXWZJ1Lx+DKe/c9oOvHs=)..." + PasswordService.getInstance().encrypt("DSONVUbpXWZJ1Lx+DKe/c9oOvHs=") );
	  
	  
	  
  }
  public synchronized String encrypt(String plaintext) throws Exception
  {
    MessageDigest md = null;
    try
    {
      md = MessageDigest.getInstance("SHA"); //step 2
    }
    catch(NoSuchAlgorithmException e)
    {
      throw new Exception(e.getMessage());
    }
    try
    {
      md.update(plaintext.getBytes("UTF-8")); //step 3
    }
    catch(UnsupportedEncodingException e)
    {
    	throw new Exception(e.getMessage());
    }
    byte raw[] = md.digest(); //step 4
//    String hash = (new BASE64Encoder()).encode(raw); //step 5
//    return hash; //step 6
    return null;
  }
  
  
  public static synchronized PasswordService getInstance() //step 1
  {
    if(instance == null)
    {
      return new PasswordService();
    } 
    else    
    {
      return instance;
    }
  }
}

