/**
 * 
 */
/**
 * 
 */
module CoreJava {
    requires com.fasterxml.jackson.databind;

	requires jakarta.xml.bind;
	requires java.sql;
	
    opens com.sadhak.corejava.xml to jakarta.xml.bind;

    exports com.sadhak.corejava.json;
}