* 使用了 eclipse IDE  

### 步骤
1. 在 pom.xml 添加相应的内容；  
1. 在 application.properties 中配置数据库相关信息；  
1. 在 mysql 建库和建表；  
1. 写 User.java 和 UserMapper.java;  
1. 启动应用后，访问 http://localhost:8080/user，只能访问一次；再次访问会向数据库中再插入一条记录，会报错：TooManyResultsException: Expected one result (or null) to be returned by selectOne(), but found: [重复记录个数]；可将数据表中的重复记录删除，再访问。  

* 使用 junit 测试（ApplicationTests.java）,记录会回滚，可多次执行。
