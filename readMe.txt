Java Servlet-3.0 Specification (PDF-Download)
	http://download.oracle.com/otndocs/jcp/servlet-3.0-mrel-eval-oth-JSpec/

Jersey-Dokumentation
	https://jersey.java.net/documentation/latest/deployment.html#deployment.servlet.3

Tutorial mit dem gestartet wurde
	http://www.vogella.com/tutorials/REST/article.html
	
	
Hibernate
	http://hibernate.org/
	
	Ich habe nur die required Libs von Hibernate nach WEB-INF\lib kopiert
	Die hibernate.cfg.xml habe ich zum Testen auf hsqldb (hsqldb.jar) eingestellt.
	Mit dem HyperSQL Viewer (runManagerSwing.bat) sieht man, schön, das die Einträge tatsächlich geschrieben wurden!
	

Ausprobieren:
	Das WAR auf einem Tomcat starten und die URL "http://localhost:8080/MyRestfulProject/resources/hello" ansurfen.
	Danach wird die Datenbank (derzeit unter c:\ds-hypersql\) erzeugt
	Die Ausgaben erfolgen aktuell nur im Console-Log, nicht auf der angesurften Website.


SQLs
------------------------
Tables einsehen
------------------------
SELECT *
FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_TYPE = 'BASE TABLE' 