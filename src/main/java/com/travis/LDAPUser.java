package com.travis;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.directory.InitialDirContext;

//import com.canpar.webpublic.LDAPUser;

public class LDAPUser {
	public boolean isValidUser(String login, String password) {
		boolean res = false;

		if (login == null || password == null || login.trim().length() == 0
				|| password.trim().length() == 0)
			return res;

		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://CPPORTALNDS:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_CREDENTIALS, password);
		try {
			env.put(Context.SECURITY_PRINCIPAL, "cn=" + login
					+ ",ou=Customers,ou=USERS,o=PORTAL");
			new InitialDirContext(env);
			res = true;
		} catch (Exception e1) {
			try {
				env.put(Context.SECURITY_PRINCIPAL, "cn=" + login
						+ ",ou=Canpar,ou=USERS,o=PORTAL");
				new InitialDirContext(env);
				res = true;
			} catch (Exception e2) {
			}
		}

		return res;
	}
	
	
	public static void main(String[] args) {

		boolean bb = new LDAPUser().isValidUser("travis_choi", "wE234567@");
		
		System.out.println("testing..." + bb);
		
		
	}
	
}