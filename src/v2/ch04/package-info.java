/**
 * 数据库编程：介绍了Java链接数据库并使用SQL完成对数据库的查询和更新。
 * 
 * JDBC的设计：根据API编写的程序可以与驱动管理器通信，而驱动管理器则通过驱动程序与实际的数据库通信。
 * 	JDBC驱动程序类型
 * 	JDBC的典型用法：应用开发中JDBC一般位于业务层后面。
 * 结构化查询语言：主要介绍了SQL常用语句。
 * JDBC配置
 * 	数据库URL
 * 	驱动程序JAR文件
 * 	启动数据库
 * 	注册驱动器类
 * 	连接到数据库
 * 执行SQL语句:先后注册驱动程序创建Connection对象，在创建Statement对象执行sql语句。
 * 	管理链接、语句和结果集
 * 	分析SQL异常
 * 	组装数据库
 * 执行查询操作：对于效率而言使用SQL解决的问题就不要使用Java程序。
 * 	预备语句：PreparedStatement
 * 	读写LOB：二进制大对象称为BLOB，字符型大对象称为BLOB。
 * 	SQL转义
 * 	多结果集
 * 	获取自动生成键
 * 可滚动和可更新的结果集
 * 	可滚动的结果集
 * 	可更新的结果集
 * 行集(RowSet)
 * 	构建行集
 * 	被缓存的行集：数据库断开链接后仍然可以操作。
 * 元数据：在数据库中描述数据库或其组成部分的数据称为元数据。
 * 事务
 * 	保存点
 * 	批量更新
 * 	高级SQL类型：JNDI服务定位数据源。
 * Web和企业应用中的链接管理
 * @author niu
 */
package v2.ch04;