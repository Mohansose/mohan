package adactin.co;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class conf_Reader {
public static Properties p;
public conf_Reader() throws IOException {
	File a=new File("C:\\Users\\MOHAN\\Test\\Configuration.properties");
	FileInputStream b=new FileInputStream(a);
	p=new Properties();
	p.load(b);
}	

public String getinput() {
String user3 = p.getProperty("input17");
return user3;
}
public String getusername() {
String user = p.getProperty("username");
return user;
}
 public String getpassword() {
String user1 = p.getProperty("password");
return user1;
}
public String getinputvalue1() {
String c = p.getProperty("inputvalue1");
return c;
}
public String getinputvalue2() {
String d = p.getProperty("inputvalue2");
return d;
}
public String getinputvalue3() {
String e = p.getProperty("inputvalue3");
return e;
}
public String getinputvalue4() {
String f = p.getProperty("inputvalue4");
return f;
}
public String getinputvalue5() {
String g = p.getProperty("inputvalue5");
return g;
}
public String getinputvalue6() {
String h = p.getProperty("inputvalue6");
return h;
}
public String getinputvalue7() {
String i = p.getProperty("inputvalue7");
return i;

}
public String getinputvalue8() {
String j = p.getProperty("inputvalue8");
return j;
}
public String getinputvalue9() {
String K = p.getProperty("inputvalue9");
return K;
}
public String getinputvalue10() {
String l = p.getProperty("inputvalue10");
return l;
}
public String getinputvalue11() {
String m = p.getProperty("inputvalue11");
return m;
}
public String getinputvalue12() {
String n = p.getProperty("inputvalue12");
return n;
}
public String getinputvalue13() {
String o = p.getProperty("inputvalue13");
return o;
}
public String getinputvalue14() {
String q = p.getProperty("inputvalue14");
return q;
}
}

