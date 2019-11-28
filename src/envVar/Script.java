package envVar;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Script {

	public static void main(String[] args) throws NamingException {

		// Context ctx = new InitialContext();
		// Context envCtx = (Context)ctx.lookup("java:comp/env");
		// DataSource ds = (DataSource)envCtx.lookup("foo");

		String pere = "Mon PÃ¨re";
		HashMap params = new HashMap();
		
		try {
		    System.out.println(new String(pere.getBytes(), "windows-1252"));
		    String value = new String(pere.getBytes("ISO-8859-1"), "UTF-8"); 
		    System.out.println(value);
		} catch (UnsupportedEncodingException e) {
		    // not going to happen - value came from JDK's own StandardCharsets
		}
		

	}

}
