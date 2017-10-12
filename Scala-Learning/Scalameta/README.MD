You can use following maven commands to run your application.
#Run Java Program 
mvn exec:java -Dexec.mainClass="com.jhh.Main"  
mvn exec:java -Dexec.mainClass="akka.Main" -Dexec.args="com.jhh.HelloWorld" 

#Run Scala Program
mvn scala:run -DmainClass=com.jhh.App -DaddArgs="arg1|arg2|arg3"