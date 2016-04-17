最后运行代码
mvn 执行java的类
mvn exec:java -Dexec.mainClass="com.jhh.Main"
mvn exec:java -Dexec.mainClass="akka.Main" -Dexec.args="com.jhh.HelloWorld" 

mvn 执行scala的类
mvn scala:run -DmainClass=com.jhh.App -DaddArgs="arg1|arg2|arg3"