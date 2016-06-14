# springboot-mybatis

If you are a beginner of springboot framework, and you want to using mybatis in your project.

And I have demos:

- What is the mybatis?

MyBatis 是支持定制化 SQL、存储过程以及高级映射的优秀的持久层框架。MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集。MyBatis 可以对配置和原生Map使用简单的 XML 或注解，将接口和 Java 的 POJOs(Plain Old Java Objects,普通的 Java对象)映射成数据库中的记录。

- Add dependencies to your project

        <!--mybatis-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>1.3.0</version>
        </dependency>

        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.4.0</version>
        </dependency>

- How to using mybatis?

实际中，mybatis的sqlSessionFactory对象既可以通过xml方式构造，也可以通过POJO方式构造。

String resource = "org/mybatis/example/mybatis-config.xml";
InputStream inputStream = Resources.getResourceAsStream(resource);
SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

其中，mybatis-config.xml最好放在resources文件夹下

        <?xml version="1.0" encoding="UTF-8" ?>
        <!DOCTYPE configuration
          PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
        <configuration>
          <environments default="development">
            <environment id="development">
                //事务管理
                <transactionManager type="JDBC"/>

                //连接池
                <dataSource type="POOLED">
                    <property name="driver" value="${driver}"/>
                    <property name="url" value="${url}"/>
                    <property name="username" value="${username}"/>
                    <property name="password" value="${password}"/>
                </dataSource>
            </environment>
        </environments>

        <mappers>
            //映射文件
            <mapper resource="org/mybatis/example/BlogMapper.xml"/>
        </mappers>
        </configuration>

通过sqlSessionFactory工厂类取得sqlSession

        SqlSession sqlSession = SqlSessionFactory.openSession();

由于SqlSession封装了所有的面向对象执行SQL的方法，你可以通过它来执行SQL

        SqlSession session = sqlSessionFactory.openSession();
        try {
          BlogMapper mapper = session.getMapper(BlogMapper.class);
          Blog blog = mapper.selectBlog(101);
        } finally {
          session.close();
        }


当然，以POJO方式，结合注解，在springboot中，使用起来可能更方便一些。

springboot实例：

        @SpringBootApplication
        @EnableAutoConfiguration
        @ImportResource({"springboot-mybatis.xml"})
        @PropertySource(value = "application.properties")
        @ComponentScan
        @MapperScan("com.jim.mybatis.mapper")
        public class SpringbootMybatisApplication {

            @Bean
            @ConfigurationProperties(prefix="spring.datasource")
            public DataSource dataSource() {
                return new org.apache.tomcat.jdbc.pool.DataSource();
            }

            @Bean
            public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
                SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
                sqlSessionFactoryBean.setDataSource(dataSource());
                PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
                sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mappers/*.xml"));
                sqlSessionFactoryBean.setConfigLocation(resolver.getResource("classpath:/mybatis.config.xml"));
                return sqlSessionFactoryBean.getObject();
            }

            @Bean
            public PlatformTransactionManager transactionManager() {
                return new DataSourceTransactionManager(dataSource());
            }


            public static void main(String[] args) {
                SpringApplication.run(SpringbootMybatisApplication.class, args);
            }
        }
 

- How to using mybatis generator plugin?

在intellj idea 中安装mybatis plugin

- Add a new method to Mapper class
- Add a SQL to mapper xml file
- call the new method in impl class
- call service in controller and return result


