import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EJBFactory {
	public static Object getEJB(String jndipath) throws NamingException {
		Properties jndiProperties = new Properties();
		jndiProperties.put(Context.URL_PKG_PREFIXES,
				"org.jboss.ejb.client.naming");
		jndiProperties.put("jboss.naming.client.ejb.context", true);
		final Context context = new InitialContext(jndiProperties);
		return context.lookup(jndipath);
	}

}

