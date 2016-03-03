package com.travis;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;
import java.io.*;

public class PKIUtils
{
  private PrivateKey privateKey;
  private PublicKey publicKey;

  public void generateKeys() {
	  
	   try {
		   
	     KeyPairGenerator keyGen = KeyPairGenerator.getInstance( "DSA" );
	     keyGen.initialize( 1024 );
	     KeyPair pair = keyGen.generateKeyPair();
	     this.privateKey = pair.getPrivate();
	     this.publicKey = pair.getPublic();
	     System.out.println( "Public key: " + getString(publicKey.getEncoded() ) );
	     System.out.println( "Private key: " + getString(privateKey.getEncoded() ) );
	   } catch ( Exception e ) {
	     e.printStackTrace();
	   }
  }

  public String sign( String plaintext ) {
	   try
	   {
	     Signature dsa = Signature.getInstance( "SHA1withDSA" );
	     dsa.initSign( privateKey );
	     dsa.update( plaintext.getBytes() );
	     byte[] signature = dsa.sign();
	     return getString( signature );
	   }
	   catch( Exception e )
	   {
	     e.printStackTrace();
	   }
	   return null;
  }

  /*
   * This is the client program
   * What do they have? They have already publicKey handy.
   */
  public boolean verifySignature( String plaintext, String signature )  {
	   try
	   {
	     Signature dsa = Signature.getInstance( "SHA1withDSA" );
	     dsa.initVerify( publicKey );
	
	     dsa.update( plaintext.getBytes() );
	     boolean verifies = dsa.verify( getBytes( signature ) );
	     System.out.println("signature verifies: " + verifies);
	     return verifies;
	   }
	   catch( Exception e )
	   {
	     e.printStackTrace();
	   }
	   return false;
  }

  /**
  * Returns true if the specified text is encrypted, false otherwise
  */
  public static boolean isEncrypted( String text ) {
	   // If the string does not have any separators then it is not
	   // encrypted
	   if( text.indexOf( '-' ) == -1 )
	   {
	     ///System.out.println( "text is not encrypted: no dashes" );
	     return false;
	   }
	
	   StringTokenizer st = new StringTokenizer( text, "-", false );
	   while( st.hasMoreTokens() )
	   {
	     String token = st.nextToken();
	     if( token.length() > 3 )
	     {
	      return false;
	     }
	     for( int i=0; i<token.length(); i++ )
	     {
	      if( !Character.isDigit( token.charAt( i ) ) )
	      {
	        return false;
	      }
	     }
	   }
	   //System.out.println( "text is encrypted" );
	   return true;
  }

  private static String getString( byte[] bytes ) {
	   StringBuffer sb = new StringBuffer();
	   for( int i=0; i<bytes.length; i++ )
	   {
	     byte b = bytes[ i ];
	     sb.append( ( int )( 0x00FF & b ) );
	     if( i+1 <bytes.length )
	     {
	      sb.append( "-" );
	     }
	   }
	   return sb.toString();
  }

  private static byte[] getBytes( String str ) {
	   ByteArrayOutputStream bos = new ByteArrayOutputStream();
	   StringTokenizer st = new StringTokenizer( str, "-", false );
	   while( st.hasMoreTokens() )
	   {
	     int i = Integer.parseInt( st.nextToken() );
	     bos.write( ( byte )i );
	   }
	   return bos.toByteArray();
  }

  public static void main( String[] args )  {
	   PKIUtils pki = new PKIUtils();
	   pki.generateKeys();
	   String data = "This is a test";
	   String baddata = "This is an test";
	   String signature = pki.sign( data );
	   String badSignature = signature.substring( 0, signature.length() - 1 ) + "1";
	   
	   boolean verifies = pki.verifySignature( data, signature );
	   boolean verifiesBad = pki.verifySignature( data, badSignature );
	   boolean verifiesBad2 = pki.verifySignature( baddata, signature );
	
	   
	   //So, basically we are passing data along with signature together to the client
	   // (consumer). But public key should be given to them earlier to verify 
	   // all the varying signatures.
	   //
	   // How about digital certificates? 
	   //
	   //So public-private key pairs can be used for both encryption and signing of 
	   //messages exchanged between two parties, provided each party has access to 
	   //the other's public key. That leaves the issue of how you get the public key 
	   //in a way that maintains security. Among the various ways of doing this, 
	   //the most widely used is to have one or more trusted third parties vouch 
	   //for the public key. Digital certificates are the mechanism for providing 
	   //public keys in this vouched-for form.
	   // Digital certificate is basically a wrapper around a public key, 
	   //which includes identifying information for the party owning that key. 
	   //This wrapped body is then signed by a trusted third party, and the signature is 
	   //included in the certificate. The trusted third party vouches for the public key 
	   //and identifying information by issuing the certificate with its signature. 
	   //Of course, this leaves the bootstrap issue of how you establish the trusted third 
	   //party's identity. This is generally done by hardcoding certificates for certain 
	   //trusted third parties called issuing authorities into software (such as the JVM).

	   
	   System.out.println( "Data: " + data );
	   System.out.println( "Signature: " + signature );
	   System.out.println( "Verifies (good): " + verifies );
	   System.out.println( "Bad Signature: " + badSignature );
	   System.out.println( "Verifies (bad): " + verifiesBad );
	   System.out.println( "Verifies (bad2): " + verifiesBad2 );
  }
}


