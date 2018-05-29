import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public abstract class Main
{
	public static void main(String[] args)
	{
		final BufferedReader buf;
		
		Connection cn;
		Statement st;
		
		String line;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection("jdbc:mysql://localhost/lorann?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
			st = cn.createStatement();
			
			buf = new BufferedReader(new InputStreamReader(new FileInputStream("map.txt")));
			
			for (int y = 0; y < 12; y++)
			{
				line = buf.readLine();
	        	
	        	if (line != null)
	        	{
		            for (int x = 0; x < line.toCharArray().length; x++)
		            	st.executeUpdate("INSERT INTO levels VALUES (" + x + ", " + y + ", " + 1 + ", \"" + line.toCharArray()[x] + "\");");
	        	}
			}
			
			st.close();
			cn.close();
		}
		catch (SQLException e)
		{
		}
		catch (ClassNotFoundException e)
		{
		}
		catch (FileNotFoundException e)
		{
		}
		catch (IOException e)
		{
		}
	}
}
